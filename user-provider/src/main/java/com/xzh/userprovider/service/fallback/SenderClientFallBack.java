package com.xzh.userprovider.service.fallback;

import com.xzh.common.message.ResponseMessage;
import com.xzh.messageapi.request.Notify;
import com.xzh.userprovider.service.client.SenderClient;
import org.springframework.stereotype.Component;

/**
 * 服务降级
 *
 * @author 向振华
 * @date 2019/05/20 11:08
 */
@Component
public class SenderClientFallBack implements SenderClient {
    @Override
    public ResponseMessage send(Notify notify) {
        return new ResponseMessage("服务暂不可用");
    }
}
