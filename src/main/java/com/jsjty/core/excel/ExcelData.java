package com.jsjty.core.excel;

import java.util.List;
import java.util.Map;

/**
 * Created by 马英虎 on 2014/11/21.
 */
public class ExcelData {

    public ExcelData(Map<String, String> parameters, List<String> fieldsList) {
        this.parameters = parameters;
        this.fieldsList = fieldsList;
    }

    /**
     * Excel参数元数据对象
     */
    private Map<String,String> parameters;

    /**
     * Excel集合元对象
     */
    private List<String> fieldsList;


    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public List<String> getFieldsList() {
        return fieldsList;
    }

    public void setFieldsList(List<String> fieldsList) {
        this.fieldsList = fieldsList;
    }
}
