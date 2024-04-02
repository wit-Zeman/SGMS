package com.magic.system.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@Tag(name = "ClassController", description = "班级管理")
@RestController
@RequestMapping("/system/class")
public class ClassController {

}
