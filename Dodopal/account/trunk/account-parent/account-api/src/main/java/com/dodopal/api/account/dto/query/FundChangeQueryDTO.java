package com.dodopal.api.account.dto.query;

import java.util.Date;

import com.dodopal.common.model.QueryBase;
//查询资金变更记录条件
public class FundChangeQueryDTO extends QueryBase{
    
    private static final long serialVersionUID = 4276284014939797886L;

    //主账户数据库id
    public String acid;
    
    //资金类别
    public String fundType;

    //变动类型
    public String changeType;
    
    //最小交易金额范围
    public long changeAmountMin;
    
   //最大交易金额范围
    public long changeAmountMax;

    //开始时间
    private Date startDate;
    
    //结束时间
    private Date endDate;

    /**
     * 当前用户ID
     */
    private String createUser;
    
    public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getAcid() {
        return acid;
    }

    public void setAcid(String acid) {
        this.acid = acid;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

 
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public long getChangeAmountMin() {
        return changeAmountMin;
    }

    public void setChangeAmountMin(long changeAmountMin) {
        this.changeAmountMin = changeAmountMin;
    }

    public long getChangeAmountMax() {
        return changeAmountMax;
    }

    public void setChangeAmountMax(long changeAmountMax) {
        this.changeAmountMax = changeAmountMax;
    }

    @Override
    public String toString() {
        return "FundChangeQueryDTO [acid=" + acid + ", fundType=" + fundType + ", changeType=" + changeType + ", changeAmountMin=" + changeAmountMin + ", changeAmountMax=" + changeAmountMax + ", startDate=" + startDate + ", endDate=" + endDate + "]";
    }

 
    
    
}
