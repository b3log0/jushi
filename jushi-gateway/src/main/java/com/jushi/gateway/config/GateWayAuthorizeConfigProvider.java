package com.jushi.gateway.config;

import com.jushi.security.common.config.AuthorizeConfigProvider;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.stereotype.Component;

@Component
public class GateWayAuthorizeConfigProvider implements AuthorizeConfigProvider {


    @Override
    public void config(ServerHttpSecurity.AuthorizeExchangeSpec config) {
        config
                .pathMatchers("/api/uaa/**",
                        "/api/article/**",
                        "/api/admin/**")
                .permitAll();
    }
}