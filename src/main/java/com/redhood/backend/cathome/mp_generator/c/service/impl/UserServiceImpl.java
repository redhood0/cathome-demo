package com.redhood.backend.cathome.mp_generator.c.service.impl;

import com.redhood.backend.cathome.mp_generator.c.entity.User;
import com.redhood.backend.cathome.mp_generator.c.mapper.UserMapper;
import com.redhood.backend.cathome.mp_generator.c.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author redhood
 * @since 2020-04-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
