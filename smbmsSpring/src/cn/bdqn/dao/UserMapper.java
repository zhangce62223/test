package cn.bdqn.dao;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	/**
	 * 删除某角色下的所有用户
	 * @param userRole
	 * @return
	 */
	public int deletUser(@Param("userRole") Integer userRole);
}
