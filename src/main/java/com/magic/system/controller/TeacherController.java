package com.magic.system.controller;

import com.magic.system.common.Result;
import com.magic.system.entity.Teacher;
import com.magic.system.entity.dto.TeacherDTO;
import com.magic.system.entity.vo.TeacherVO;
import com.magic.system.service.ITeacherService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 教师信息表 前端控制器
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@RestController
@RequestMapping("/system/teacher")
public class TeacherController {

    @Resource
    private ITeacherService teacherService;

    @Operation(summary = "根据条件获取教师信息列表")
    @PostMapping("/list")
    public Result getTeacherList(TeacherDTO teacherDTO) {
        List<Teacher> teachers = teacherService.getTeacherListByCondition(teacherDTO);
        List<TeacherVO> teacherVOS = new ArrayList<>();
        for (Teacher teacher : teachers) {
            TeacherVO teacherVO = new TeacherVO();
            teacherVO.setId(teacher.getId());
            teacherVO.setName(teacher.getName());
            teacherVO.setAge(teacher.getAge());
            teacherVO.setContact(teacher.getContact());
            teacherVO.setEducation(teacher.getEducation());
            teacherVO.setMajor(teacher.getMajor());
            teacherVO.setGender(teacher.getAge());
            teacherVO.setEntryDate(teacher.getEntryDate());
            teacherVO.setDimissionDate(teacher.getDimissionDate());
            teacherVO.setDepartment(teacher.getDepartment());
            teacherVOS.add(teacherVO);
        }
        return Result.success(teacherVOS);
    }

    @Operation(summary = "根据id获取教师信息")
    @GetMapping("/{id}")
    public Result getTeacherById(@PathVariable("id") Long id) {
        return Result.success(teacherService.getById(id));
    }

    @Operation(summary = "添加教师信息")
    @PostMapping("/save")
    public Result addTeacher(@RequestBody Teacher teacher) {
        return teacherService.save(teacher) ? Result.success() : Result.fail();
    }

    @Operation(summary = "修改教师信息")
    @PutMapping("/update")
    public Result updateTeacher(@RequestBody Teacher teacher) {
        return teacherService.updateById(teacher) ? Result.success() : Result.fail();
    }

    @Operation(summary = "根据id删除教师信息")
    @DeleteMapping("/{id}")
    public Result deleteTeacher(@PathVariable("id") Long id) {
        return teacherService.removeById(id) ? Result.success() : Result.fail();
    }


}
