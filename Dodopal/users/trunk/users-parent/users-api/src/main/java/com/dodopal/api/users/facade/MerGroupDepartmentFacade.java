package com.dodopal.api.users.facade;

import java.util.List;

import com.dodopal.api.users.dto.MerGroupDepartmentDTO;
import com.dodopal.api.users.dto.query.MerGroupDepartmentQueryDTO;
import com.dodopal.common.enums.ActivateEnum;
import com.dodopal.common.model.DodopalDataPage;
import com.dodopal.common.model.DodopalResponse;

/**
 * @author DingKuiyuan@dodopal.com
 * @version 创建时间：2015年5月5日 下午2:39:27
 */
public interface MerGroupDepartmentFacade {
    

    /** 
     * @Title: findMerGroupDepartmentDTOList 
     * @Description: 查找部门信息列表
     * @param departmentDTO
     * @param fromFlag 发起方 oss 还是 门户 UsersConstants
     * @return    设定文件 
     * DodopalResponse<List<MerGroupDepartmentDTO>>    返回类型 
     * @throws 
     */
    DodopalResponse<List<MerGroupDepartmentDTO>> findMerGroupDepartmentDTOList(MerGroupDepartmentDTO departmentDTO,String fromFlag);
    
    
    DodopalResponse<DodopalDataPage<MerGroupDepartmentDTO>> findMerGroupDepartmentDTOListByPage(MerGroupDepartmentQueryDTO departmentDTO,String fromFlag);

    
    /** 
     * @author dingkuiyuan@dodopal.com
     * @Title: checkMerGroupDepartmentDTO 
     * @Description: 校验部门名称是否重复
     * @param departmentDTO
     * @return   true代表重复的部门名，false则不重复
     * DodopalResponse<MerGroupDepartmentDTO>    返回类型 
     * @throws 
     */
    DodopalResponse<Boolean> checkMerGroupDepartmentDTO(String mercode,String deptName,String id);
    /** 
     * @Title: saveMerGroupDepartmentDTO
     * @Description: 保存部门信息
     * @param departmentDTO
     * @return    设定文件 
     * DodopalResponse<MerGroupDepartmentDTO>    返回类型 
     * @throws 
     */
    DodopalResponse<MerGroupDepartmentDTO> saveMerGroupDepartmentDTO(MerGroupDepartmentDTO departmentDTO);
    /** 
     * @Title: findMerGroupDepartmentDTOById 
     * @Description: 根据部门id查找部门
     * @param departmentDTO
     * @return    设定文件 
     * DodopalResponse<MerGroupDepartmentDTO>    返回类型 
     * @throws 
     */
    DodopalResponse<MerGroupDepartmentDTO> findMerGroupDepartmentDTOById(String id);

    /** 
     * @Title: deleteMerGroupDepartmentDTO 
     * @Description: 删除部门信息，返回
     * @param id
     * @return    设定文件  true成功 false 失败 message属性返回失败原因
     * DodopalResponse<MerGroupDepartmentDTO>    返回类型 
     * @throws 
     */
    DodopalResponse<Boolean> deleteMerGroupDepartmentDTO(List<String> id);
    
    /** 
     * @Title: updateMerGroupDepartmentDTO 
     * @Description: 更新部门信息
     * @param departmentDTO
     * @return    设定文件 true 成功
     * DodopalResponse<MerGroupDepartmentDTO>    返回类型 
     * @throws 
     */
    DodopalResponse<Boolean> updateMerGroupDepartmentDTO(MerGroupDepartmentDTO departmentDTO);
    
    
    /** 
     * @Title: startOrStopMerGroupDepartmentDTO 
     * @Description: 启用停止部门
     * @param startOrStop
     * @param idList
     * @return    设定文件 
     * DodopalResponse<Boolean>    返回类型 
     * @throws 
     */
    DodopalResponse<Boolean> startOrStopMerGroupDepartmentDTO(ActivateEnum startOrStop,List <String> idList);

}
