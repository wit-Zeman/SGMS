package com.magic.system.service;

import com.magic.system.entity.Class;
import com.baomidou.mybatisplus.extension.service.IService;
import com.magic.system.entity.dto.PageDTO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
public interface IClassService extends IService<Class> {

    List<Class> getClassListByCondition(PageDTO pageDTO);
}
