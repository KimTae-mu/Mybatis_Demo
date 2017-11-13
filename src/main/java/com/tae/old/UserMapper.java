package com.tae.old;

import com.tae.old.Orders;
import com.tae.old.QueryVo;
import com.tae.old.User;

import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/10/11.
 */
public interface UserMapper {
    /*mapper接口实现*/
    public User findUserById(Integer id);

    /*使用注解方式实现*/
//    @Select("SELECT * FROM user WHERE username like '%${value}%'")
    public List<User> findUserByUserName(String username);

    public List<User> findUserbyVo(QueryVo vo);

    public Integer findUserCount();

    public List<User> findUserByUsernameAndSex(User user);

    public List<User> findUserByIds(QueryVo vo);

    public List<Orders> findOrdersAndUser2();

    public List<User> findUserAndOrders();

}
