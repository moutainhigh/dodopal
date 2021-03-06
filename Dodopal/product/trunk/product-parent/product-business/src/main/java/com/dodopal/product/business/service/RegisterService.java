package com.dodopal.product.business.service;

import java.util.Map;

import com.dodopal.api.users.dto.MerchantDTO;
import com.dodopal.common.model.DodopalResponse;
import com.dodopal.product.business.bean.CommonUser;

/**
 * @author lifeng@dodopal.com
 */

public interface RegisterService {
	/**
	 * 校验用户名是否已存在
	 * @param userName
	 * @return
	 */
	public DodopalResponse<Boolean> checkUserNameExist(String userName);

	/**
	 * 注册个人用户
	 * @param mobile
	 * @param userName
	 * @param password
	 * @return
	 */
	public DodopalResponse<Boolean> registerUser(String mobile, String userName, String password, String source, String cityCode);

	/**
	 * 校验手机号是否已注册
	 * @param mobile
	 * @return
	 */
	public DodopalResponse<Boolean> checkMobileExist(String mobile);
	
	/**
	 * 通用个人注册
	 * @param user
	 * @return
	 */
	public DodopalResponse<Map<String,String>> registerComUser(CommonUser user);
	
	/**
	 * 交易表示查询
	 * @param cardno 卡号
	 * @param queryDate 交易日期
	 * @return
	 */
	public DodopalResponse<Boolean> queryOrderFlag(String cardno,String queryDate);

	/**
	 * VC客户端注册商户
	 * 
	 * @param merchant
	 * @return
	 */
	public DodopalResponse<String> registerMerchantForVC(MerchantDTO merchant);
}
