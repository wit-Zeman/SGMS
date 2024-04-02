package com.magic.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.AbstractLambdaWrapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.magic.system.common.Result;
import com.magic.system.entity.User;
import com.magic.system.entity.dto.UserDTO;
import com.magic.system.mapper.UserMapper;
import com.magic.system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public Result login(UserDTO userDTO) {
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();
        LambdaQueryWrapper<User> query = new LambdaQueryWrapper();
        query.eq(User::getUsername, username);
        User user = this.baseMapper.selectOne(query);
        if (user == null || !user.getPassword().equals(password)) {
            return Result.fail();
        }
        return Result.success(user);
    }

    @Override
    public void logout() {

    }

    @Override
    public void register(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        this.baseMapper.insert(user);
    }

    @Override
    public void updateById(Long id, UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        user.setId(id);
        this.baseMapper.updateById(user);
    }
}
