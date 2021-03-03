package com.example.springcloud.service;

import com.example.springcloud.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ChaosBear
 * @since 2021-03-03
 */
public interface UserService extends IService<User> {
    User findUserById(int id);

}
