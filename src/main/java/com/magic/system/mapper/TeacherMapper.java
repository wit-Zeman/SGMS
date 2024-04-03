package com.magic.system.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.magic.system.entity.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.magic.system.entity.dto.TeacherPageDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 教师信息表 Mapper 接口
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
public interface TeacherMapper extends BaseMapper<Teacher> {

    List<Teacher> getTeacherListByCondition(@Param("condition")TeacherPageDTO TeacherPageDTO, Page<TeacherPageDTO> page);
}
