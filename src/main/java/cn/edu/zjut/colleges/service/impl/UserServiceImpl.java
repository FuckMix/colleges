package cn.edu.zjut.colleges.service.impl;

import cn.edu.zjut.colleges.dto.User;
import cn.edu.zjut.colleges.repository.UserRepository;
import cn.edu.zjut.colleges.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public boolean login(User loginUser) {
        User user = userRepository.selectByAccountAndPassword(
                loginUser.getAccount(), loginUser.getPassword());
        if (user != null) {
            loginUser.setUserId(user.getUserId());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean register(User user) {
        return userRepository.insert(user) != 0;
    }

    @Override
    public User findUserById(int userId) {
        return userRepository.selectUserById(userId);
    }

    @Override
    public boolean update(User loginUser) {
        return true;
//        ActionContext ctx = ActionContext.getContext();
//        session = ctx.getSession();
//        request = (Map<String, String>) ctx.get("request");
//        UserDao dao = new UserDao();
//        try {
//            dao.update(loginUser);
//            session.put("loginUser", loginUser);
//            request.put("tip", "修改个人信息成功！");
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
    }

    @Override
    public boolean delete(User loginUser) {
        return true;
//        ActionContext ctx = ActionContext.getContext();
//        session = ctx.getSession();
//        request = (Map<String, String>) ctx.get("request");
//        UserDao dao = new UserDao();
//        try {
//            dao.delete(loginUser.getUserId());
//            session.remove("user");
//            session.remove("loginUser");
//            request.put("tip", "删除个人信息成功，请重新登录！");
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
    }

    @Override
    public boolean logout() {
        return true;
//        if (session == null) session = ActionContext.getContext().getSession();
//        if (session.containsKey("loginUser")) {
//            session.remove("loginUser");
//            session.remove("user");
//            return true;
//        }
//        return false;
    }
}
