package com.magic.system.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.magic.system.entity.Teacher;
import com.magic.system.entity.dto.TeacherDTO;
import com.magic.system.mapper.TeacherMapper;
import com.magic.system.service.ITeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 教师信息表 服务实现类
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

    @Override
    public List<Teacher> getTeacherListByCondition(TeacherDTO teacherDTO) {
        Page<TeacherDTO> page = new Page<>(teacherDTO.getPage(), teacherDTO.getPageSize());
        return this.baseMapper.getTeacherListByCondition(teacherDTO,page);
    }
}
