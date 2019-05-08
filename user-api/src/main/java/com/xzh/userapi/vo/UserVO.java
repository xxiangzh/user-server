package com.xzh.userapi.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 向振华
 * @date 2019/05/08 14:01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;
}
