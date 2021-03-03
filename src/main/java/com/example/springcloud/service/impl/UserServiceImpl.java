package com.example.springcloud.service.impl;

import com.example.springcloud.entity.User;
import com.example.springcloud.mapper.UserDao;
import com.example.springcloud.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ChaosBear
 * @since 2021-03-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Override
    public User findUserById(int id) {
        return getById(id);
    }


}
