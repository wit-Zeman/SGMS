package com.magic.system.entity.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class MsgBoardDTO {

    private String content;

    @NotNull(message = "用户id不能为空")
    private Long userId;
}
