package com.xincl.dao;

import com.xincl.pojo.User;
import com.xincl.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestUserMapper {
    static Logger logger = Logger.getLogger(TestUserMapper.class);
    //获取所有用户
    @Test
    public void testgetUser(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testgetUserID(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserid(1004);
        for (User user:userList){
            System.out.println(user);
        }
        logger.info("这是成功之后的INFO");
        logger.debug("这是成功之后的DEBUG");
        sqlSession.close();
    }

    @Test
    public void testgetUser2(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("id",1001);
        map.put("name","猪");
        List<User> userList = mapper.getUser(map);
        for (User user:userList){
            System.out.println(user);
        }
        logger.info("这是成功之后的INFO");
        logger.debug("这是成功之后的DEBUG");
        sqlSession.close();
    }

    @Test
    public void testinsert(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insert(new User(1005,"小奶昔","xnx"));
        sqlSession.commit();
        logger.info("这是成功之后的INFO");
        logger.debug("这是成功之后的DEBUG");
        sqlSession.close();
    }

    @Test
    public void testinsert2(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("id",1007);
        map.put("name","小芒果");
        map.put("password","xmg");
        mapper.insert2(map);
        sqlSession.commit();
        logger.info("这是成功之后的INFO");
        logger.debug("这是成功之后的DEBUG");
        sqlSession.close();
    }

    @Test
    public void testupdate(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.update(new User(1006,"小芒果","xmg"));
        sqlSession.commit();
        logger.info("这是成功之后的INFO");
        logger.debug("这是成功之后的DEBUG");
        sqlSession.close();
    }

    @Test
    public void testupdate2(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("id",1007);
        map.put("password","lxysxmga");
        mapper.update2(map);
        sqlSession.commit();
        logger.info("这是成功之后的INFO");
        logger.debug("这是成功之后的DEBUG");
        sqlSession.close();
    }

    @Test
    public void delete(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.delete(1007);
        sqlSession.commit();
        logger.info("这是成功之后的INFO");
        logger.debug("这是成功之后的DEBUG");
        sqlSession.close();
    }


}
