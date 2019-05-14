package com.kaisyuan.blog.Admin.dao;

import com.kaisyuan.blog.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User getUserById(@Param("id")String id);
}
