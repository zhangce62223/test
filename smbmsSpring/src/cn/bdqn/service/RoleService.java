package cn.bdqn.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.entity.Role;
import cn.bdqn.entity.User;

public interface RoleService {

	/**
	 * 根据角色名称模糊查询角色信息
	 * @return
	 */
	public List<Role> findRoleList(Role role);
	
	/**
	 * 添加角色信息
	 * @param role
	 * @return
	 */
	public int addRole(Role role);
	
	/**
	 * 根据角色id修改角色信息
	 * @param role
	 * @return
	 */
	public int updateRle(Role role);
	
	/**
	 * 通过id删除角色信息
	 * @param id
	 * @return
	 */
	public int deletRole(@Param("id")Integer id);
	
	/**
	 * 通过id查询角色下的用户信息
	 * @param id
	 * @return
	 */
	public List<User> findRoleByUser(@Param("id") Integer id);
}
