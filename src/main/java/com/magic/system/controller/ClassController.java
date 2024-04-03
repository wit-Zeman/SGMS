package com.magic.system.controller;

import com.magic.system.common.Result;
import com.magic.system.entity.dto.PageDTO;
import com.magic.system.service.IClassService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@RestController
@RequestMapping("/system/class")
public class ClassController {

    @Resource
    private IClassService classService;

    @Operation(summary = "根据条件获取班级列表")
    @PostMapping("/list")
    public Result getClassList(@Valid @RequestBody PageDTO pageDTO){
        return Result.success(classService.getClassListByCondition(pageDTO));
    }

}
