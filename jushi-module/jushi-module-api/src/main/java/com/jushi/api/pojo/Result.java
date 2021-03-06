package com.jushi.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Result<T> implements Serializable {
    private boolean flag;
    private StatusCode code;
    private String message;
    private  T data;
    public static Result success(String message){
        return new Result(true, StatusCode.OK,message);
    }
    public static Result success(String message,Object data){
        return new Result(true, StatusCode.OK,message,data);
    }
    public static Result error(String message){
        return new Result(false, StatusCode.ERROR,message);
    }

    public static Result error(String message,Object data){
        return new Result(false, StatusCode.ERROR,message,data);
    }




    public Result(boolean flag, StatusCode code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result() {
    }
}