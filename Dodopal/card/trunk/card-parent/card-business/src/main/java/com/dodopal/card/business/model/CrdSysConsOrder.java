package com.dodopal.card.business.model;

import java.util.Date;

import com.dodopal.common.model.BaseEntity;

public class CrdSysConsOrder extends BaseEntity {
    private static final long serialVersionUID = 3762453951945513791L;

    //卡服务订单号
    private String crdOrderNum;
    //产品库主订单号
    private String proOrderNum;
    //产品编号
    private String proCode;
    //商户编号
    private String merCode;
    //商户订单号
    private String merOrderCode;
    //卡服务订单交易状态
    private String crdOrderStates;
    //上次卡服务订单交易状态
    private String crdBeforeorderStates;
    //交易应答码
    private String respCode;
    //用户编号
    private String userCode;
    //城市编号
    private String cityCode;
    //一卡通编号
    private String yktCode;
    //卡内号
    private String cardInnerNo;
    //卡面号
    private String cardFaceNo;
    //前台显示的卡面号
    private String orderCardNo;
    //卡类型
    private Integer cardType;
    //设备类型
    private Integer posType;
    //设备号编号
    private String posCode;
    //设备流水号
    private Integer posSeq;
    //交易前卡余额
    private Integer befbal;
    //交易后卡余额
    private Integer blackAmt;
    //交易金额
    private Integer txnAmt;
    //卡内允许最大金额
    private Integer cardLimit;
    //数据来源
    private Integer source;
    //交易类型
    private Integer txnType;
    //交易流水号
    private Integer txnSeq;
    //交易日期
    private String txnDate;
    //交易时间
    private String txnTime;
    //验卡卡号
    private String checkCardNo;
    //验卡请求时间
    private Date checkSendCardDate;
    //验卡应答时间
    private Date checkResCardDate;
    //验卡读卡设备号
    private String checkCardPosCode;
    //充值卡号
    private String consumeCardNo;
    //充值设备号
    private String consumeCardPosCode;
    //充值请求时间
    private Date consumeSendCardDate;
    //充值应答时间
    private Date consumeResCardDate;
    //结果请求时间
    private Date resultSendCardDate;
    //结果应答时间
    private Date resultResCardDate;
    //充值类型
    private Integer chargeType;
    //月票类型
    private Integer metropassType;
    //月票充值开始日期
    private Date metropassChargeStartDate;
    //月票充值结束日期
    private Date metropassChargeEndDate;
    //可疑处理标识
    private Integer dounknowFlag;
    //CPU卡TAC信息
    private String cardTac;
    //卡片计数器
    private String cardCounter;
    //安全认证码
    private String secmac;
    //充值组装卡交易记录
    private String afterCardNotes;
    //充值前卡片最后一条交易记录
    private String beforeCardNotes;
    //交易步骤
    private String tradeStep;
    //交易步骤版本
    private String tradeStepVer;
    //交易结束标志
    private int tradeEndFlag;
    //用户id
    private String userId;

    //卡逻辑类型
    private String cardLogicType;
    //POS通讯流水号
    private String posTransSeq;
    //密钥版本
    private String keyIndex;
    //应用标识
    private String appId;
    //脱机标识(0：联机;1：脱机)
    private String offlineFlag;
    //PSAM号
    private String samNo;

    public String getCrdOrderNum() {
        return crdOrderNum;
    }

    public void setCrdOrderNum(String crdOrderNum) {
        this.crdOrderNum = crdOrderNum;
    }

    public String getProOrderNum() {
        return proOrderNum;
    }

    public void setProOrderNum(String proOrderNum) {
        this.proOrderNum = proOrderNum;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getMerCode() {
        return merCode;
    }

    public void setMerCode(String merCode) {
        this.merCode = merCode;
    }

    public String getMerOrderCode() {
        return merOrderCode;
    }

    public void setMerOrderCode(String merOrderCode) {
        this.merOrderCode = merOrderCode;
    }

    public String getCrdOrderStates() {
        return crdOrderStates;
    }

    public void setCrdOrderStates(String crdOrderStates) {
        this.crdOrderStates = crdOrderStates;
    }

    public String getCrdBeforeorderStates() {
        return crdBeforeorderStates;
    }

    public void setCrdBeforeorderStates(String crdBeforeorderStates) {
        this.crdBeforeorderStates = crdBeforeorderStates;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getYktCode() {
        return yktCode;
    }

    public void setYktCode(String yktCode) {
        this.yktCode = yktCode;
    }

    public String getCardInnerNo() {
        return cardInnerNo;
    }

    public void setCardInnerNo(String cardInnerNo) {
        this.cardInnerNo = cardInnerNo;
    }

    public String getCardFaceNo() {
        return cardFaceNo;
    }

    public void setCardFaceNo(String cardFaceNo) {
        this.cardFaceNo = cardFaceNo;
    }

    public String getOrderCardNo() {
        return orderCardNo;
    }

    public void setOrderCardNo(String orderCardNo) {
        this.orderCardNo = orderCardNo;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public Integer getPosType() {
        return posType;
    }

    public void setPosType(Integer posType) {
        this.posType = posType;
    }

    public String getPosCode() {
        return posCode;
    }

    public void setPosCode(String posCode) {
        this.posCode = posCode;
    }

    public Integer getPosSeq() {
        return posSeq;
    }

    public void setPosSeq(Integer posSeq) {
        this.posSeq = posSeq;
    }

    public Integer getBefbal() {
        return befbal;
    }

    public void setBefbal(Integer befbal) {
        this.befbal = befbal;
    }

    public Integer getBlackAmt() {
        return blackAmt;
    }

    public void setBlackAmt(Integer blackAmt) {
        this.blackAmt = blackAmt;
    }

    public Integer getTxnAmt() {
        return txnAmt;
    }

    public void setTxnAmt(Integer txnAmt) {
        this.txnAmt = txnAmt;
    }

    public Integer getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(Integer cardLimit) {
        this.cardLimit = cardLimit;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getTxnType() {
        return txnType;
    }

    public void setTxnType(Integer txnType) {
        this.txnType = txnType;
    }

    public Integer getTxnSeq() {
        return txnSeq;
    }

    public void setTxnSeq(Integer txnSeq) {
        this.txnSeq = txnSeq;
    }

    public String getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(String txnDate) {
        this.txnDate = txnDate;
    }

    public String getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(String txnTime) {
        this.txnTime = txnTime;
    }

    public String getCheckCardNo() {
        return checkCardNo;
    }

    public void setCheckCardNo(String checkCardNo) {
        this.checkCardNo = checkCardNo;
    }

    public Date getCheckSendCardDate() {
        return checkSendCardDate;
    }

    public void setCheckSendCardDate(Date checkSendCardDate) {
        this.checkSendCardDate = checkSendCardDate;
    }

    public Date getCheckResCardDate() {
        return checkResCardDate;
    }

    public void setCheckResCardDate(Date checkResCardDate) {
        this.checkResCardDate = checkResCardDate;
    }

    public String getCheckCardPosCode() {
        return checkCardPosCode;
    }

    public void setCheckCardPosCode(String checkCardPosCode) {
        this.checkCardPosCode = checkCardPosCode;
    }

    public String getConsumeCardNo() {
        return consumeCardNo;
    }

    public void setConsumeCardNo(String consumeCardNo) {
        this.consumeCardNo = consumeCardNo;
    }

    public String getConsumeCardPosCode() {
        return consumeCardPosCode;
    }

    public void setConsumeCardPosCode(String consumeCardPosCode) {
        this.consumeCardPosCode = consumeCardPosCode;
    }

    public Date getConsumeSendCardDate() {
        return consumeSendCardDate;
    }

    public void setConsumeSendCardDate(Date consumeSendCardDate) {
        this.consumeSendCardDate = consumeSendCardDate;
    }

    public Date getConsumeResCardDate() {
        return consumeResCardDate;
    }

    public void setConsumeResCardDate(Date consumeResCardDate) {
        this.consumeResCardDate = consumeResCardDate;
    }

    public Date getResultSendCardDate() {
        return resultSendCardDate;
    }

    public void setResultSendCardDate(Date resultSendCardDate) {
        this.resultSendCardDate = resultSendCardDate;
    }

    public Date getResultResCardDate() {
        return resultResCardDate;
    }

    public void setResultResCardDate(Date resultResCardDate) {
        this.resultResCardDate = resultResCardDate;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getMetropassType() {
        return metropassType;
    }

    public void setMetropassType(Integer metropassType) {
        this.metropassType = metropassType;
    }

    public Date getMetropassChargeStartDate() {
        return metropassChargeStartDate;
    }

    public void setMetropassChargeStartDate(Date metropassChargeStartDate) {
        this.metropassChargeStartDate = metropassChargeStartDate;
    }

    public Date getMetropassChargeEndDate() {
        return metropassChargeEndDate;
    }

    public void setMetropassChargeEndDate(Date metropassChargeEndDate) {
        this.metropassChargeEndDate = metropassChargeEndDate;
    }

    public Integer getDounknowFlag() {
        return dounknowFlag;
    }

    public void setDounknowFlag(Integer dounknowFlag) {
        this.dounknowFlag = dounknowFlag;
    }

    public String getCardTac() {
        return cardTac;
    }

    public void setCardTac(String cardTac) {
        this.cardTac = cardTac;
    }

    public String getCardCounter() {
        return cardCounter;
    }

    public void setCardCounter(String cardCounter) {
        this.cardCounter = cardCounter;
    }

    public String getSecmac() {
        return secmac;
    }

    public void setSecmac(String secmac) {
        this.secmac = secmac;
    }

    public String getAfterCardNotes() {
        return afterCardNotes;
    }

    public void setAfterCardNotes(String afterCardNotes) {
        this.afterCardNotes = afterCardNotes;
    }

    public String getBeforeCardNotes() {
        return beforeCardNotes;
    }

    public void setBeforeCardNotes(String beforeCardNotes) {
        this.beforeCardNotes = beforeCardNotes;
    }

    public String getTradeStep() {
        return tradeStep;
    }

    public void setTradeStep(String tradeStep) {
        this.tradeStep = tradeStep;
    }

    public String getTradeStepVer() {
        return tradeStepVer;
    }

    public void setTradeStepVer(String tradeStepVer) {
        this.tradeStepVer = tradeStepVer;
    }

    public int getTradeEndFlag() {
        return tradeEndFlag;
    }

    public void setTradeEndFlag(int tradeEndFlag) {
        this.tradeEndFlag = tradeEndFlag;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCardLogicType() {
        return cardLogicType;
    }

    public void setCardLogicType(String cardLogicType) {
        this.cardLogicType = cardLogicType;
    }

    public String getPosTransSeq() {
        return posTransSeq;
    }

    public void setPosTransSeq(String posTransSeq) {
        this.posTransSeq = posTransSeq;
    }

    public String getKeyIndex() {
        return keyIndex;
    }

    public void setKeyIndex(String keyIndex) {
        this.keyIndex = keyIndex;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getOfflineFlag() {
        return offlineFlag;
    }

    public void setOfflineFlag(String offlineFlag) {
        this.offlineFlag = offlineFlag;
    }

    public String getSamNo() {
        return samNo;
    }

    public void setSamNo(String samNo) {
        this.samNo = samNo;
    }

}
