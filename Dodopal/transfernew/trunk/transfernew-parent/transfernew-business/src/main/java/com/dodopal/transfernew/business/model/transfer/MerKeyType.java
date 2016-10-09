package com.dodopal.transfernew.business.model.transfer;

import java.io.Serializable;
//import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the MER_KEY_TYPE database table.
 * 
 */
//@Entity
//@Table(name="MER_KEY_TYPE")
//@NamedQuery(name="MerKeyType.findAll", query="SELECT m FROM MerKeyType m")
public class MerKeyType implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
	private String id;

//	@Column(name="\"ACTIVATE\"")
	private String activate;

	private String bak1;

	private String bak10;

	private String bak2;

	private String bak3;

	private String bak4;

	private String bak5;

	private String bak6;

	private String bak7;

	private String bak8;

	private String bak9;

//	@Temporal(TemporalType.DATE)
//	@Column(name="CREATE_DATE")
	private Date createDate;

//	@Column(name="CREATE_USER")
	private String createUser;

//	@Column(name="INNER_BACKPAYPWD")
	private String innerBackpaypwd;

//	@Column(name="INNER_PAYPWD")
	private String innerPaypwd;

//	@Column(name="MER_CODE")
	private String merCode;

//	@Column(name="MER_DSA_PRI")
	private String merDsaPri;

//	@Column(name="MER_DSA_PUB")
	private String merDsaPub;

//	@Column(name="MER_KEY_TYPE")
	private String merKeyType;

//	@Column(name="MER_MD5_BACKPAYPWD")
	private String merMd5Backpaypwd;

//	@Column(name="MER_MD5_PAYPWD")
	private String merMd5Paypwd;

//	@Column(name="MER_RSA_PRI")
	private String merRsaPri;

//	@Column(name="MER_RSA_PUB")
	private String merRsaPub;

//	@Temporal(TemporalType.DATE)
//	@Column(name="UPDATE_DATE")
	private Date updateDate;

//	@Column(name="UPDATE_USER")
	private String updateUser;

	public MerKeyType() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActivate() {
		return this.activate;
	}

	public void setActivate(String activate) {
		this.activate = activate;
	}

	public String getBak1() {
		return this.bak1;
	}

	public void setBak1(String bak1) {
		this.bak1 = bak1;
	}

	public String getBak10() {
		return this.bak10;
	}

	public void setBak10(String bak10) {
		this.bak10 = bak10;
	}

	public String getBak2() {
		return this.bak2;
	}

	public void setBak2(String bak2) {
		this.bak2 = bak2;
	}

	public String getBak3() {
		return this.bak3;
	}

	public void setBak3(String bak3) {
		this.bak3 = bak3;
	}

	public String getBak4() {
		return this.bak4;
	}

	public void setBak4(String bak4) {
		this.bak4 = bak4;
	}

	public String getBak5() {
		return this.bak5;
	}

	public void setBak5(String bak5) {
		this.bak5 = bak5;
	}

	public String getBak6() {
		return this.bak6;
	}

	public void setBak6(String bak6) {
		this.bak6 = bak6;
	}

	public String getBak7() {
		return this.bak7;
	}

	public void setBak7(String bak7) {
		this.bak7 = bak7;
	}

	public String getBak8() {
		return this.bak8;
	}

	public void setBak8(String bak8) {
		this.bak8 = bak8;
	}

	public String getBak9() {
		return this.bak9;
	}

	public void setBak9(String bak9) {
		this.bak9 = bak9;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getInnerBackpaypwd() {
		return this.innerBackpaypwd;
	}

	public void setInnerBackpaypwd(String innerBackpaypwd) {
		this.innerBackpaypwd = innerBackpaypwd;
	}

	public String getInnerPaypwd() {
		return this.innerPaypwd;
	}

	public void setInnerPaypwd(String innerPaypwd) {
		this.innerPaypwd = innerPaypwd;
	}

	public String getMerCode() {
		return this.merCode;
	}

	public void setMerCode(String merCode) {
		this.merCode = merCode;
	}

	public String getMerDsaPri() {
		return this.merDsaPri;
	}

	public void setMerDsaPri(String merDsaPri) {
		this.merDsaPri = merDsaPri;
	}

	public String getMerDsaPub() {
		return this.merDsaPub;
	}

	public void setMerDsaPub(String merDsaPub) {
		this.merDsaPub = merDsaPub;
	}

	public String getMerKeyType() {
		return this.merKeyType;
	}

	public void setMerKeyType(String merKeyType) {
		this.merKeyType = merKeyType;
	}

	public String getMerMd5Backpaypwd() {
		return this.merMd5Backpaypwd;
	}

	public void setMerMd5Backpaypwd(String merMd5Backpaypwd) {
		this.merMd5Backpaypwd = merMd5Backpaypwd;
	}

	public String getMerMd5Paypwd() {
		return this.merMd5Paypwd;
	}

	public void setMerMd5Paypwd(String merMd5Paypwd) {
		this.merMd5Paypwd = merMd5Paypwd;
	}

	public String getMerRsaPri() {
		return this.merRsaPri;
	}

	public void setMerRsaPri(String merRsaPri) {
		this.merRsaPri = merRsaPri;
	}

	public String getMerRsaPub() {
		return this.merRsaPub;
	}

	public void setMerRsaPub(String merRsaPub) {
		this.merRsaPub = merRsaPub;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}