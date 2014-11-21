package com.jsjty.mapper;

import com.jsjty.model.Tdevice;
import org.apache.ibatis.annotations.*;

public interface TdeviceMapper {

    @Delete("delete from tdevice where deviceid = #{deviceid,jdbcType=VARCHAR}")
    int deleteByPrimaryKey(@Param("deviceid")String deviceid);

    @Insert("INSERT INTO tdevice(deviceid,parentid,devicename,devicetype,position,devicegrade,remark,importance,maintain,weight,picspath) " +
            " VALUES(#{deviceid},#{parentid},#{devicename},#{devicetype},#{position},#{devicegrade},#{remark},#{importance},#{maintain},#{weight},#{picspath})")
    int insert(Tdevice record);

    @Select("select * from tdevice  where deviceid = #{deviceid,jdbcType=VARCHAR}")
    @Options(useCache = true, flushCache = false, timeout = 10000)
    Tdevice selectByPrimaryKey(@Param("deviceid")String deviceid);

    @Update("update tdevice t set t.picspath = #{picspath} where t.deviceid = #{deviceid,jdbcType=VARCHAR}")
    int updateByPrimaryKey(Tdevice record);
}