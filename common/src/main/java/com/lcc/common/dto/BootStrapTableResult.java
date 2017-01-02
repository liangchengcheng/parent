package com.lcc.common.dto;

import java.io.Serializable;
import java.util.List;

/**
 * ajax 请求的返回类型封装JSON结果
 * Created by lcc on 2017/1/2.
 */
public class BootStrapTableResult<T> implements Serializable {

    private static final long serialVersionUID = -4185151304730685014L;

    private List<T> data;

    public BootStrapTableResult(List<T> data){
        super();
        this.data = data;
    }

    public List<T> getData(){
        return data;
    }

    public void setData(List<T> data){
        this.data = data;
    }
}
