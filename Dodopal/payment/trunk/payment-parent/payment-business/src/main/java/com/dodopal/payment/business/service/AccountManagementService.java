package com.dodopal.payment.business.service;

import com.dodopal.api.account.dto.AccountFundDTO;
import com.dodopal.common.model.DodopalResponse;

public interface AccountManagementService {
	/**
	 * @param custType 枚举：个人、企业
	 * @param custNum 类型是商户：商户号；类型是个人：用户编号
	 * @param tradeNum 交易流水号
	 * @param amount 充值的金额，单位为分。
	 * @return 账户冻结接口
	 */
	public DodopalResponse<String> accountFreeze(String custType, String custNum,String tradeNum, long amount,String operId);
	
	
	
	/**
	 * @param custType
	 * @param custNum
	 * @param tradeNum
	 * @param amount
	 * @return  资金解冻接口
	 */
	public DodopalResponse<String> accountUnfreeze(String custType, String custNum,String tradeNum, long amount,String operId);
	
	/**
	 * @param custType
	 * @param custNum
	 * @param tradeNum
	 * @param amount
	 * @return	资金扣款接口
	 */
	public DodopalResponse<String> accountDeduct(String custType, String custNum, String tradeNum, long amount,String operId);

	/**
	 * @description 账户充值功能
	 * @param custType
	 * @param custNum
	 * @param tradeNum
	 * @param amount
	 * @return
	 */
	public DodopalResponse<String> accountRecharge(String custType, String custNum, String tradeNum, long amount,String operId);
	/**
	 * @description 账户充值功能
	 * @param custType
	 * @param custNum
	 * @return
	 */
	public DodopalResponse<AccountFundDTO> findAccountBalance(String custType, String custNum);

	/**
	 * @description 账户充值检查风控信息
	 * @param custType
	 * @param custNum
	 * @param amount
	 * @return
	 */
	public DodopalResponse<String> checkRecharge(String custType, String custNum, long amount);

}
