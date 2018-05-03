package com.hyt.pm.service.impl;

import com.hyt.pm.dao.IUserDAO;
import com.hyt.pm.pojo.User;
import com.hyt.pm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDAO userDAO;
    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDAO.selectByPrimaryKey(userId);
    }

}
