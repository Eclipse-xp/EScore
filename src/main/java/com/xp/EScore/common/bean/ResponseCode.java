package com.xp.EScore.common.bean;

/**
 * 平台响应码值表
 *
 * @author zangyunfei
 */
public class ResponseCode {
    /**
     * 成功
     */
    public static final Integer SUCCESS = 0;
    /**
     * 未知异常
     */
    public static final Integer NEED_LOGIN = 401;
    /**
     * 未知异常
     */
    public static final Integer UNHANDLE_EXCEPTION = 500;

    /**
     * 业务数据异常(含提交数据必填项缺失)
     */
    public static final Integer INVALID_DATA_EXCEPTION = 501;
    /**
     * 业务处理异常
     */
    public static final Integer SERVICE_EXCEPTION = 502;

    /**
     * http调用失败
     */
    public static final Integer HTTP_EXCEPTION = 505;

    /**
     * 数据库操作失败
     */
    public static final Integer DATABASE_OPERATION_FAIL = 506;

}
