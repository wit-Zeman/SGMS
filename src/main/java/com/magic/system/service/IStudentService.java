package com.magic.system.service;

import com.magic.system.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.magic.system.entity.dto.StudentPageDTO;

import java.util.List;

/**
 * <p>
 * 学生信息表 服务类
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
public interface IStudentService extends IService<Student> {

    List<Student> getStudentListByCondition(StudentPageDTO studentPageDTO);
}
