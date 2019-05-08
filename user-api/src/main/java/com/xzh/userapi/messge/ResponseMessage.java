package com.xzh.userapi.messge;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 向振华
 * @date 2019/05/08 14:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessage<T> implements Serializable {
    private static final long serialVersionUID = 4382470028454093276L;

    /**
     * 状态
     */
    private int code;

    /**
     * 消息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    public ResponseMessage(T data) {
        this.code = 1;
        this.message = "SUCCESS";
        this.data = data;
    }
}
