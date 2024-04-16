package com.magic.system.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.magic.system.entity.Class;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.magic.system.entity.dto.PageDTO;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
public interface ClassMapper extends BaseMapper<Class> {

    List<Class> getClassList(PageDTO pageDTO, Page<PageDTO> page);

    Long selectIdByName(String className);
}
