package com.tae.dao.impl;

import com.tae.dao.UserDao;
import com.tae.old.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/8/26.
 */
public class UserDaoImpl implements UserDao {
    private SqlSessionFactory sqlSessionFactory;
    //通过构造方法注入
    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory=sqlSessionFactory;
    }

    public User findUserById(Integer id) {
        //sqlSession是线程不安全的，所以它的最佳使用范围在方法体内
        SqlSession openSession = sqlSessionFactory.openSession();

        User user = openSession.selectOne("test.findUserById", id);

        return user;
    }

    public List<User> findUserByUsername(String username) {
        SqlSession openSession = sqlSessionFactory.openSession();
        List<User> list = openSession.selectList("test.findUserByUserName", username);
        return list;
    }
}
