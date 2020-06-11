package com.dubbo.springbootdubboprovider.server.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.dubbo.springbootdubboprovider.server.TargetServer;
import org.springframework.stereotype.Component;

@Service(group = "g2")
@EnableDubbo
@Component
public class TargetServerImpl2 implements TargetServer {

    @Override
    public String getMessage(String message) {
        return "Come from provider 2: "+message;
    }
}
