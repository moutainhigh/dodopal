package com.dodopal.api.users.dto;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.dodopal.common.model.BaseEntity;
import com.dodopal.common.service.DdicService;
import com.dodopal.common.util.SpringBeanUtil;

/**
 * 类说明 :
 * 
 * @author lifeng
 */

public class MerchantDTO extends BaseEntity {
	private static final long serialVersionUID = 999021946779941412L;
	/* 商户编码 */
	private String merCode;
	/* 商户名称 */
	private String merName;
	/* 商户地址 */
	private String merAdds;
	/* 商户类型 */
	private String merType;
	/* 商户联系人 */
	private String merLinkUser;
	/* 商户邮编 */
	private String merZip;
	/* 商户联系人电话 */
	private String merLinkUserMobile;
	/* 商户固定电话 */
	private String merTelephone;
	/* 商户邮箱 */
	private String merEmail;
	/* 所属上级商户编码 */
	private String merParentCode;
	/* 审核状态 */
	private String merState;
	/* 激活时间 */
	private Date merActivateDate;
	/* 启用标示 */
	private String activate;
	/* 停用/启用时间 */
	private String merDeactivateDate;
	/* 传真 */
	private String merFax;
	/* 注册时间 */
	private Date merRegisterDate;
	/* 开户银行 */
	private String merBankName;
	/* 开户行账号 */
	private String merBankAccount;
	/* 开户名称 */
	private String merBankUserName;
	/* 经营范围 */
	private String merBusinessScopeId;
	/* 商户所属地区 */
	private String merArea;
	/* 商户所属省份 */
	private String merPro;
	/* 商户所属城市 */
	private String merCity;
	/* 删除标示 */
	private String delFlg;
	/* 商户分类 */
	private String merClassify;
	/* 商户属性 */
	private String merProperty;
	/* 审核人 */
	private String merStateUser;
	/* 审核日期 */
	private Date merStateDate;
	/* 来源 */
	private String source;
	/* 审核不通过原因 */
	private String merRejectReason;
	
	//--------------新增字段 Time:2016-01-14 Name: Joe
    /*商户打款人*/
    private String merPayMoneyUser;

    public String getMerPayMoneyUser() {
        return merPayMoneyUser;
    }

    public void setMerPayMoneyUser(String merPayMoneyUser) {
        this.merPayMoneyUser = merPayMoneyUser;
    }
	// ---------------------------------------
	/* 账户资金类型 */
	private String fundType;
	// ---------------------------------------
	/* 商户补充信息 */
	private MerDdpInfoDTO merDdpInfo;
	// ---------------------------------------
	/* 商户业务费率 */
	private List<MerBusRateDTO> merBusRateList;
	// ---------------------------------------
	/* 用户信息(管理员) */
	private MerchantUserDTO merchantUserDTO;
	// ---------------------------------------
	/* 商户自定义功能 */
	private List<MerFunctionInfoDTO> merDefineFunList;
	// ---------------------------------------
	/* 当前商户功能合集 */
	private List<MerFunctionInfoDTO> merFunInfoList;
	// ---------------------------------------
	/* 商户业务信息列表 */
	private List<MerRateSupplementDTO> merRateSpmtList;
	// ---------------------------------------
	/* 商户秘钥 */
	private MerKeyTypeDTO merKeyTypeDTO;
	
	// ---------------------------------------
    /* 自动分配额度 */
    private MerAutoAmtDTO merAutoAmtDTO;
    
	

    public MerAutoAmtDTO getMerAutoAmtDTO() {
        return merAutoAmtDTO;
    }

    public void setMerAutoAmtDTO(MerAutoAmtDTO merAutoAmtDTO) {
        this.merAutoAmtDTO = merAutoAmtDTO;
    }

    /* VC端注册POS */
    private PosDTO posDTO;

    // ---------------------------------------扩展属性
	/* 上级商户类型 */
	private String merParentType;
	/* 上级商户名称 */
	private String merParentName;
	/* 商户所属地区名称 */
	private String merAreaName;
	/* 商户所属省份名称 */
	private String merProName;
	/* 商户所属城市名称 */
	private String merCityName;

	public String getMerCode() {
		return merCode;
	}

	public void setMerCode(String merCode) {
		this.merCode = merCode;
	}

	public String getMerName() {
		return merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}

	public String getMerAdds() {
		return merAdds;
	}

	public void setMerAdds(String merAdds) {
		this.merAdds = merAdds;
	}

	public String getMerType() {
		return merType;
	}

	public void setMerType(String merType) {
		this.merType = merType;
	}

	public String getMerLinkUser() {
		return merLinkUser;
	}

	public void setMerLinkUser(String merLinkUser) {
		this.merLinkUser = merLinkUser;
	}

	public String getMerZip() {
		return merZip;
	}

	public void setMerZip(String merZip) {
		this.merZip = merZip;
	}

	public String getMerLinkUserMobile() {
		return merLinkUserMobile;
	}

	public void setMerLinkUserMobile(String merLinkUserMobile) {
		this.merLinkUserMobile = merLinkUserMobile;
	}

	public String getMerTelephone() {
		return merTelephone;
	}

	public void setMerTelephone(String merTelephone) {
		this.merTelephone = merTelephone;
	}

	public String getMerEmail() {
		return merEmail;
	}

	public void setMerEmail(String merEmail) {
		this.merEmail = merEmail;
	}

	public String getMerParentCode() {
		return merParentCode;
	}

	public void setMerParentCode(String merParentCode) {
		this.merParentCode = merParentCode;
	}

	public String getMerState() {
		return merState;
	}

	public void setMerState(String merState) {
		this.merState = merState;
	}

	public Date getMerActivateDate() {
		return merActivateDate;
	}

	public void setMerActivateDate(Date merActivateDate) {
		this.merActivateDate = merActivateDate;
	}

	public String getActivate() {
		return activate;
	}

	public void setActivate(String activate) {
		this.activate = activate;
	}

	public String getMerDeactivateDate() {
		return merDeactivateDate;
	}

	public void setMerDeactivateDate(String merDeactivateDate) {
		this.merDeactivateDate = merDeactivateDate;
	}

	public String getMerFax() {
		return merFax;
	}

	public void setMerFax(String merFax) {
		this.merFax = merFax;
	}

	public Date getMerRegisterDate() {
		return merRegisterDate;
	}

	public void setMerRegisterDate(Date merRegisterDate) {
		this.merRegisterDate = merRegisterDate;
	}

	public String getMerBankName() {
		return merBankName;
	}

	public void setMerBankName(String merBankName) {
		this.merBankName = merBankName;
	}

	public String getMerBankAccount() {
		return merBankAccount;
	}

	public void setMerBankAccount(String merBankAccount) {
		this.merBankAccount = merBankAccount;
	}

	public String getMerBankUserName() {
		return merBankUserName;
	}

	public void setMerBankUserName(String merBankUserName) {
		this.merBankUserName = merBankUserName;
	}

	public String getMerBusinessScopeId() {
		return merBusinessScopeId;
	}

	public void setMerBusinessScopeId(String merBusinessScopeId) {
		this.merBusinessScopeId = merBusinessScopeId;
	}
	
    //经营范围
    public String getMerBusinessScopeIdView() {
        DdicService ddicService = (DdicService) SpringBeanUtil.getBean("ddicService");
        if (StringUtils.isBlank(this.merBusinessScopeId)) {
            return null;
        }
        return ddicService.getDdicNameByCode("BUSINESS_SCOPE", this.merBusinessScopeId).toString();
    }
    
	public String getMerArea() {
		return merArea;
	}

	public void setMerArea(String merArea) {
		this.merArea = merArea;
	}

	public String getMerPro() {
		return merPro;
	}

	public void setMerPro(String merPro) {
		this.merPro = merPro;
	}

	public String getMerCity() {
		return merCity;
	}

	public void setMerCity(String merCity) {
		this.merCity = merCity;
	}

	public String getDelFlg() {
		return delFlg;
	}

	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}

	public String getMerClassify() {
		return merClassify;
	}

	public void setMerClassify(String merClassify) {
		this.merClassify = merClassify;
	}

	public String getMerProperty() {
		return merProperty;
	}

	public void setMerProperty(String merProperty) {
		this.merProperty = merProperty;
	}

	public String getMerStateUser() {
		return merStateUser;
	}

	public void setMerStateUser(String merStateUser) {
		this.merStateUser = merStateUser;
	}

	public Date getMerStateDate() {
		return merStateDate;
	}

	public void setMerStateDate(Date merStateDate) {
		this.merStateDate = merStateDate;
	}

	public MerDdpInfoDTO getMerDdpInfo() {
		return merDdpInfo;
	}

	public void setMerDdpInfo(MerDdpInfoDTO merDdpInfo) {
		this.merDdpInfo = merDdpInfo;
	}

	public List<MerBusRateDTO> getMerBusRateList() {
		return merBusRateList;
	}

	public void setMerBusRateList(List<MerBusRateDTO> merBusRateList) {
		this.merBusRateList = merBusRateList;
	}

	public MerchantUserDTO getMerchantUserDTO() {
		return merchantUserDTO;
	}

	public void setMerchantUserDTO(MerchantUserDTO merchantUserDTO) {
		this.merchantUserDTO = merchantUserDTO;
	}

	public List<MerFunctionInfoDTO> getMerDefineFunList() {
		return merDefineFunList;
	}

	public void setMerDefineFunList(List<MerFunctionInfoDTO> merDefineFunList) {
		this.merDefineFunList = merDefineFunList;
	}

	public List<MerFunctionInfoDTO> getMerFunInfoList() {
		return merFunInfoList;
	}

	public void setMerFunInfoList(List<MerFunctionInfoDTO> merFunInfoList) {
		this.merFunInfoList = merFunInfoList;
	}

	public String getMerParentType() {
		return merParentType;
	}

	public void setMerParentType(String merParentType) {
		this.merParentType = merParentType;
	}

	public String getMerParentName() {
		return merParentName;
	}

	public void setMerParentName(String merParentName) {
		this.merParentName = merParentName;
	}

	public String getMerAreaName() {
		return merAreaName;
	}

	public void setMerAreaName(String merAreaName) {
		this.merAreaName = merAreaName;
	}

	public String getMerProName() {
		return merProName;
	}

	public void setMerProName(String merProName) {
		this.merProName = merProName;
	}

	public String getMerCityName() {
		return merCityName;
	}

	public void setMerCityName(String merCityName) {
		this.merCityName = merCityName;
	}

	public MerKeyTypeDTO getMerKeyTypeDTO() {
		return merKeyTypeDTO;
	}

	public void setMerKeyTypeDTO(MerKeyTypeDTO merKeyTypeDTO) {
		this.merKeyTypeDTO = merKeyTypeDTO;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMerRejectReason() {
		return merRejectReason;
	}

	public void setMerRejectReason(String merRejectReason) {
		this.merRejectReason = merRejectReason;
	}

	public String getFundType() {
		return fundType;
	}

	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public List<MerRateSupplementDTO> getMerRateSpmtList() {
		return merRateSpmtList;
	}

	public void setMerRateSpmtList(List<MerRateSupplementDTO> merRateSpmtList) {
		this.merRateSpmtList = merRateSpmtList;
	}

	public PosDTO getPosDTO() {
		return posDTO;
	}

	public void setPosDTO(PosDTO posDTO) {
		this.posDTO = posDTO;
	}

}