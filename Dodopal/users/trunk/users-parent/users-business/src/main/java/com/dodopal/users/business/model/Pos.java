package com.dodopal.users.business.model;

import java.util.Date;

import com.dodopal.common.model.BaseEntity;

public class Pos extends BaseEntity {

	private static final long serialVersionUID = -8435290957808927314L;

	/** POS号 */
	private String code;

	/** POS状态 */
	private String status;

	/** 商户编号 */
	private String merchantCode;

	/** 商户名称 */
	private String merchantName;

	/** 城市CODE */
	private String cityCode;

	/** 绑定标识，0绑定，1未绑定*/
	private String bind;

	/** 备注 */
	private String comments;

	/** 绑定时间 */
	private Date bundlingDate;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getBind() {
		return bind;
	}

	public void setBind(String bind) {
		this.bind = bind;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getBundlingDate() {
		return bundlingDate;
	}

	public void setBundlingDate(Date bundlingDate) {
		this.bundlingDate = bundlingDate;
	}

}