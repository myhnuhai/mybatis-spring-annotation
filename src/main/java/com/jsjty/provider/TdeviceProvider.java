package com.jsjty.provider;

import com.jsjty.model.Tdevice;
import com.jsjty.util.StringUtil;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

/**
 * Created by Administrator on 2015/2/6.
 */
public class TdeviceProvider extends BaseProvider {

    private static final String TABLE_NAME = "tdevice";

    @Override
    public String insert(Object obj) {
        if (StringUtil.isEmpty(obj)) {
            return "";
        }
        Tdevice tdevice = (Tdevice) obj;
        BEGIN();
        INSERT_INTO(TABLE_NAME);
        if (StringUtil.isNotEmpty(tdevice.getDeviceid())) {
            VALUES("deviceid", "#{deviceid}");
        }
        if (StringUtil.isNotEmpty(tdevice.getParentid())) {
            VALUES("parentid", "#{parentid}");
        }
        if (StringUtil.isNotEmpty(tdevice.getDevicename())) {
            VALUES("devicename", "#{devicename}");
        }
        if (StringUtil.isNotEmpty(tdevice.getDevicetype())) {
            VALUES("devicetype", "#{devicetype}");
        }
        if (StringUtil.isNotEmpty(tdevice.getPosition())) {
            VALUES("position", "#{position}");
        }
        if (StringUtil.isNotEmpty(tdevice.getDevicegrade())) {
            VALUES("devicegrade", "#{devicegrade}");
        }
        if (StringUtil.isNotEmpty(tdevice.getImportance())) {
            VALUES("importance", "#{importance}");
        }
        if (StringUtil.isNotEmpty(tdevice.getRemark())) {
            VALUES("remark", "#{remark}");
        }
        if (StringUtil.isNotEmpty(tdevice.getMaintain())) {
            VALUES("maintain", "#{maintain}");
        }
        if (StringUtil.isNotEmpty(tdevice.getWeight())) {
            VALUES("weight", "#{weight}");
        }
        if (StringUtil.isNotEmpty(tdevice.getPicspath())) {
            VALUES("picspath", "#{picspath}");
        }
        return SQL();
    }

    @Override
    public String update(Object obj) {
        return null;
    }

    @Override
    public String selectAll() {
        BEGIN();
        SELECT("*");
        FROM(TABLE_NAME);
        WHERE("devicegrade = 0");
        return SQL();
    }

    @Override
    public String selectById() {
        BEGIN();
        SELECT("*");
        FROM(TABLE_NAME);
        WHERE("deviceid = #{deviceid,jdbcType=VARCHAR}");

        return SQL();
    }

    @Override
    public String deleteById() {
        BEGIN();
        DELETE_FROM(TABLE_NAME);
        WHERE("deviceid = #{deviceid,jdbcType=VARCHAR}");
        return SQL();
    }

}
