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
 * 
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@Getter
@Setter
@TableName("t_grade")
@Schema(name = "Grade", description = "学生成绩表")
public class Grade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "成绩id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "学生id")
    private Long studentId;

    @Schema(description = "科目")
    private String course;

    @Schema(description = "课程id")
    private Long courseId;

    @Schema(description = "考试类型：0-月考，1-期中，2-期末")
    private Integer type;

    @Schema(description = "考试时间")
    private LocalDate time;

    @Schema(description = "考试分数")
    private String score;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
