package com.xzh.userprovider.service.impl;

import com.xzh.common.message.ResponseMessage;
import com.xzh.messageapi.request.Notify;
import com.xzh.userapi.service.UserService;
import com.xzh.userapi.vo.UserVO;
import com.xzh.userprovider.mapper.UserMapper;
import com.xzh.userprovider.pojo.User;
import com.xzh.userprovider.service.client.SenderClient;
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

    @Resource
    private SenderClient senderClient;

    @Override
    public ResponseMessage<UserVO> findUser(Long userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        UserVO vo = new UserVO(user.getName(),user.getPassword());
        ResponseMessage send = senderClient.send(new Notify("xiangzhenhua@mmtvip.com", "bb", "nn"));
        return new ResponseMessage<>(send.getCode(),send.getMessage(),vo);
    }
}
