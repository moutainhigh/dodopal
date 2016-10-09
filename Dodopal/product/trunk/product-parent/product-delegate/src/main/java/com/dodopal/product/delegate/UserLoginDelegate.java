package com.dodopal.product.delegate;

import com.dodopal.api.users.dto.MobileUserDTO;
import com.dodopal.common.model.DodopalResponse;

/**
 * @author lifeng@dodopal.com
 */

public interface UserLoginDelegate {
	/**
	 * 用户登录手机端或VC端
	 * 
	 * @param userName
	 * @param password
	 * @param source
	 * @return
	 */
	public DodopalResponse<MobileUserDTO> login(String userName, String password, String source, String loginid, String usertype);
}
