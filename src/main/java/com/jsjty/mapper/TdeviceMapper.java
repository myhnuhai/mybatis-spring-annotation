package com.jsjty.mapper;

import com.jsjty.model.Tdevice;
import com.jsjty.provider.TdeviceProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface TdeviceMapper {

    @DeleteProvider(type = TdeviceProvider.class,method = "deleteById")
    int deleteById(@Param("deviceid")String deviceid);

    @InsertProvider(type = TdeviceProvider.class,method = "insert")
    int insert(Tdevice tdevice);

    @SelectProvider(type = TdeviceProvider.class,method = "selectById")
    Tdevice selectById(@Param("deviceid")String deviceid);

     @SelectProvider(type = TdeviceProvider.class,method = "selectAll")
    List<Tdevice> selectAll();

    @UpdateProvider(type = TdeviceProvider.class,method = "update")
    int update(Tdevice tdevice);
}