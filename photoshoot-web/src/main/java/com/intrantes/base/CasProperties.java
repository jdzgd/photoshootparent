package com.intrantes.base;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * cas相关类
 * 用于读取配置文件
 *
 * @author Lime
 * @date 2018/8/6
 **/
@Data
@Component
public class CasProperties {
    /**
     * CAS的配置参数
     * @author ChengLi
     */
    @Value("${cas.server.host.url}")
    private String casServerUrl;

    @Value("${cas.server.host.login_url}")
    private String casServerLoginUrl;

    @Value("${cas.server.host.logout_url}")
    private String casServerLogoutUrl;

    @Value("${app.server.host.url}")
    private String appServerUrl;

    @Value("${app.login.url}")
    private String appLoginUrl;

    @Value("${app.logout.url}")
    private String appLogoutUrl;
}
