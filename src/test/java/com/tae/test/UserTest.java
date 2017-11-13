package com.tae.test;

import com.tae.old.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/8/25.
 */
public class UserTest {
    @Test
    public void testFindUserById() throws IOException {
        String resource="SqlMapConfig.xml";
        //通过流将核心配置文件读取进来
        InputStream inputStream= Resources.getResourceAsStream(resource);
        //通过核心配置文件输入流来创建会话工厂
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂创建会话
        SqlSession openSession = factory.openSession();

        //第一个参数：所调用的sql语句=namespace+sql的id
        User user=openSession.selectOne("test.findUserById", 1);
        System.out.println(user);
        openSession.close();
    }

    @Test
    public void testFindUserByUsername() throws IOException {
        String resource="SqlMapConfig.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession openSession = factory.openSession();

        List<User> list = openSession.selectList("test.findUserByUserName", "王");
        System.out.println(list);
    }

    @Test
    public void testInsertUser() throws IOException {
        String resource="SqlMapConfig.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession openSession = factory.openSession();

        User user=new User();
        user.setUsername("思思");
        user.setBirthday(new Date());
        user.setSex("1");
        user.setAddress("北京");

        openSession.insert("test.insertUser",user);
        //提交事务  mybatis会自动开启事务，但是它不知道何时提交，所以需要手动提交事务
        openSession.commit();
        System.out.println(user.getId());
    }
}
