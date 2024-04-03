package com.magic.system.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.magic.system.entity.Class;
import com.magic.system.entity.dto.PageDTO;
import com.magic.system.mapper.ClassMapper;
import com.magic.system.service.IClassService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Class> implements IClassService {

    @Override
    public List<Class> getClassListByCondition(PageDTO pageDTO) {
        Page<PageDTO> page = new Page<>();
        return this.baseMapper.getClassList(pageDTO,page);
    }
}
