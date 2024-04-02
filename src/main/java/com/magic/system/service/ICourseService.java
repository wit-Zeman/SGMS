package com.magic.system.service;

import com.magic.system.entity.Course;
import com.baomidou.mybatisplus.extension.service.IService;
import com.magic.system.entity.dto.CoursePageDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
public interface ICourseService extends IService<Course> {

    List<Course> getCourseListByCondition(CoursePageDTO coursePageDTO);
}
