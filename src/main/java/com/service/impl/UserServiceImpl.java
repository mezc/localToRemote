package com.service.impl;

import com.dao.UserDao;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: Chun Zhang
 * @Date: 2022/9/5
 * @Description: com.service.impl
 */
//加注解：Service 自动实例化 UserServiceImpl, id 就是类名首字母小写
@Service
public class UserServiceImpl implements UserService {
    /*
    @Autowired 根据类型到容器中去寻找对应对象，然后给当前属性赋值，不需要依赖 set 方法；
    属性类型可以是接口，会自动匹配对应的实现类对象；
    @Autowired 配合 @Qualifier 可以通过名称指定注入的对象；
     */
//    @Autowired
//    @Qualifier(value = "userDaoImplB")//通过名称指定注入对象；
    // 默认根据类型到容器中找对象，通过 name 属性指定
    @Resource(name = "userDaoImplB")
    private UserDao userDao;

    //普通数据类型赋值
    @Value("${ssname}")
    private String sname;

    @Value("${ssgender}")
    private String sgender;

    @Value("${ssage}")
    private Integer sage;

    public void add() {
        System.out.println("UserServiceImpl add ...");

        //打印普通数据类型的值：
        System.out.println("sname: " + sname);
        System.out.println("sgender: " + sgender);
        System.out.println("sage: " + sage);

        //调用另一个接口里的方法
        userDao.add();
    }
}
