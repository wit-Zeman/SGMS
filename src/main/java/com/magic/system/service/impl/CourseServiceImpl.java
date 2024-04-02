package com.magic.system.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.magic.system.entity.Course;
import com.magic.system.entity.dto.CourseDTO;
import com.magic.system.entity.dto.CoursePageDTO;
import com.magic.system.mapper.CourseMapper;
import com.magic.system.service.ICourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
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
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements ICourseService {

    @Override
    public List<Course> getCourseListByCondition(CoursePageDTO coursePageDTO) {
        Page<CourseDTO> page = new Page<>(coursePageDTO.getPage(),coursePageDTO.getPageSize());
        return this.baseMapper.selectListByCondition(coursePageDTO,page);
    }
}
