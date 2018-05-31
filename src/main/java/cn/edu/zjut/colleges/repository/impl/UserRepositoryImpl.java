package cn.edu.zjut.colleges.repository.impl;

import cn.edu.zjut.colleges.dto.User;
import cn.edu.zjut.colleges.mapper.UserMapper;
import cn.edu.zjut.colleges.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Tim on 2018/5/31
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Resource
    private UserMapper myUserMapper;

    @Override
    public int insert(User user) {
        return myUserMapper.insert(user);
    }

    @Override
    public User selectByAccountAndPassword(String account, String password) {
        return myUserMapper.selectByAccountAndPassword(account, password);
    }

    @Override
    public User selectUserById(Integer userId) {
        return myUserMapper.selectByPrimaryKey(userId);
    }
}
