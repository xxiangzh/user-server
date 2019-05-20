package com.xzh.userprovider.service.client;

import com.xzh.common.message.ResponseMessage;
import com.xzh.messageapi.request.Notify;
import com.xzh.messageapi.service.SendService;
import com.xzh.userprovider.service.fallback.SenderClientFallBack;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 消息服务
 *
 * @author 向振华
 * @date 2019/05/20 11:08
 */
@FeignClient(value = "message-server", path = "/send", fallback = SenderClientFallBack.class)
public interface SenderClient {

    @ApiOperation(value = "发送消息")
    @PostMapping("/send")
    ResponseMessage send(Notify notify);
}
