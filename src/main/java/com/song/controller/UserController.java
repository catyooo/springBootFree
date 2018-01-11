package com.song.controller;

import com.song.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.song.service.UserService;

/**
 * Created by IntelliJ IDEA.
 * User: zhangchao
 * Date: 2018/1/11/0011
 * Time: 13:36
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 返回页面
     *
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {
        return "user/index";
    }

    /**
     * 返回数据
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/show")
    @ResponseBody
    public String show(@RequestParam(value = "name") String name) {
        User user = userService.findUserByName(name);
        if (null != user) {
            return user.getId() + "/" + user.getName() + "/" + user.getPassword();
        } else {
            return "null";
        }
    }
}
