package com.dao.impl;

import com.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Auther: Chun Zhang
 * @Date: 2022/9/5
 * @Description: com.dao.impl
 */

@Repository
public class UserDaoImplB implements UserDao {
    public void add() {
        System.out.println("UserDaoImplB add ...");
    }
}
