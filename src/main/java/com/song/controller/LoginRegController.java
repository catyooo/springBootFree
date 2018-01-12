package com.song.controller;

import com.song.controller.desk.Views;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 登陆注册控制层
 * <p>
 * Created by IntelliJ IDEA.
 * User: zhangchao
 * Date: 2018/1/11/0011
 * Time: 16:35
 */
@Controller
public class LoginRegController extends BaseController {

    /**
     * 跳转登录页
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return getView(Views.LOGIN);
    }

    /**
     * 跳转注册页
     *
     * @return
     */
    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String reg() {
        return getView(Views.REG);
    }
}
