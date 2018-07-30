package com.test.controller;

import com.test.pojo.User;
import com.test.service.IUserService;
import com.test.service.impl.UserServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: QuincySu
 * Date: 2018-07-30
 * Time: 10:03
 */
@Controller
@RequestMapping("/test")
public class UserController {
    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    private User user = new User();

    @RequestMapping(value = "/userLogin.from", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public @ResponseBody
    Object userLogin(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        //用户名
        String name = new String(request.getParameter("name").getBytes("iso-8859-1"), "utf-8");
        //密码
        String password = request.getParameter("password").trim();
        if (name.equals("") || password.equals("")) {
            return "blank";
        }
        user.setName(name);
        User res = userService.getUser(user);
        if (res != null) {
            if (res.getPassword().equals(password)) {
                return "login success";
            } else {
                return "password error";
            }
        } else {
            return "user not exist";
        }
    }
}
