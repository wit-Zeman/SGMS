package com.magic.system.service;

import com.magic.system.common.Result;
import com.magic.system.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.magic.system.entity.dto.UserDTO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
public interface IUserService extends IService<User> {

    Result login(UserDTO userDTO);

    void logout();

    void register(UserDTO userDTO);

    void updateById(Long id, UserDTO userDTO);
}
