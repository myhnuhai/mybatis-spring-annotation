package com.jsjty.core.excel;

import com.jsjty.util.StringUtil;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 马英虎 on 2014/11/21.
 */
public class ExcelTemplate {

    private final static Logger logger = Logger.getLogger(ExcelTemplate.class);

    private List<HSSFCell> staticObject = null;
    private List<HSSFCell> parameterObjct = null;
    private List<HSSFCell> fieldObjct = null;
    private List<HSSFCell> variableObject = null;
    private String templatePath = null;

    public ExcelTemplate(String pTemplatePath) {
        templatePath = pTemplatePath;
    }

    public ExcelTemplate() {
    }


    /**
     * 解析Excel模板
     */
    public void parse(HttpServletRequest request) {
        staticObject = new ArrayList();
        parameterObjct = new ArrayList();
        fieldObjct = new ArrayList();
        variableObject = new ArrayList();
        if(StringUtil.isEmpty(templatePath)){
            logger.error("Excel模板路径不能为空!");
        }
        InputStream is = request.getSession().getServletContext().getResourceAsStream(templatePath);
        if(StringUtil.isEmpty(is)){
            logger.error("未找到模板文件,请确认模板路径是否正确[" + templatePath + "]");
        }
        HSSFWorkbook workbook = null;
        try {
            POIFSFileSystem fs = new POIFSFileSystem(is);
            workbook = new HSSFWorkbook(fs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        HSSFSheet hssfSheet = workbook.getSheetAt(0);
        if (StringUtil.isNotEmpty(hssfSheet)) {
            int rowNum = hssfSheet.getLastRowNum();
            for (int row = 0; row <= rowNum; row++) {
                HSSFRow hssfRow = hssfSheet.getRow(row);
                if(!StringUtil.isEmpty(hssfRow)){
                    int cellNum = hssfRow.getLastCellNum();
                    for(int cell = 0; cell < cellNum; cell++){
                        HSSFCell hssfCell = hssfRow.getCell(cell);
                        logger.info(hssfCell == null);
                        if(!StringUtil.isEmpty(hssfCell)){
                            String cellValue = hssfCell.getStringCellValue();
                            if (!StringUtil.isEmpty(cellValue)) {
                                if (cellValue.indexOf("$P") != -1 || cellValue.indexOf("$p") != -1) {
                                    addParameterObjct(hssfCell);
                                }else {
                                    addStaticObject(hssfCell);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            logger.error("模板工作表对象不能为空!");
        }
    }

    /**
     * 增加一个静态文本对象
     */
    public void addStaticObject(HSSFCell cell) {
        staticObject.add(cell);
    }

    /**
     * 增加一个参数对象
     */
    public void addParameterObjct(HSSFCell cell) {
        parameterObjct.add(cell);
    }

    public List<HSSFCell> getStaticObject() {
        return staticObject;
    }

    public List<HSSFCell> getParameterObjct() {
        return parameterObjct;
    }

    public List<HSSFCell> getFieldObjct() {
        return fieldObjct;
    }

    public List<HSSFCell> getVariableObject() {
        return variableObject;
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }
}
