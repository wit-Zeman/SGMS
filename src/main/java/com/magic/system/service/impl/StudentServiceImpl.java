package com.magic.system.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.magic.system.entity.Student;
import com.magic.system.entity.dto.StudentPageDTO;
import com.magic.system.mapper.ClassMapper;
import com.magic.system.mapper.StudentMapper;
import com.magic.system.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
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

    @Resource
    private ClassMapper classMapper;

    @Override
    public List<Student> getStudentListByCondition(StudentPageDTO studentPageDTO) {
        Page<StudentPageDTO> page = new Page<>(studentPageDTO.getPage(), studentPageDTO.getPageSize());
        return this.baseMapper.getStudentListByCondition(studentPageDTO, page);
    }

    @Override
    public boolean saveStudent(Student student) {
        Long classId = 0L;
        student.setClassId(classId);
        // 先根据班级名称查出班级ID
        if (student.getClassName() != null){
            classId = classMapper.selectIdByName(student.getClassName());
            if (classId != null){
                student.setClassId(classId);
            }
        }
        return this.save(student);
    }
}
