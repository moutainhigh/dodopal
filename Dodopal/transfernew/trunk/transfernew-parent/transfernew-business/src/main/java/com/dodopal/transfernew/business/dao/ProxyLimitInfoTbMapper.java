package com.dodopal.transfernew.business.dao;

import org.apache.ibatis.annotations.Param;

import com.dodopal.transfernew.business.model.old.Proxylimitinfotb;

/**
 * 网点充值额度信息表
 * @author lenovo
 *
 */
public interface ProxyLimitInfoTbMapper {
    
    Proxylimitinfotb findProxyLimitInfoTbById(@Param("proxyid")String proxyid);
    
   
}
