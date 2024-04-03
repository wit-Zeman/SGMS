package com.magic.system.entity.vo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TeacherVO {

    private Long id;

    private String name;

    private Integer age;

    private String contact;

    private String education;

    private String major;

    private Integer gender;

    private LocalDate entryDate;

    private LocalDate dimissionDate;

    private String department;

}
