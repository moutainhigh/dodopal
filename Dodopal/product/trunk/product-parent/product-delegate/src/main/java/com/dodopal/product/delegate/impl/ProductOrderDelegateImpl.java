package com.dodopal.product.delegate.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dodopal.api.product.dto.ProductOrderDTO;
import com.dodopal.api.product.dto.ProductOrderDetailDTO;
import com.dodopal.api.product.dto.query.ProductOrderQueryDTO;
import com.dodopal.api.product.facade.ProductOrderFacade;
import com.dodopal.api.users.dto.MerchantDTO;
import com.dodopal.api.users.dto.MerchantUserDTO;
import com.dodopal.api.users.facade.MerchantFacade;
import com.dodopal.api.users.facade.MerchantUserFacade;
import com.dodopal.common.model.DodopalDataPage;
import com.dodopal.common.model.DodopalResponse;
import com.dodopal.hessian.RemotingCallUtil;
import com.dodopal.product.delegate.BaseDelegate;
import com.dodopal.product.delegate.ProductOrderDelegate;
import com.dodopal.product.delegate.constant.DelegateConstant;

@Service("productOrderDelegate")
public class ProductOrderDelegateImpl extends BaseDelegate implements ProductOrderDelegate {

    /**
     * 5.2 产品库中公交卡充值订单 --5.2.1 订单查询 产品库提供标准的订单查询页面给终端商户（各种网点）和个人。
     */
    @Override
    public DodopalResponse<DodopalDataPage<ProductOrderDTO>> findProductOrder(ProductOrderQueryDTO prdOrderQuery) {
        ProductOrderFacade facade = RemotingCallUtil.getHessianService("http://localhost:8084/product-web/hessian/index.do?id=", ProductOrderFacade.class);
        return facade.findProductOrder(prdOrderQuery);
    }

    /**
     * 5.2 产品库中公交卡充值订单 --5.2.2 订单查看 用户选择一条公交卡充值订单，点击“查看”按钮，页面向用户展示详情。
     * 订单编号、商户名称、产品编号
     * 、产品名称、充值金额、城市、实付金额、成本价（商户进货价）、订单时间、商户利润（这个字段对个人用户不要显示）、卡号、充值前金额
     * 、充值后金额、充值前账户可用余额、充值后账户可用余额、订单状态、外部订单号（仅限于外部商户）、操作员名称、POS编号、POS备注。
     */
    @Override
    public DodopalResponse<ProductOrderDetailDTO> findProductOrderDetails(String proOrderNum) {
        ProductOrderFacade facade = RemotingCallUtil.getHessianService("http://localhost:8084/product-web/hessian/index.do?id=", ProductOrderFacade.class);
        return facade.findProductOrderDetails(proOrderNum);
    }
    /**
     * 根据商户用户号查询商户类型
     */
    @Override
    public DodopalResponse<MerchantDTO> findMerchantUserByMerCode(String merCode) {
        MerchantFacade facade = getFacade(MerchantFacade.class, DelegateConstant.FACADE_USERS_URL);
        return facade.findMerchantInfoByMerCode(merCode);
    }
    /**
     * 根据商户号管理员查看所有的用户号
     */
    @Override
    public DodopalResponse<List<MerchantUserDTO>> findMerOperators(MerchantUserDTO merUserDto) {
        MerchantFacade facade = getFacade(MerchantFacade.class, DelegateConstant.FACADE_USERS_URL);
        return facade.findMerOperators(merUserDto);
    }

}
