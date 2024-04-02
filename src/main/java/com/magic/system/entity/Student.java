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
 * 学生信息表
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@Getter
@Setter
@TableName("t_student")
@Schema(name = "Student", description = "学生信息表")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "学生id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "学生姓名")
    private String name;

    @Schema(description = "学生性别：0-男，1-女,2-未知")
    private Byte gender;

    @Schema(description = "学生年龄")
    private Integer age;

    @Schema(description = "班级id")
    private Long classId;

    @Schema(description = "入学日期")
    private LocalDate entryDate;

    @Schema(description = "联系方式")
    private String contact;

    @Schema(description = "家庭地址")
    private String address;

    @Schema(description = "出生日期")
    private LocalDate birth;

    @Schema(description = "籍贯")
    private String nativePlace;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
