package com.song.controller;

import com.song.controller.desk.Views;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 登陆控制层
 * <p>
 * Created by IntelliJ IDEA.
 * User: zhangchao
 * Date: 2018/1/11/0011
 * Time: 16:35
 */
@Controller
public class LoginController extends BaseController {

    /**
     * 跳转登录页
     *
     * @return
     */
    @RequestMapping(value = "/login")
    public String login() {
        return getView(Views.LOGIN);
    }

}
