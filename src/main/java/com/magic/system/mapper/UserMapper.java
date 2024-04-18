package com.magic.system.mapper;

import com.magic.system.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
public interface UserMapper extends BaseMapper<User> {

     void updateFileById(@Param("id") Long id, @Param("filePath")String filePath);
}
