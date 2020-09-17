package com.xincl.dao;

import com.xincl.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //获取所有用户
    List<User> getUserList();

    //根据用户ID进行检索
    List<User> getUserid(int id);

    //根据用户ID或者用户名称进行模糊查询
    List<User> getUser(Map<String,Object> map);

    //插入一个新的信息
    int insert(User user);

    //插入一个用户，Map方法
    int insert2(Map<String,Object> map);

    //通过ID，修改内容
    int update(User user);

    //通过ID，修改内容 map方法
    int update2(Map<String,Object> map);

    //根据ID删除一个用户
    int delete(int id);

}
