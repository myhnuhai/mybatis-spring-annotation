package com.jsjty.controller;

import com.jsjty.core.excel.ExcelExporter;
import com.jsjty.model.Tdevice;
import com.jsjty.service.IDeviceService;
import com.jsjty.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by 马英虎 on 2014/11/27.
 */
@Controller
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    private IDeviceService deviceService;
    /**
     * 导出Excel
     * @param request
     * @param response
     */
    @RequestMapping("{ids}.jetx")
    public void excelExport(@PathVariable String ids,HttpServletRequest request,
                            HttpServletResponse response){

        Tdevice tdevice = deviceService.selectById(ids);
        Map<String,Object> params = BeanUtil.bean2Map(tdevice);

        ExcelExporter excelExporter = new ExcelExporter();
        excelExporter.setTemplatePath("/report/Excel.xls");
        excelExporter.setData(params, new ArrayList<String>());
        excelExporter.setFilename("项目报表导出文档.xls");
        try {
            excelExporter.export(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
