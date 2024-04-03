package com.magic.system.service;

import com.magic.system.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;
import com.magic.system.entity.dto.TeacherPageDTO;

import java.util.List;

/**
 * <p>
 * 教师信息表 服务类
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
public interface ITeacherService extends IService<Teacher> {

    List<Teacher> getTeacherListByCondition(TeacherPageDTO TeacherPageDTO);
}
