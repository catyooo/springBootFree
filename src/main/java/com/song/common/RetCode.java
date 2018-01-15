package com.song.common;

import com.song.controller.constant.RetCodeConst;

/**
 * Web访问统一返回包装类
 * <p>
 * Created by IntelliJ IDEA.
 * User: zhangchao
 * Date: 2018/1/15/0015
 * Time: 15:30
 */
public class RetCode<T> {

    private String retCode;
    private String msg;
    private T t;

    @SuppressWarnings("unused")
    private RetCode() {
    }

    public RetCode(String retCode) {
        this(retCode, null, null);
    }

    public RetCode(String retCode, String retMsg) {
        this(retCode, retMsg, null);
    }

    public RetCode(String retCode, T t) {
        this(retCode, null, t);
    }

    public RetCode(String retCode, String msg, T t) {
        this.retCode = retCode;
        this.msg = msg;
        this.t = t;
    }

    public static <T> RetCode<T> success() {
        return new RetCode<T>(RetCodeConst.RETCODE_SUCCESS, RetCodeConst.RETCODE_SUCCESS_MSG);
    }

    /**
     * 新增成功<br>
     * 返回码{@link RetCodeConst#RETCODE_ADD_SUCCESS}<br>
     * 消息{@link RetCodeConst#RETCODE_ADD_SUCCESS_MSG}
     *
     * @return RetCode<T>
     */
    public static <T> RetCode<T> addSuccess() {
        return new RetCode<T>(RetCodeConst.RETCODE_ADD_SUCCESS, RetCodeConst.RETCODE_ADD_SUCCESS_MSG);
    }

    /**
     * 修改成功<br>
     * 返回码{@link RetCodeConst#RETCODE_SET_SUCCESS}<br>
     * 消息{@link RetCodeConst#RETCODE_SET_SUCCESS_MSG}
     *
     * @return RetCode<T>
     */
    public static <T> RetCode<T> setSuccess() {
        return new RetCode<T>(RetCodeConst.RETCODE_SET_SUCCESS, RetCodeConst.RETCODE_SET_SUCCESS_MSG);
    }

    /**
     * 删除成功<br>
     * 返回码{@link RetCodeConst#RETCODE_DEL_SUCCESS}<br>
     * 消息{@link RetCodeConst#RETCODE_DEL_SUCCESS_MSG}
     *
     * @return RetCode<T>
     */
    public static <T> RetCode<T> delSuccess() {
        return new RetCode<T>(RetCodeConst.RETCODE_DEL_SUCCESS, RetCodeConst.RETCODE_DEL_SUCCESS_MSG);
    }

    public static <T> RetCode<T> success(T t) {
        return new RetCode<T>(RetCodeConst.RETCODE_SUCCESS, RetCodeConst.RETCODE_SUCCESS_MSG, t);
    }

    public static <T> RetCode<T> success(String msg, T t) {
        return new RetCode<T>(RetCodeConst.RETCODE_SUCCESS, msg, t);
    }

    public static <T> RetCode<T> invaildParamVal() {
        return new RetCode<T>(RetCodeConst.RETCODE_INVAILD_PARAM_VAL, RetCodeConst.RETCODE_INVAILD_PARAM_VAL_MSG);
    }

    public static <T> RetCode<T> invaildSession() {
        return new RetCode<T>(RetCodeConst.RETCODE_INVAILD_SESSSION, RetCodeConst.RETCODE_INVAILD_SESSSION_MSG);
    }

    public static <T> RetCode<T> permissionDenied() {
        return new RetCode<T>(RetCodeConst.RETCODE_PERMISSION_DENIED, RetCodeConst.RETCODE_PERMISSION_DENIED_MSG);
    }

    public static <T> RetCode<T> invaildLogin() {
        return new RetCode<T>(RetCodeConst.RETCODE_INVAILD_LOGIN, RetCodeConst.RETCODE_INVAILD_LOGIN_MSG);
    }

    public static <T> RetCode<T> serverError() {
        return new RetCode<T>(RetCodeConst.RETCODE_SERVER_ERROR, RetCodeConst.RETCODE_SERVER_ERROR_MSG);
    }

    public static <T> RetCode<T> serverError(String msg) {
        return new RetCode<T>(RetCodeConst.RETCODE_SERVER_ERROR, msg);
    }

    public static <T> RetCode<T> dbError() {
        return new RetCode<T>(RetCodeConst.RETCODE_DB_ERROR, RetCodeConst.RETCODE_DB_ERROR_MSG);
    }

    public static <T> RetCode<T> dbConntError() {
        return new RetCode<T>(RetCodeConst.RETCODE_DB_CONNT_ERROR, RetCodeConst.RETCODE_DB_CONNT_ERROR_MSG);
    }

    public static <T> RetCode<T> ioError() {
        return new RetCode<T>(RetCodeConst.RETCODE_IO_ERROR, RetCodeConst.RETCODE_IO_ERROR_MSG);
    }

    /**
     * 自定义消息返回<br>
     * 返回码{@link RetCodeConst#RETCODE_CUSTOM}
     *
     * @param msg 自定义消息
     * @return RetCode<T>
     */
    public static <T> RetCode<T> customMSG(String msg) {
        return new RetCode<T>(RetCodeConst.RETCODE_CUSTOM, msg);
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return t;
    }

    public void setResult(T t) {
        this.t = t;
    }


}
