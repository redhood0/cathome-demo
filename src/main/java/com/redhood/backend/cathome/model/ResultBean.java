package com.redhood.backend.cathome.model;

import com.redhood.backend.cathome.util.ResultCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @PackgeName: com.redhood.backend.cathome.model
 * @ClassName: ResultBean
 * @Author: redhood
 * Date: 2020/4/6 17:42
 * project name: cathome
 * @Version:
 * @Description:
 */
@Data
public class ResultBean  {
    private Integer code;

    private String msg;

    private Object data;

    public ResultBean() {
    }

    public ResultBean(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ResultBean success() {
        ResultBean result = new ResultBean();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    public static ResultBean success(Object data) {
        ResultBean result = new ResultBean();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    public static ResultBean failure(ResultCode resultCode) {
        ResultBean result = new ResultBean();
        result.setResultCode(resultCode);
        return result;
    }

    public static ResultBean failure(ResultCode resultCode, Object data) {
        ResultBean result = new ResultBean();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }

    public void setResultCode(ResultCode code) {
        this.code = code.code();
        this.msg = code.message();
    }
}
