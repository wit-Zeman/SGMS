package com.magic.system.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@Tag(name = "UserController", description = "用户管理")
@Controller
@RequestMapping("/system/user")
public class UserController {

}
