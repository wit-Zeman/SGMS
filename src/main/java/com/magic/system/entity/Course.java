package com.magic.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("t_course")
@Schema(name = "Course", description = "课程信息表")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "课程id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

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

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
