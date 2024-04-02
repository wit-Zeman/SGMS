package com.magic.system.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.magic.system.entity.Course;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.magic.system.entity.dto.CourseDTO;
import com.magic.system.entity.dto.CoursePageDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
public interface CourseMapper extends BaseMapper<Course> {

    List<Course> selectListByCondition(@Param("condition")CoursePageDTO coursePageDTO, Page<CourseDTO> page);
}
