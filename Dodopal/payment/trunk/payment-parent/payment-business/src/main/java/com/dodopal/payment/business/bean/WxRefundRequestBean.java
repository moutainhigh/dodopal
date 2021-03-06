package com.dodopal.payment.business.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 微信退款 数据封装 xml对象
 * 
 * @author 
 *
 */
@XStreamAlias("xml")  
public class WxRefundRequestBean extends WxBaseBean{	
	
	private String transaction_id = "";// 微信支付订单号
	private String out_trade_no = "";// 商户订单号
	private String out_refund_no = "";// 商户退款单号
	private String total_fee = "";// 总金额
	private String refund_fee = "";// 退款金额
	private String refund_fee_type = "";// 货币种类
	private String op_user_id ="";  //操作员
	
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getOut_trade_no() {
		return out_trade_no;
	}
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}
	public String getOut_refund_no() {
		return out_refund_no;
	}
	public void setOut_refund_no(String out_refund_no) {
		this.out_refund_no = out_refund_no;
	}
	public String getTotal_fee() {
		return total_fee;
	}
	public void setTotal_fee(String total_fee) {
		this.total_fee = total_fee;
	}
	public String getRefund_fee() {
		return refund_fee;
	}
	public void setRefund_fee(String refund_fee) {
		this.refund_fee = refund_fee;
	}
	public String getRefund_fee_type() {
		return refund_fee_type;
	}
	public void setRefund_fee_type(String refund_fee_type) {
		this.refund_fee_type = refund_fee_type;
	}
	public String getOp_user_id() {
		return op_user_id;
	}
	public void setOp_user_id(String op_user_id) {
		this.op_user_id = op_user_id;
	}
	
	
	
}
