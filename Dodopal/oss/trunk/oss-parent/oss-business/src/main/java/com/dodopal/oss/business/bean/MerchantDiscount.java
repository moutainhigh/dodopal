package com.dodopal.oss.business.bean;

import java.util.Date;

import com.dodopal.common.model.BaseEntity;

public class MerchantDiscount extends BaseEntity {

	private static final long serialVersionUID = 7413373769022572052L;
	
	private String id; 					// 交易折扣时间表Id
	private String merCode; 			// 商户号
	private Date beginDate; 			// 折扣开始日期
	private Date endDate; 				// 折扣结束日期
	private String dateId; 				// 交易折扣日期表ID
	
	private String week; 				// 星期
	private String beginTime; 			// 折扣开始时间
	private String endTime; 			// 折扣结束时间
	private Integer discountThreshold; 	// 折扣阀值
	private Integer setDiscount; 		// 结算折扣
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMerCode() {
		return merCode;
	}
	public void setMerCode(String merCode) {
		this.merCode = merCode;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getDateId() {
		return dateId;
	}
	public void setDateId(String dateId) {
		this.dateId = dateId;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Integer getDiscountThreshold() {
		return discountThreshold;
	}
	public void setDiscountThreshold(Integer discountThreshold) {
		this.discountThreshold = discountThreshold;
	}
	public Integer getSetDiscount() {
		return setDiscount;
	}
	public void setSetDiscount(Integer setDiscount) {
		this.setDiscount = setDiscount;
	}
	
}
