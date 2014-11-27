package com.jsjty.core.excel;

import com.jsjty.util.StringUtil;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by 马英虎 on 2014/11/21.
 */
public class ExcelFiller {


    /**
     * Excel模板数据类型<br>
     * number:数字类型
     */
    public static final String ExcelTPL_DataType_Number = "number";

    /**
     * Excel模板数据类型<br>
     * number:文本类型
     */
    public static final String ExcelTPL_DataType_Label = "label";

    private final static Logger logger = Logger.getLogger(ExcelFiller.class);

    private ExcelTemplate excelTemplate = null;

    private ExcelData excelData = null;

    public ExcelFiller() {
    }

    /**
     * 构造函数
     *
     * @param pExcelTemplate
     * @param pExcelData
     */
    public ExcelFiller(ExcelTemplate pExcelTemplate, ExcelData pExcelData) {
        setExcelData(pExcelData);
        setExcelTemplate(pExcelTemplate);
    }


    /**
     * 数据填充 将ExcelData填入excel模板
     *
     * @return ByteArrayOutputStream
     */
    public HSSFWorkbook fill(HttpServletRequest request) {
        logger.info("-----------------");
        HSSFSheet wSheet = null;
        HSSFWorkbook  workbook = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            InputStream is = request.getSession().getServletContext().getResourceAsStream(getExcelTemplate().getTemplatePath());
            POIFSFileSystem fs = new POIFSFileSystem(is);
            workbook = new HSSFWorkbook(fs);

            wSheet = workbook.getSheetAt(0);
            fillStatics(wSheet);
            fillParameters(wSheet);
        } catch (Exception e) {
            logger.error("基于模板生成可写工作表出错了!");
            e.printStackTrace();
        }
        return workbook;
    }

    private void fillStatics(HSSFSheet hssfSheet) {

        List<HSSFCell> cellList =  getExcelTemplate().getStaticObject();

        for (HSSFCell hssfCell : cellList) {
            HSSFCell cell = hssfSheet.getRow(hssfCell.getRowIndex()).getCell(hssfCell.getColumnIndex());
            cell.setCellValue(hssfCell.getStringCellValue());
        }
    }

    private void fillParameters(HSSFSheet hssfSheet) {
        List<HSSFCell> cellList = getExcelTemplate().getParameterObjct();
        Map<String,String> parameters = getExcelData().getParameters();
        for (HSSFCell hssfCell : cellList) {
            HSSFCell cell = hssfSheet.getRow(hssfCell.getRowIndex()).getCell(hssfCell.getColumnIndex());

            String cellValue = hssfCell.getStringCellValue();
            String key = getKey(cellValue);
            String type = getType(cellValue);

            if(type.equalsIgnoreCase(ExcelTPL_DataType_Number)){
                    cell.setCellValue(parameters.get(key));
            }else{
                cell.setCellValue(parameters.get(key));
            }
        }
    }

    /**
     * 获取模板键名
     *
     * @param pKey
     *            模板元标记
     * @return 键名
     */
    private static String getKey(String pKey) {
        String key = null;
        int index = pKey.indexOf(":");
        if (index == -1) {
            key = pKey.substring(3, pKey.length() - 1);
        } else {
            key = pKey.substring(3, index);
        }
        return key;
    }

    /**
     * 获取模板单元格标记数据类型
     *
     * @param pType
     *            模板元标记
     * @return 数据类型
     */
    private static String getType(String pType) {
        String type = ExcelTPL_DataType_Label;
        if (pType.indexOf(":n") != -1 || pType.indexOf(":N") != -1) {
            type = ExcelTPL_DataType_Number;
        }
        return type;
    }


    public ExcelTemplate getExcelTemplate() {
        return excelTemplate;
    }

    public void setExcelTemplate(ExcelTemplate excelTemplate) {
        this.excelTemplate = excelTemplate;
    }

    public ExcelData getExcelData() {
        return excelData;
    }

    public void setExcelData(ExcelData excelData) {
        this.excelData = excelData;
    }
}
