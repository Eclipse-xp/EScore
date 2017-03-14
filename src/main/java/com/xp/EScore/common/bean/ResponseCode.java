package com.xp.EScore.common.bean;

/**
 *
 * @author zangyunfei
 */
public class ResponseCode {

    public static final Integer SUCCESS = 0;

    public static final Integer NEED_LOGIN = 401;
    /**
     * 未知异常
     */
    public static final Integer UNHANDLE_EXCEPTION = 500;


    public static final Integer INVALID_DATA_EXCEPTION = 501;

    public static final Integer SERVICE_EXCEPTION = 502;


    public static final Integer HTTP_EXCEPTION = 505;


    public static final Integer DATABASE_OPERATION_FAIL = 506;

}
