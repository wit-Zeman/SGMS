package com.magic.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 教师信息表
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@Getter
@Setter
@TableName("t_teacher")
@Schema(name = "Teacher", description = "教师信息表")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "教师id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "教师姓名")
    private String name;

    @Schema(description = "性别：1-男，2-女，3-未知")
    private Byte gender;

    @Schema(description = "年龄")
    private Integer age;

    @Schema(description = "出生日期")
    private LocalDate birth;

    @Schema(description = "联系方式")
    private String contact;

    @Schema(description = "住址")
    private String address;

    @Schema(description = "学历")
    private String education;

    @Schema(description = "专业")
    private String major;

    @Schema(description = "入职日期")
    private LocalDate entryDate;

    @Schema(description = "离职日期")
    private LocalDate dimissionDate;

    @Schema(description = "所属学院")
    private String department;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
