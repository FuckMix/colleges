package cn.edu.zjut.colleges.service;

import cn.edu.zjut.colleges.entity.User;
import cn.edu.zjut.colleges.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserMapper myUserMapper;

    @Autowired
    public UserService(UserMapper myUserMapper) {
        this.myUserMapper = myUserMapper;
    }

    public boolean login(User loginUser) {
        User user = myUserMapper.selectByAccountAndPassword(
                loginUser.getAccount(), loginUser.getPassword());
        if (user != null) {
            loginUser.setUserId(user.getUserId());
            return true;
        } else {
            return false;
        }
    }

    public boolean register(User user) {
        return myUserMapper.insert(user) != 0;
    }

    public User findUserById(int userId) {
        return myUserMapper.selectByPrimaryKey(userId);
    }

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
