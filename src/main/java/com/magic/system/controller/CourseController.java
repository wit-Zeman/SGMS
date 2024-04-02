package com.magic.system.controller;

import com.magic.system.common.Result;
import com.magic.system.entity.Course;
import com.magic.system.entity.dto.CoursePageDTO;
import com.magic.system.service.ICourseService;
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
@RequestMapping("/system/course")
public class CourseController {

    @Resource
    private ICourseService courseService;

    @Operation(summary = "根据条件获取课程信息列表")
    @PostMapping("/list")
    public Result getCourseList(@Valid @RequestBody CoursePageDTO coursePageDTO) {
        return Result.success(courseService.getCourseListByCondition(coursePageDTO));
    }

    @Operation(summary = "根据id获取课程信息")
    @GetMapping("/{id}")
    public Result getCourseById(@PathVariable("id") Long id) {
        return Result.success(courseService.getById(id));
    }

    @Operation(summary = "添加课程信息")
    @PostMapping("/save")
    public Result addCourse(@Valid @RequestBody Course course) {
        courseService.save(course);
        return Result.success();
    }

    @Operation(summary = "修改课程信息")
    @PutMapping("/{id}")
    public Result updateCourse(@PathVariable("id") Long id, @Valid @RequestBody Course course) {
        course.setId(id);
        courseService.updateById(course);
        return Result.success();
    }

    @Operation(summary = "删除课程信息")
    @DeleteMapping("/{id}")
    public Result deleteCourse(@PathVariable("id") Long id) {
        courseService.removeById(id);
        return Result.success();
    }

}
