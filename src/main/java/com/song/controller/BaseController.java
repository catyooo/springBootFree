package com.song.controller;

/**
 * Controller基类
 * <p>
 * Created by IntelliJ IDEA.
 * User: zhangchao
 * Date: 2018/1/11/0011
 * Time: 16:43
 */
public class BaseController {

    protected String getView(String view) {
		return "/default" + view;
	}
}
