package com.magic.system.entity.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TeacherDTO {

    private String teacherName;

    private String education;

    /**
     * 性别:1-男，2-女，3-未知
     */
    private Integer gender;

    @NotNull(message = "页码不能为空")
    private Integer page;

    @NotNull(message = "页大小不能为空")
    private Integer pageSize;
}
