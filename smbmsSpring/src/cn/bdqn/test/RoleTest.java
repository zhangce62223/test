package cn.bdqn.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.entity.Role;
import cn.bdqn.entity.User;
import cn.bdqn.service.RoleService;
import cn.bdqn.service.UserService;

public class RoleTest {
	private Logger logger = Logger.getLogger(RoleTest.class);
	private RoleService roleService;
	private UserService userService;
	@Before
	public void setUp() throws Exception {
		ApplicationContext actxt = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		 roleService  = (RoleService) actxt.getBean("roleService");
		 userService  = (UserService) actxt.getBean("userService");
	}
	//模糊查询角色
	@Test
	public void fiandRole() {
		
		Role role = new Role();
		role.setRoleName("理");
		List<Role> list = roleService.findRoleList(role);
		for(Role r : list){
			logger.info("角色:"+r.getRoleCode()+">>"+r.getRoleName());
		}
	}
	//添加角色
	@Test
	public void addRole() {
		
		Role role = new Role();
		role.setRoleCode("SMBMS_BBBBB");
		role.setRoleName("跑龙套");
		role.setModifyDate(new Date());
		role.setCreatedBy(2);
		role.setCreationDate(new Date());
		int i = roleService.addRole(role);
		if(i>0){
			logger.info("添加成功");
		}else{
			logger.info("添加失败");
		}
	}
	//修改角色信息
	@Test
	public void updateRole() {
		
		Role role = new Role();
		role.setRoleCode("SMBMS_BBBBB0");
		role.setRoleName("跑龙套1");
		role.setId(6);
		int i = roleService.updateRle(role);
		if(i>0){
			logger.info("修改成功");
		}else{
			logger.info("修改失败");
		}
	}

	//删除角色
	@Test
	public void deleRoelByUser() {
		Integer id = 6;
		int i = -1;
		List<User> list = roleService.findRoleByUser(id);
		if(list.size()>0){
			logger.info("该角色下面有用户信息");
			int ui = userService.deletUser(id);
			if(ui>0){
				logger.info("该角色下面有用户信息删除成功");
			}else{
				logger.info("该角色下面有用户信息删除失败");
			}
			i =  roleService.deletRole(6);
		}else{
			i =  roleService.deletRole(6);
		}
		
		if(i>0){
			logger.info("该角色下删除成功");
		}else{
			logger.info("该角色下删除失败");
		}
		
		
	}
}
