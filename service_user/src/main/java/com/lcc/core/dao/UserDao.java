package com.lcc.core.dao;

import com.lcc.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lcc on 2017/1/3.
 */
public interface UserDao {

    /**
     * 根据手机号查询用户对象
     */
    User queryByPhone(long userPhone);

    /**
     * 根据偏移量查询用户列表
     */
    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 增加积分
     */
    int addScore(@Param("add")int add);
}
