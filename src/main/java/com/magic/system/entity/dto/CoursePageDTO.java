package com.magic.system.entity.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class CoursePageDTO {

    // 课程名称
    private String courseName;

    // 课程类型：1-必修，2-选修
    private Integer courseType;

    // 课程代码
    private String courseCode;

    // 课程导师
    private String courseInstructor;

    // 课程地点
    private String courseLocation;

    @NotNull(message = "页码不能为空")
    private Integer page;

    @NotNull(message = "页大小不能为空")
    private Integer pageSize;
}
