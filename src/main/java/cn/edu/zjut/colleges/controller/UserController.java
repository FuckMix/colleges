package cn.edu.zjut.colleges.controller;

import cn.edu.zjut.colleges.dto.User;
import cn.edu.zjut.colleges.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * Created by Tim on 2018/5/18
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "loginPage";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String processLogin(@Valid final User user, Errors errors) {
        if (errors.hasErrors())
            return "loginPage";
        if (userService.login(user)) {
            return "redirect:/user/profile/" + user.getUserId();
        } else {
            return "loginPage";
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegisterPage(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registerPage";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegister(@Valid final User user, Errors errors) {
        if (errors.hasErrors()) return "registerPage";
        if (userService.register(user)) {
            return "redirect:/user/profile/" + user.getUserId();
        } else {
            return "registerPage";
        }
    }

    @RequestMapping(value = "/profile/{userId}", method = RequestMethod.GET)
    public String showUserProfile(
            @PathVariable int userId, Model model) {
        User user = userService.findUserById(userId);
        if (user == null) {
            return "redirect:/loginPage";
        } else {
            model.addAttribute("user", user);
            return "userProfile";
        }
    }
}
