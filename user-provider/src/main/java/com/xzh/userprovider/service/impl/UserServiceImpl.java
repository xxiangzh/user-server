package com.xzh.userprovider.service.impl;

import com.xzh.userapi.messge.ResponseMessage;
import com.xzh.userapi.service.UserService;
import com.xzh.userapi.vo.UserVO;
import com.xzh.userprovider.mapper.UserMapper;
import com.xzh.userprovider.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 向振华
 * @date 2019/05/08 14:10
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public ResponseMessage<UserVO> findUser(Long userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        UserVO vo = new UserVO(user.getName(),user.getPassword());
        return new ResponseMessage<>(vo);
    }
}
