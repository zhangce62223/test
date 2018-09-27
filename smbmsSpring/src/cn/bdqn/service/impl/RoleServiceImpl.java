package cn.bdqn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bdqn.dao.RoleMapper;
import cn.bdqn.entity.Role;
import cn.bdqn.entity.User;
import cn.bdqn.service.RoleService;

@Service("roleService") //业务类注解
public class RoleServiceImpl implements RoleService {
	
	@Autowired //自动写入注解
	private RoleMapper roleMapper;		//角色dao接口
	
	//业务类查找角色信息
	@Override
	public List<Role> findRoleList(Role role) {
		
		return roleMapper.findRoleList(role);
	}
	//添加角色信息
	@Override
	public int addRole(Role role) {
		// TODO Auto-generated method stub
		return roleMapper.addRole(role);
	}
	//修改角色信息
	@Override
	public int updateRle(Role role) {
		
		return roleMapper.updateRle(role);
	}
	//通过id删除角色信息
	@Override
	public int deletRole(Integer id) {
		// TODO Auto-generated method stub
		return roleMapper.deletRole(id);
	}
	//通过id查询角色下的用户信息
	@Override
	public List<User> findRoleByUser(Integer id) {
		// TODO Auto-generated method stub
		return roleMapper.findRoleByUser(id);
	}
	
	

}
