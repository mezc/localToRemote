package com.dao.impl;

import com.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Auther: Chun Zhang
 * @Date: 2022/9/5
 * @Description: com.dao.impl
 */
// 实现接口
//持久化 -》注解选择： @Repository
@Repository
public class UserDaoImplA implements UserDao {
    public void add() {
        System.out.println("UserDaoImplA add ...");
    }
}
