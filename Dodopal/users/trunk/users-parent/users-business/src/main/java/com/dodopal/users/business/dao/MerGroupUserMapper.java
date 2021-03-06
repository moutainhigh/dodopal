package com.dodopal.users.business.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dodopal.users.business.model.MerGroupUser;
import com.dodopal.users.business.model.MerGroupUserFind;

/**
 * 集团用户管理
 * @author
 *
 */
public interface MerGroupUserMapper {
	
    /**
     * 查询集团用户
     * @param findBean 查询条件
     * @return
     */
    List<MerGroupUser> findMerGpUsers(MerGroupUserFind findBean);
    
    /**
     * 查询集团用户(分页)
     * @param findBean 查询条件
     * @return
     */
    List<MerGroupUser> findMerGpUsersByPage(MerGroupUserFind findBean);
    
    /**
     * 查询集团用户详细信息
     * @param id 集团用户ID
     * @return
     */
    MerGroupUser findMerGpUserById(String id);
    
    /**
     * 检查符合条件的集团用户是否存在
     * @param findBean 查询条件
     * @return
     */
    int getMerGpUserCount(MerGroupUserFind findBean);
    
    /**
     * 添加集团用户
     * @param gpUserDTO 集团用户信息
     * @return
     */
    void insertMerGpUser(MerGroupUser gpUser);
    
    /**
     * 修改集团用户
     * @param gpUserDTO 集团用户信息
     * @return
     */
    int updateMerGpUser(MerGroupUser gpUser);
    
    /**
     * 删除集团用户
     * @param gpUserDTO 集团用户信息
     * @return
     */
    int deleteMerGpUser(String gpUserId);
    
    /**
     * 查询集团用户信息 根据：商户号、公交卡号、在职
     * @param 
     * @return
     */
    MerGroupUser getMerGpUserByCarCode(MerGroupUserFind findBean);

    /**
     * 查询集团人员信息(在职、部门启用) 根据：商户号、当前登录用户名
     * @param merCode
     * @param merUserName
     * @return
     */
    public List<MerGroupUser> findMerGpUsersByUserName(@Param("merCode")String merCode, @Param("merUserName")String merUserName);
    
    

}
