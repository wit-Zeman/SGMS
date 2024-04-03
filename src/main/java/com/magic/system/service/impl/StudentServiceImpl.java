package com.magic.system.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.magic.system.entity.Student;
import com.magic.system.entity.dto.StudentPageDTO;
import com.magic.system.mapper.StudentMapper;
import com.magic.system.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 学生信息表 服务实现类
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Override
    public List<Student> getStudentListByCondition(StudentPageDTO studentPageDTO) {
        Page<StudentPageDTO> page = new Page<>(studentPageDTO.getPage(),studentPageDTO.getPageSize());
        return this.baseMapper.getStudentListByCondition(studentPageDTO,page);
    }
}
