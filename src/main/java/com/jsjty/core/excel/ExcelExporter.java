package com.jsjty.core.excel;

import com.jsjty.util.EncodeUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by 马英虎 on 2014/11/21.
 */
public class ExcelExporter {

    private final static Logger logger = LoggerFactory.getLogger(ExcelExporter.class);
    private String templatePath;
    private Map<String, Object> parameters;
    private List<String> fieldsList;
    private String filename = "Excel.xls";


    /**
     * 设置数据
     *
     * @param parameters 参数集合
     * @param pList      字段集合
     */
    public void setData(Map<String, Object> parameters, List<String> pList) {
        this.parameters = parameters;
        this.fieldsList = pList;
    }

    /**
     * 导出Excel
     *
     * @param request
     * @param response
     * @throws java.io.IOException
     */
    public void export(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        filename = EncodeUtil.encodeChineseDownloadFileName(request, getFilename());
        response.setHeader("Content-Disposition", "attachment; filename=" + filename + ";");
        ExcelData excelData = new ExcelData(parameters, fieldsList);
        ExcelTemplate excelTemplate = new ExcelTemplate();
        excelTemplate.setTemplatePath(getTemplatePath());
        excelTemplate.parse(request);
        ExcelFiller excelFiller = new ExcelFiller(excelTemplate, excelData);
        HSSFWorkbook workbook = excelFiller.fill(request);
        ServletOutputStream out = response.getOutputStream();
        workbook.write(out);
        out.flush();
    }


    public String getTemplatePath() {
        return templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public List<String> getFieldsList() {
        return fieldsList;
    }

    public void setFieldsList(List<String> fieldsList) {
        this.fieldsList = fieldsList;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
