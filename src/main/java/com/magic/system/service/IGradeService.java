package com.magic.system.service;

import com.magic.system.entity.Grade;
import com.baomidou.mybatisplus.extension.service.IService;
import com.magic.system.entity.dto.GradePageDTO;
import com.magic.system.entity.vo.GradeVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
public interface IGradeService extends IService<Grade> {

    List<GradeVO> getGradeListByCondition(GradePageDTO gradePageDTO);
}
