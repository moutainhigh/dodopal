package com.dodopal.oss.business.model;

import java.util.Date;

import com.dodopal.common.model.BaseEntity;

/**
 * 清分基础数据表CLEARING_BASIC_DATA对应实体类
 */
public class ClearingBasicData extends BaseEntity{
    
    private static final long serialVersionUID = 1L;
    private String orderNo;// 订单交易号
    private Date orderDate;// 订单时间
    private String orderDay;// 订单日期
    private String customerNo;// 商户编号
    private String customerName;// 商户名称
    private String customerType;// 商户类型
    private String businessType;// 业务类型
    private String customerRealPay;// 商户业务费率类型
    private double customerRate;// 商户业务费率
    private long orderAmount;// 订单金额
    private long customerRealPayAmount;// 商户实际支付金额
    private long customerShouldProfit;// 商户应得分润
    private long customerRealProfit;// 商户实际分润
    private long customerAccountShouldAmount;// 商户账户应加值
    private long customerAccountRealAmount;// 商户账户实际加值
    private long ddpGetMerchantPayFee;// DDP应收商户支付方式服务费
    private String subMerchantCode;// 下级商户编号
    private String subMerchantName;// 下级商户名称
    private long subMerchantShouldProfit;// 下级商户应得分润
    private String payType;// 支付类型
    private String payWay;// 支付方式
    private String serviceRateType;// 服务费率类型
    private double serviceRate;// 服务费率
    private double ddpBankRate;// DDP与银行的手续费率
    private long ddpToBankFee;// DDP支付给银行的手续费
    private long ddpFromBankShouldFee;// DDP从银行应收业务费用
    private long ddpFromBankRealFee;// DDP从银行实收业务费用
    private String supplierCode;// 供应商
    private long ddpToSupplierShouldAmount;// DDP应支付供应商本金
    private long ddpToSupplierRealAmount;// DDP实际支付供应商本金
    private double ddpSupplierRate;// DDP与供应商之间的费率
    private long supplierToDdpShouldRebate;// 供应商应支付DDP返点
    private long supplierToDdpRealRebate;// 供应商实际支付DDP返点
    private String orderFrom;// 订单来源
    private String orderCircle;// 是否圈存订单
    private String bankClearingFlag;// 与银行清分状态
    private String bankClearingTime;// 与银行清分时间
    private String bankSettlementFlag;// 与银行结算状态
    private Date bankSettlementTime;// 与银行结算时间
    private String supplierClearingFlag;// 与供应商清分状态
    private Date supplierClearingTime;// 与供应商清分时间
    private String supplierSettlementFlag;// 与供应商结算状态
    private Date supplierSettlementTime;// 与供应商结算时间
    private String customerClearingFlag;// 与客户清分状态
    private Date customerClearingTime;// 与客户清分时间
    private String customerSettlementFlag;// 与客户结算状态
    private Date customerSettlementTime;// 与客户结算时间
    private String payGateWay;// 支付网关
    private long ddpToCustomerRealFee;// DDP实际转给商户业务费用
    private String supplierName;// 供应商名称
    private String cityCode;// 城市编码
    private String cityName;// 城市名称
    private String topMerchantProfitFlag;// 上级商户分润计算状态
    public String getOrderNo() {
        return orderNo;
    }
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public String getOrderDay() {
        return orderDay;
    }
    public void setOrderDay(String orderDay) {
        this.orderDay = orderDay;
    }
    public String getCustomerNo() {
        return customerNo;
    }
    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerType() {
        return customerType;
    }
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    public String getBusinessType() {
        return businessType;
    }
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
    public String getCustomerRealPay() {
        return customerRealPay;
    }
    public void setCustomerRealPay(String customerRealPay) {
        this.customerRealPay = customerRealPay;
    }
    public double getCustomerRate() {
        return customerRate;
    }
    public void setCustomerRate(double customerRate) {
        this.customerRate = customerRate;
    }
    public long getOrderAmount() {
        return orderAmount;
    }
    public void setOrderAmount(long orderAmount) {
        this.orderAmount = orderAmount;
    }
    public long getCustomerRealPayAmount() {
        return customerRealPayAmount;
    }
    public void setCustomerRealPayAmount(long customerRealPayAmount) {
        this.customerRealPayAmount = customerRealPayAmount;
    }
    public long getCustomerShouldProfit() {
        return customerShouldProfit;
    }
    public void setCustomerShouldProfit(long customerShouldProfit) {
        this.customerShouldProfit = customerShouldProfit;
    }
    public long getCustomerRealProfit() {
        return customerRealProfit;
    }
    public void setCustomerRealProfit(long customerRealProfit) {
        this.customerRealProfit = customerRealProfit;
    }
    public long getCustomerAccountShouldAmount() {
        return customerAccountShouldAmount;
    }
    public void setCustomerAccountShouldAmount(long customerAccountShouldAmount) {
        this.customerAccountShouldAmount = customerAccountShouldAmount;
    }
    public long getCustomerAccountRealAmount() {
        return customerAccountRealAmount;
    }
    public void setCustomerAccountRealAmount(long customerAccountRealAmount) {
        this.customerAccountRealAmount = customerAccountRealAmount;
    }
    public long getDdpGetMerchantPayFee() {
        return ddpGetMerchantPayFee;
    }
    public void setDdpGetMerchantPayFee(long ddpGetMerchantPayFee) {
        this.ddpGetMerchantPayFee = ddpGetMerchantPayFee;
    }
    public String getSubMerchantCode() {
        return subMerchantCode;
    }
    public void setSubMerchantCode(String subMerchantCode) {
        this.subMerchantCode = subMerchantCode;
    }
    public String getSubMerchantName() {
        return subMerchantName;
    }
    public void setSubMerchantName(String subMerchantName) {
        this.subMerchantName = subMerchantName;
    }
    public long getSubMerchantShouldProfit() {
        return subMerchantShouldProfit;
    }
    public void setSubMerchantShouldProfit(long subMerchantShouldProfit) {
        this.subMerchantShouldProfit = subMerchantShouldProfit;
    }
    public String getPayType() {
        return payType;
    }
    public void setPayType(String payType) {
        this.payType = payType;
    }
    public String getPayWay() {
        return payWay;
    }
    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }
    public String getServiceRateType() {
        return serviceRateType;
    }
    public void setServiceRateType(String serviceRateType) {
        this.serviceRateType = serviceRateType;
    }
    public double getServiceRate() {
        return serviceRate;
    }
    public void setServiceRate(double serviceRate) {
        this.serviceRate = serviceRate;
    }
    public double getDdpBankRate() {
        return ddpBankRate;
    }
    public void setDdpBankRate(double ddpBankRate) {
        this.ddpBankRate = ddpBankRate;
    }
    public long getDdpToBankFee() {
        return ddpToBankFee;
    }
    public void setDdpToBankFee(long ddpToBankFee) {
        this.ddpToBankFee = ddpToBankFee;
    }
    public long getDdpFromBankShouldFee() {
        return ddpFromBankShouldFee;
    }
    public void setDdpFromBankShouldFee(long ddpFromBankShouldFee) {
        this.ddpFromBankShouldFee = ddpFromBankShouldFee;
    }
    public long getDdpFromBankRealFee() {
        return ddpFromBankRealFee;
    }
    public void setDdpFromBankRealFee(long ddpFromBankRealFee) {
        this.ddpFromBankRealFee = ddpFromBankRealFee;
    }
    public String getSupplierCode() {
        return supplierCode;
    }
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }
    public long getDdpToSupplierShouldAmount() {
        return ddpToSupplierShouldAmount;
    }
    public void setDdpToSupplierShouldAmount(long ddpToSupplierShouldAmount) {
        this.ddpToSupplierShouldAmount = ddpToSupplierShouldAmount;
    }
    public long getDdpToSupplierRealAmount() {
        return ddpToSupplierRealAmount;
    }
    public void setDdpToSupplierRealAmount(long ddpToSupplierRealAmount) {
        this.ddpToSupplierRealAmount = ddpToSupplierRealAmount;
    }
    public double getDdpSupplierRate() {
        return ddpSupplierRate;
    }
    public void setDdpSupplierRate(double ddpSupplierRate) {
        this.ddpSupplierRate = ddpSupplierRate;
    }
    public long getSupplierToDdpShouldRebate() {
        return supplierToDdpShouldRebate;
    }
    public void setSupplierToDdpShouldRebate(long supplierToDdpShouldRebate) {
        this.supplierToDdpShouldRebate = supplierToDdpShouldRebate;
    }
    public long getSupplierToDdpRealRebate() {
        return supplierToDdpRealRebate;
    }
    public void setSupplierToDdpRealRebate(long supplierToDdpRealRebate) {
        this.supplierToDdpRealRebate = supplierToDdpRealRebate;
    }
    public String getOrderFrom() {
        return orderFrom;
    }
    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }
    public String getOrderCircle() {
        return orderCircle;
    }
    public void setOrderCircle(String orderCircle) {
        this.orderCircle = orderCircle;
    }
    public String getBankClearingFlag() {
        return bankClearingFlag;
    }
    public void setBankClearingFlag(String bankClearingFlag) {
        this.bankClearingFlag = bankClearingFlag;
    }
    public String getBankClearingTime() {
        return bankClearingTime;
    }
    public void setBankClearingTime(String bankClearingTime) {
        this.bankClearingTime = bankClearingTime;
    }
    public String getBankSettlementFlag() {
        return bankSettlementFlag;
    }
    public void setBankSettlementFlag(String bankSettlementFlag) {
        this.bankSettlementFlag = bankSettlementFlag;
    }
    public Date getBankSettlementTime() {
        return bankSettlementTime;
    }
    public void setBankSettlementTime(Date bankSettlementTime) {
        this.bankSettlementTime = bankSettlementTime;
    }
    public String getSupplierClearingFlag() {
        return supplierClearingFlag;
    }
    public void setSupplierClearingFlag(String supplierClearingFlag) {
        this.supplierClearingFlag = supplierClearingFlag;
    }
    public Date getSupplierClearingTime() {
        return supplierClearingTime;
    }
    public void setSupplierClearingTime(Date supplierClearingTime) {
        this.supplierClearingTime = supplierClearingTime;
    }
    public String getSupplierSettlementFlag() {
        return supplierSettlementFlag;
    }
    public void setSupplierSettlementFlag(String supplierSettlementFlag) {
        this.supplierSettlementFlag = supplierSettlementFlag;
    }
    public Date getSupplierSettlementTime() {
        return supplierSettlementTime;
    }
    public void setSupplierSettlementTime(Date supplierSettlementTime) {
        this.supplierSettlementTime = supplierSettlementTime;
    }
    public String getCustomerClearingFlag() {
        return customerClearingFlag;
    }
    public void setCustomerClearingFlag(String customerClearingFlag) {
        this.customerClearingFlag = customerClearingFlag;
    }
    public Date getCustomerClearingTime() {
        return customerClearingTime;
    }
    public void setCustomerClearingTime(Date customerClearingTime) {
        this.customerClearingTime = customerClearingTime;
    }
    public String getCustomerSettlementFlag() {
        return customerSettlementFlag;
    }
    public void setCustomerSettlementFlag(String customerSettlementFlag) {
        this.customerSettlementFlag = customerSettlementFlag;
    }
    public Date getCustomerSettlementTime() {
        return customerSettlementTime;
    }
    public void setCustomerSettlementTime(Date customerSettlementTime) {
        this.customerSettlementTime = customerSettlementTime;
    }
    public String getPayGateWay() {
        return payGateWay;
    }
    public void setPayGateWay(String payGateWay) {
        this.payGateWay = payGateWay;
    }
    public long getDdpToCustomerRealFee() {
        return ddpToCustomerRealFee;
    }
    public void setDdpToCustomerRealFee(long ddpToCustomerRealFee) {
        this.ddpToCustomerRealFee = ddpToCustomerRealFee;
    }
    public String getSupplierName() {
        return supplierName;
    }
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    public String getCityCode() {
        return cityCode;
    }
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getTopMerchantProfitFlag() {
        return topMerchantProfitFlag;
    }
    public void setTopMerchantProfitFlag(String topMerchantProfitFlag) {
        this.topMerchantProfitFlag = topMerchantProfitFlag;
    }

}
