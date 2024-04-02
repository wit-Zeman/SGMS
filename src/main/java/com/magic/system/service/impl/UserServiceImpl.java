package com.magic.system.service.impl;

import com.magic.system.entity.User;
import com.magic.system.mapper.UserMapper;
import com.magic.system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
