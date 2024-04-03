package com.magic.system.controller;

import com.magic.system.common.Result;
import com.magic.system.entity.Student;
import com.magic.system.entity.dto.StudentPageDTO;
import com.magic.system.service.IStudentService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 学生信息表 前端控制器
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@RestController
@RequestMapping("/system/student")
public class StudentController {

    @Resource
    private IStudentService studentService;

    @Operation(summary = "根据id获取学生信息")
    @GetMapping("/{id}")
    public Result getStudentById(@PathVariable("id") Long id) {
        return Result.success(studentService.getById(id));
    }

    @Operation(summary = "根据条件获取学生信息列表")
    @PostMapping("/list")
    public Result getStudentList(@Valid @RequestBody StudentPageDTO studentPageDTO) {
        return Result.success(studentService.getStudentListByCondition(studentPageDTO));
    }

    @Operation(summary = "添加学生信息")
    @PostMapping("/save")
    public Result addStudent(@RequestBody Student student) {
        return studentService.save(student) ? Result.success() : Result.fail();
    }

    @Operation(summary = "修改学生信息")
    @PutMapping("/update")
    public Result updateStudent(@RequestBody Student student) {
        return studentService.updateById(student) ? Result.success() : Result.fail();
    }

    @Operation(summary = "根据id删除学生信息")
    @DeleteMapping("/{id}")
    public Result deleteStudent(@PathVariable("id") Long id) {
        return studentService.removeById(id) ? Result.success() : Result.fail();
    }

}
