package com.xzh.userprovider.controller;

import com.xzh.common.message.ResponseMessage;
import com.xzh.userapi.service.UserService;
import com.xzh.userapi.vo.UserVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 向振华
 * @date 2019/05/08 14:13
 */
@Api(tags = "用户")
@RequestMapping("user")
@RestController
public class UserController implements UserService {

    @Resource
    private UserService userService;

    @Override
    public ResponseMessage<UserVO> findUser(Long userId) {
        return userService.findUser(userId);
    }
}
