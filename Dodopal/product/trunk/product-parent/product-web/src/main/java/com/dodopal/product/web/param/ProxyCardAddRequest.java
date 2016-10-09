package com.dodopal.product.web.param;

public class ProxyCardAddRequest extends BaseRequest{
    
    private String proxyid;//网点编号
    private String proxyorderno;//订单号
    private String status;//订单状态
    private String startdate;//查询起始时间
    private String enddate;//查询结束时间
    private String posid;//Pos编号
    private String cardno;//卡号
    private String cityno;//业务所在城市
    
    public String getProxyid() {
        return proxyid;
    }
    public void setProxyid(String proxyid) {
        this.proxyid = proxyid;
    }
    public String getProxyorderno() {
        return proxyorderno;
    }
    public void setProxyorderno(String proxyorderno) {
        this.proxyorderno = proxyorderno;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStartdate() {
        return startdate;
    }
    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }
    public String getEnddate() {
        return enddate;
    }
    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
    public String getPosid() {
        return posid;
    }
    public void setPosid(String posid) {
        this.posid = posid;
    }
    public String getCardno() {
        return cardno;
    }
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }
    public String getCityno() {
        return cityno;
    }
    public void setCityno(String cityno) {
        this.cityno = cityno;
    }

}
