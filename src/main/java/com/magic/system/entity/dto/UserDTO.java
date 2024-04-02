package com.magic.system.entity.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserDTO {

    @NotBlank(message = "用户名不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;

    /**
     * 用户权限：1-学生，2-教师
     */
    @NotNull(message = "用户权限不能为空")
    private Integer role;

    private Integer page;

    private Integer pageSize;
}
