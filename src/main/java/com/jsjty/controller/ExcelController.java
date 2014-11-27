package com.jsjty.controller;

import com.jsjty.core.excel.ExcelExporter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 马英虎 on 2014/11/27.
 */
@Controller
@RequestMapping("/excel")
public class ExcelController {

    /**
     * 导出Excel
     * @param request
     * @param response
     */
    @RequestMapping("/export.jetx")
    public void excelExport(HttpServletRequest request,
                            HttpServletResponse response){
        ExcelExporter excelExporter = new ExcelExporter();
        Map<String,String> params = new HashMap<String,String>();
        params.put("reportTitle", "北京市第一人民医院收费项目表");
        params.put("name","江苏省交通规划设计院");
        params.put("time","2014-11-22");
        params.put("data","测试数据");
        params.put("project","项目名称");
        params.put("test","测试");
        excelExporter.setTemplatePath("/report/Report.xls");
        excelExporter.setData(params, new ArrayList<String>());
        excelExporter.setFilename("项目报表导出文档.xls");
        try {
            excelExporter.export(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
