package com.dodopal.transfer.business.model.target;

import java.io.Serializable;
//import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ACCOUNT_CHANGE_SUM database table.
 * 
 */
//@Entity
//@Table(name="ACCOUNT_CHANGE_SUM")
//@NamedQuery(name="AccountChangeSum.findAll", query="SELECT a FROM AccountChangeSum a")
public class AccountChangeSum implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
	private String id;

//	@Temporal(TemporalType.DATE)
//	@Column(name="ACCOUNT_CHANGE_DATE")
	private Date accountChangeDate;

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

//	@Column(name="CHANGE_DATE")
	private String changeDate;

//	@Temporal(TemporalType.DATE)
//	@Column(name="CREATE_DATE")
	private Date createDate;

//	@Column(name="CREATE_USER")
	private String createUser;

//	@Column(name="DAY_CONSUME_SUM")
	private BigDecimal dayConsumeSum;

//	@Column(name="DAY_RECHARGE_SUM")
	private BigDecimal dayRechargeSum;

//	@Column(name="DAY_TRAN_LIMIT")
	private BigDecimal dayTranLimit;

//	@Column(name="DAY_TRAN_TIMES")
	private BigDecimal dayTranTimes;

//	@Column(name="FUND_ACCOUNT_CODE")
	private String fundAccountCode;

//	@Temporal(TemporalType.DATE)
//	@Column(name="UPDATE_DATE")
	private Date updateDate;

//	@Column(name="UPDATE_USER")
	private String updateUser;

	public AccountChangeSum() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getAccountChangeDate() {
		return this.accountChangeDate;
	}

	public void setAccountChangeDate(Date accountChangeDate) {
		this.accountChangeDate = accountChangeDate;
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

	public String getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
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

	public BigDecimal getDayConsumeSum() {
		return this.dayConsumeSum;
	}

	public void setDayConsumeSum(BigDecimal dayConsumeSum) {
		this.dayConsumeSum = dayConsumeSum;
	}

	public BigDecimal getDayRechargeSum() {
		return this.dayRechargeSum;
	}

	public void setDayRechargeSum(BigDecimal dayRechargeSum) {
		this.dayRechargeSum = dayRechargeSum;
	}

	public BigDecimal getDayTranLimit() {
		return this.dayTranLimit;
	}

	public void setDayTranLimit(BigDecimal dayTranLimit) {
		this.dayTranLimit = dayTranLimit;
	}

	public BigDecimal getDayTranTimes() {
		return this.dayTranTimes;
	}

	public void setDayTranTimes(BigDecimal dayTranTimes) {
		this.dayTranTimes = dayTranTimes;
	}

	public String getFundAccountCode() {
		return this.fundAccountCode;
	}

	public void setFundAccountCode(String fundAccountCode) {
		this.fundAccountCode = fundAccountCode;
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