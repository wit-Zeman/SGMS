package com.magic.system.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.magic.system.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.magic.system.entity.dto.StudentPageDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * <p>
 * 学生信息表 Mapper 接口
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
public interface StudentMapper extends BaseMapper<Student> {

    List<Student> getStudentListByCondition(@Param("condition") StudentPageDTO studentPageDTO, Page<StudentPageDTO> page);
}
