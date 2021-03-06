package cn.edu.zjut.colleges.controller;

import cn.edu.zjut.colleges.dto.User;
import cn.edu.zjut.colleges.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by Tim on 2018/5/19
 */
public class UserControllerTest {
    @Test
    public void showLoginPage() throws Exception {
        UserServiceImpl mockService = mock(UserServiceImpl.class);
        UserController controller = new UserController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/user/login"))
                .andExpect(view().name("loginPage"));
    }

    @Test
    public void processLogin() throws Exception {
    }

    @Test
    public void showRegisterPage() throws Exception {
    }

    @Test
    public void processRegister() throws Exception {
        UserServiceImpl mockService = mock(UserServiceImpl.class);
        User unsaved = new User();
        unsaved.setAccount("yzt126");
        unsaved.setPassword("yzt126");
        unsaved.setBirthday("2018-05-31");
        unsaved.setNativePlace("Here");
        unsaved.setEmail("wisetim@163.com");

        User saved = new User();
        saved.setUserId(4);
        saved.setAccount("yzt126");
        saved.setPassword("yzt126");
        saved.setBirthday("2018-05-31");
        saved.setNativePlace("Here");
        saved.setEmail("wisetim@163.com");
        when(mockService.register(unsaved)).thenReturn(true);
    }

    @Test
    public void showUserProfile() throws Exception {
    }

}