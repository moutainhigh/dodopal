package com.dodopal.oss.delegate;

import java.util.List;

import com.dodopal.api.card.dto.PosSignInOutDTO;
import com.dodopal.api.product.dto.YktPsamDTO;
import com.dodopal.api.product.dto.query.YktPsamQueryDTO;
import com.dodopal.common.model.DodopalDataPage;
import com.dodopal.common.model.DodopalResponse;

public interface PsamDelegate {

    /**
     * psam卡查询 分页
     * @param yktPsamQueryDTO
     * @return
     */
    public DodopalResponse<DodopalDataPage<YktPsamDTO>> findYktPsamByPage(YktPsamQueryDTO yktPsamQueryDTO);
    
    /**
     * 批量删除
     * @param samNo
     * @return
     */
    public DodopalResponse<String> batchDeleteYktPsamByIds(List<String> ids);
    
    /**
     * 批量启用商户
     * @param 
     * @return DodopalResponse<Integer>
     */
    public DodopalResponse<String> batchActivate(List<String> ids);
    
    
    /**
     * 批量修改查询下载参数
     * @param 
     * @return DodopalResponse<Integer>
     */
    public DodopalResponse<String> batchNeedDownLoad(List<String> ids);
    

    /**
     * 新增psam卡
     * @param yktPsamDTO
     * @return
     */
    public DodopalResponse<String> addYktPsam(YktPsamDTO yktPsamDTO);
    
    
    /**
     * 修改psam卡
     * @param yktPsamDTO
     * @return
     */
    public DodopalResponse<String> updateYktPsam(YktPsamDTO yktPsamDTO);
    
    /**
     * 根据id查询psam卡信息
     * @param id
     * @return
     */
    public DodopalResponse<YktPsamDTO> findPsamById(String id);
    
    
    /**
     * V61签到签退
     * @param posSignInOutDTO
     * @return
     */
    public DodopalResponse<PosSignInOutDTO> posSignInOutForV61(PosSignInOutDTO posSignInOutDTO);

}
