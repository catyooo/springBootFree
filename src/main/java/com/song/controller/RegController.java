package com.song.controller;

import com.song.common.RetCode;
import com.song.controller.desk.Views;
import com.song.entity.User;
import com.song.service.RegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 注册控制层
 * <p>
 * Created by IntelliJ IDEA.
 * User: zhangchao
 * Date: 2018/1/15/0015
 * Time: 10:55
 */
@Controller
public class RegController extends BaseController {

    @Autowired
    private RegService regService;

    /**
     * 跳转注册页
     *
     * @return
     */
    @RequestMapping(value = "/reg")
    public String reg() {
        return getView(Views.REG);
    }

    /**
     * 注册
     *
     * @param user 用户参数
     * @return
     */
    @RequestMapping(value = "/regSub", method = RequestMethod.POST)
    @ResponseBody
    public RetCode<?> regSub(User user) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            map.put("1", "一");
            map.put("2", "二");
            map.put("3", "三");
            return RetCode.success("厉害了", map);
        } catch (Exception e) {
            return RetCode.serverError();
        }
    }
}
