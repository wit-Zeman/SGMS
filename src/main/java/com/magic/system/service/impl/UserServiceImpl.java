package com.magic.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.magic.system.common.Result;
import com.magic.system.entity.User;
import com.magic.system.entity.dto.UserDTO;
import com.magic.system.mapper.UserMapper;
import com.magic.system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Value("${file.location}")
    private String fileUrl;

    @Override
    public Result login(UserDTO userDTO) {
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();
        LambdaQueryWrapper<User> query = new LambdaQueryWrapper();
        query.eq(User::getUsername, username);
        User user = this.baseMapper.selectOne(query);
        if (user == null || !user.getPassword().equals(password)) {
            return Result.fail();
        }
        return Result.success(user);
    }

    @Override
    public void logout() {

    }

    @Override
    public void register(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        this.baseMapper.insert(user);
    }

    @Override
    public void updateById(Long id, UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        user.setId(id);
        this.baseMapper.updateById(user);
    }

    @Override
    public void upload(MultipartFile file, Long id) throws Exception {
        if (file.isEmpty()) {
            throw new Exception("上传的文件不能为空");
        }
        // 获取原始文件名
        String originalFilename = file.getOriginalFilename();

//        TODO 文件重命名以防止重复

        // 获取后缀.的索引位置
        int index = originalFilename.lastIndexOf(".");
        String afterPointName = originalFilename.substring(index);
        String newFilename = System.currentTimeMillis() + afterPointName;
        // 将文件输出到指定的目录
        file.transferTo(new File(fileUrl + newFilename));
        String filePath = "http://localhost:8080/file/" + newFilename;
        // 更新文件url
        this.baseMapper.updateFileById(id, filePath);
    }
}
