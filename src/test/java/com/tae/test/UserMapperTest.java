package com.tae.test;

import com.tae.mapper.UserMapper;
import com.tae.pojo.User;
import com.tae.pojo.UserExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/10/11.
 */
public class UserMapperTest {
    private SqlSessionFactory factory;

    //作用：在测试方法前执行这个方法
    @Before
    public void setUp() throws Exception {
        String resource="SqlMapConfig.xml";
        //通过流将核心配置文件读取进来
        InputStream inputStream= Resources.getResourceAsStream(resource);
        //通过核心配置文件输入流来创建会话工厂
        factory=new SqlSessionFactoryBuilder().build(inputStream);
    }

/*    @Test
    public void testFindUserById() throws Exception{
        SqlSession openSession = factory.openSession();
        //通过getMapper方法来实例化接口
        UserMapper mapper = openSession.getMapper(UserMapper.class);

        User user = mapper.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void testFindUserByUsername() throws Exception{
        SqlSession openSession = factory.openSession();
        UserMapper mapper=openSession.getMapper(UserMapper.class);

        List<User> userList = mapper.findUserByUserName("王");
        System.out.println(userList);
    }

    @Test
    public void testfindUserbyVo() throws Exception{
        SqlSession openSession = factory.openSession();
        UserMapper mapper=openSession.getMapper(UserMapper.class);

        QueryVo vo=new QueryVo();
        User user=new User();
        user.setUsername("王");
        user.setSex("1");
        vo.setUser(user);

        List<User> list = mapper.findUserbyVo(vo);
        System.out.println(list);
    }

    @Test
    public void testFindUserCount() throws Exception{
        SqlSession openSession = factory.openSession();
        UserMapper mapper=openSession.getMapper(UserMapper.class);

        Integer count=mapper.findUserCount();
        System.out.println("count ====="+count);
    }

    @Test
    public void testfindUserByUsernameAndSex() throws Exception{
        SqlSession openSession = factory.openSession();
        UserMapper mapper=openSession.getMapper(UserMapper.class);

        User user=new User();
        user.setUsername("王");
        user.setSex("1");

        List<User> list = mapper.findUserByUsernameAndSex(user);
        System.out.println(list);
    }

    @Test
    public void testfindUserByIds() throws Exception{
        SqlSession openSession = factory.openSession();
        UserMapper mapper=openSession.getMapper(UserMapper.class);

        QueryVo vo=new QueryVo();
        List<Integer> ids=new ArrayList<Integer>();
        ids.add(1);
        ids.add(16);
        ids.add(22);
        ids.add(28);
        vo.setIds(ids);

        List<User> list = mapper.findUserByIds(vo);
        System.out.println(list);
    }

    @Test
    public void testfindOrdersAndUser2() throws Exception{
        SqlSession openSession = factory.openSession();
        UserMapper mapper=openSession.getMapper(UserMapper.class);

        List<Orders> list = mapper.findOrdersAndUser2();
        System.out.println(list);
    }

    @Test
    public void testfindUserAndOrders() throws Exception{
        SqlSession openSession = factory.openSession();
        UserMapper mapper=openSession.getMapper(UserMapper.class);

        List<User> list = mapper.findUserAndOrders();
        System.out.println(list);
    }
    */

    @Test
    public void testFindUserById() throws Exception{
        SqlSession openSession = factory.openSession();
        UserMapper mapper= openSession.getMapper(UserMapper.class);

        User user = mapper.selectByPrimaryKey(1);
        System.out.println(user);
    }

    @Test
    public void testFindUserAndSex() throws Exception{
        SqlSession openSession = factory.openSession();
        UserMapper mapper = openSession.getMapper(UserMapper.class);

        //创建UserExample对象
        UserExample userExample=new UserExample();
        //通过UserExample对象创建查询条件封装对象(Criteria中是封装的查询条件)
        UserExample.Criteria criteria = userExample.createCriteria();
        //加入查询条件
        criteria.andUsernameLike("%王%");
        criteria.andSexEqualTo("1");
        List<User> list = mapper.selectByExample(userExample);

        System.out.println(list);
    }
}
