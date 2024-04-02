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
@TableName("t_class")
@Schema(name = "Class", description = "班级管理表")
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "班级id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "班级名称")
    private String className;

    @Schema(description = "班主任")
    private String classTeacher;

    @Schema(description = "班级简介")
    private String introduction;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
