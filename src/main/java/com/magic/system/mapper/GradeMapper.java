package com.magic.system.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.magic.system.entity.Grade;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.magic.system.entity.dto.GradePageDTO;
import com.magic.system.entity.vo.GradeVO;
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
public interface GradeMapper extends BaseMapper<Grade> {

    List<GradeVO> selectListByCondition(@Param("condition") GradePageDTO gradePageDTO, Page<GradePageDTO> page);
}
