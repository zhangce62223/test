package cn.bdqn.service;

import org.apache.ibatis.annotations.Param;

public interface UserService {

	/**
	 * 删除某角色下的所有用户
	 * @param userRole
	 * @return
	 */
	public int deletUser(Integer userRole);
}
