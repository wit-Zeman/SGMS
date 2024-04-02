package com.magic.system.entity.dto;



import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PageDTO {

    @NotNull(message = "页码不能为空")
    private Integer page;

    @NotNull(message = "页大小不能为空")
    private Integer pageSize;
}
