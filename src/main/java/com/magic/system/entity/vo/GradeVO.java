package com.magic.system.entity.vo;


import lombok.Data;

@Data
public class GradeVO {

    private Long id;

    private String studentName;

    private String courseName;

    private String time;

    private Integer type;

    private String score;
}
