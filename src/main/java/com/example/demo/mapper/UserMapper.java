package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author GYj
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    User getOneUserByAccount(String s);
}
