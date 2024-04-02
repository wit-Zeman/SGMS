package com.magic.system.entity.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class GradePageDTO {

    private String studentName;

    private String course;

    // 考试类型: 0-月考，1-期中考试，2-期末考试
    private Integer type;

    private String startDate;

    private String endDate;

    @NotNull(message = "页码不能为空")
    private Integer page;

    @NotNull(message = "页大小不能为空")
    private Integer pageSize;
}
