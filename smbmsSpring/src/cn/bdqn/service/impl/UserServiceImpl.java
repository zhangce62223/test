package cn.bdqn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bdqn.dao.UserMapper;
import cn.bdqn.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	//删除某角色下的所有用户
	@Override
	public int deletUser(Integer userRole) {
		// TODO Auto-generated method stub
		return userMapper.deletUser(userRole);
	}

}
