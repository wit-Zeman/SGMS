package com.magic.system.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.magic.system.common.Result;
import com.magic.system.entity.User;
import com.magic.system.entity.dto.PageDTO;
import com.magic.system.entity.dto.UserDTO;
import com.magic.system.service.IUserService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@RestController
@RequestMapping("/system/user")
public class UserController {

    @Resource
    private IUserService userService;

    @Operation(summary = "用户注册")
    @PostMapping("/register")
    public Result register(@Valid @RequestBody UserDTO userDTO) {
        userService.register(userDTO);
        return Result.success();
    }

    @Operation(summary = "用户登录")
    @PostMapping("/login")
    public Result login(@Valid @RequestBody UserDTO userDTO) {
        return userService.login(userDTO);
    }


    @Operation(summary = "用户注销")
    @DeleteMapping("/logout/{id}")
    public Result logout(@PathVariable("id") Integer id) {
        userService.logout();
        return Result.success();
    }

    @Operation(summary = "获取用户信息")
    @GetMapping("/{id}")
    public Result getUserInfo(@PathVariable("id") Long id) {
        return Result.success(userService.getById(id));
    }

    @Operation(summary = "修改用户信息")
    @PutMapping("/{id}")
    public Result updateUserInfo(@PathVariable("id") Long id, @Valid @RequestBody UserDTO userDTO) {
        userService.updateById(id,userDTO);
        return Result.success();
    }

    @Operation(summary = "删除用户")
    @DeleteMapping("/{id}")
    public Result deleteUser(@PathVariable("id") Long id) {
        userService.removeById(id);
        return Result.success();
    }

    @Operation(summary = "获取所有用户")
    @PostMapping("/list")
    public Result getAllUsers(@Valid @RequestBody PageDTO pageDTO) {
        Page<User> page = new Page<>(pageDTO.getPage(), pageDTO.getPageSize());
        return Result.success(userService.list(page));
    }

}
