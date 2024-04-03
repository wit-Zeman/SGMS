package com.magic.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 留言板信息表
 * </p>
 *
 * @author magic
 * @since 2024-04-03
 */
@Getter
@Setter
@TableName("t_msg_board")
@Schema(name = "MsgBoard", description = "留言板信息表")
public class MsgBoard implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
    @TableId(type = IdType.AUTO)
    private Long id;

    @Schema(description = "留言人")
    private Long userId;

    @Schema(description = "留言板内容")
    private String content;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
