package com.magic.system.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.magic.system.common.Result;
import com.magic.system.entity.MsgBoard;
import com.magic.system.entity.dto.MsgBoardDTO;
import com.magic.system.entity.dto.PageDTO;
import com.magic.system.service.IMsgBoardService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 留言板信息表 前端控制器
 * </p>
 *
 * @author magic
 * @since 2024-04-03
 */
@RestController
@RequestMapping("/system/msgBoard")
public class MsgBoardController {

    @Resource
    private IMsgBoardService msgBoardService;

    @Operation(summary = "新增留言")
    @PutMapping("/save")
    public Result saveMsgBoard(@Valid @RequestBody MsgBoardDTO msgBoardDTO) {
        MsgBoard msgBoard = new MsgBoard();
        BeanUtils.copyProperties(msgBoardDTO, msgBoard);
        return Result.success(msgBoardService.save(msgBoard));
    }

    @Operation(summary = "获取留言列表")
    @PostMapping("/list")
    public Result getMsgBoardList() {
        return Result.success(msgBoardService.list());
    }

    @Operation(summary = "根据ID删除留言")
    @DeleteMapping("/{id}")
    public Result deleteMsgBoard(@PathVariable("id") Long id) {
        return Result.success(msgBoardService.removeById(id));
    }

}
