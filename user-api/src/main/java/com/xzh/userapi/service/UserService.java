package com.xzh.userapi.service;

import com.xzh.userapi.messge.ResponseMessage;
import com.xzh.userapi.vo.UserVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 向振华
 * @date 2019/05/08 14:00
 */
public interface UserService {

    @ApiOperation(value = "我啊")
    @GetMapping("/findUser")
    ResponseMessage<UserVO> findUser(Long userId);
}
