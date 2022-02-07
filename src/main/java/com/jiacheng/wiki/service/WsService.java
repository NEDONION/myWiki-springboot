package com.jiacheng.wiki.service;

import com.jiacheng.wiki.websocket.WebSocketServer;
import javax.annotation.Resource;
import org.slf4j.MDC;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class WsService {

    @Resource
    public WebSocketServer webSocketServer;

    @Async
    public void sendInfo(String message, String logId) {
        MDC.put("LOG_ID", logId);
        webSocketServer.sendInfo(message);
    }
}
