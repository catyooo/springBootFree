package com.song.controller.constant;

/**
 * WEB响应码常量
 * <p>
 * Created by IntelliJ IDEA.
 * User: zhangchao
 * Date: 2018/1/15/0015
 * Time: 15:29
 */
public class RetCodeConst {

    public static final String RETCODE_SUCCESS = "0000";

    public static final String RETCODE_SUCCESS_MSG = "操作成功";

    public static final String RETCODE_ADD_SUCCESS = "0010";

    public static final String RETCODE_ADD_SUCCESS_MSG = "新增成功";

    public static final String RETCODE_SET_SUCCESS = "0011";

    public static final String RETCODE_SET_SUCCESS_MSG = "修改成功";

    public static final String RETCODE_DEL_SUCCESS = "0012";

    public static final String RETCODE_DEL_SUCCESS_MSG = "删除成功";

    public static final String RETCODE_INVAILD_SESSSION = "0001";

    public static final String RETCODE_INVAILD_SESSSION_MSG = "会话失效，请重新登录！";

    public static final String RETCODE_INVAILD_LOGIN = "0002";

    public static final String RETCODE_INVAILD_LOGIN_MSG = "用户名或密码错误，请重新输入！";

    public static final String RETCODE_INVAILD_PARAM_VAL = "0003";

    public static final String RETCODE_INVAILD_PARAM_VAL_MSG = "接口参数异常，请检查！";

    public static final String RETCODE_PERMISSION_DENIED = "0004";

    public static final String RETCODE_PERMISSION_DENIED_MSG = "权限不足，请联系管理员开通！";

    // System Error Info
    public static final String RETCODE_SERVER_ERROR = "1000";

    public static final String RETCODE_SERVER_ERROR_MSG = "服务器内部异常，请联系系统管理员！";

    // DB Error Info
    public static final String RETCODE_DB_ERROR = "2000";

    public static final String RETCODE_DB_ERROR_MSG = "数据库操作异常，请稍后再试或联系管理员！";

    public static final String RETCODE_DB_CONNT_ERROR = "2001";

    public static final String RETCODE_DB_CONNT_ERROR_MSG = "数据库连接异常，请稍后再试或联系管理员！";

    // IO Error Info
    public static final String RETCODE_IO_ERROR = "3000";

    public static final String RETCODE_IO_ERROR_MSG = "保存文件出错，请联系系统管理员！";

    /**
     * 自定义默认消息返回码
     */
    public static final String RETCODE_CUSTOM = "1101";

    /**
     * 自定义产品冻结消息返回码
     */
    public static final String RETCODE_CUSTOM_FREEZE = "1122";


    /**
     * 自定义产品冻结消息
     */
    public static final String RETCODE_CUSTOM_FREEZE_MSG = "成品冻结";

}
