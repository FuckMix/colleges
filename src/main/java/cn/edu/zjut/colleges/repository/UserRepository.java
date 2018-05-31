package cn.edu.zjut.colleges.repository;

import cn.edu.zjut.colleges.dto.User;

/**
 * Created by Tim on 2018/5/31
 */
public interface UserRepository {
    public int insert(User user);

    public User selectByAccountAndPassword(String account, String password);

    public User selectUserById(Integer userId);
}
