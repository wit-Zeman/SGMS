package com.magic.system.controller;

import com.magic.system.common.Result;
import com.magic.system.entity.dto.GradePageDTO;
import com.magic.system.service.IGradeService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@RestController
@RequestMapping("/system/grade")
public class GradeController {

    @Resource
    private IGradeService gradeService;

    @Operation(summary = "根据条件获取成绩信息列表")
    @PostMapping("/list")
    public Result getGradeList(@Valid @RequestBody GradePageDTO gradePageDTO) {
        return Result.success(gradeService.getGradeListByCondition(gradePageDTO));
    }

}
