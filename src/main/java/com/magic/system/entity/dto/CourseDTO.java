package com.magic.system.entity.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CourseDTO {

    @Schema(description = "课程名称")
    private String name;

    @Schema(description = "类型：1-必修，2-选修")
    private Integer type;

    @Schema(description = "课程代码，用于唯一标识课程")
    private String code;

    @Schema(description = "所授课程的教师")
    private String instructor;

    @Schema(description = "上课地点")
    private String location;

    @Schema(description = "课程状态：1-已开设，0-未开设")
    private String status;

    @Schema(description = "教师id")
    private Long teacherId;
}
