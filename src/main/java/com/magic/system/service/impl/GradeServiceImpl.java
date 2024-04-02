package com.magic.system.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.magic.system.entity.Grade;
import com.magic.system.entity.dto.GradePageDTO;
import com.magic.system.entity.vo.GradeVO;
import com.magic.system.mapper.GradeMapper;
import com.magic.system.service.IGradeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements IGradeService {

    @Override
    public List<GradeVO> getGradeListByCondition(GradePageDTO gradePageDTO) {
        Page<GradePageDTO> page = new Page<>(gradePageDTO.getPage(), gradePageDTO.getPageSize());
        return this.baseMapper.selectListByCondition(gradePageDTO,page);
    }
}
