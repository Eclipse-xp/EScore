package com.xp.EScore.common.bean;

import java.io.Serializable;

public class ResponseResult<T> implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1320315731461475325L;

    /**
     * 返回码 成功0,不成功 大于0
     */
    private Integer code = ResponseCode.SUCCESS;
    /**
     * 返回信息
     */
    private String msg = "";
    /**
     * 返回业务数据集合
     */
    private T result;

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the result
     */
    public T getResult() {
        return this.result;
    }

    /**
     * @param result
     *        the result to set
     */
    public void setResult(T result) {
        this.result = result;
    }

}
