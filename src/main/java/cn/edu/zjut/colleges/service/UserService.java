package cn.edu.zjut.colleges.service;

import cn.edu.zjut.colleges.dto.User;

/**
 * Created by Tim on 2018/5/31
 */
public interface UserService {
    public boolean login(User loginUser);

    public boolean register(User user);

    public User findUserById(int userId);

    public boolean update(User loginUser);

    public boolean delete(User loginUser);

    public boolean logout();
}
