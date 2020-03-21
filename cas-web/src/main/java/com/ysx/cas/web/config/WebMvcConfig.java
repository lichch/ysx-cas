package com.ysx.cas.web.config;

import com.ysx.cas.web.handler.CorsInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Slf4j
@ComponentScan
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Resource
    private CorsInterceptor corsInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("加载跨域拦截器...");
        // 跨域拦截器需放在最上面
        // registry.addInterceptor(corsInterceptor).addPathPatterns("/**");
    }
}
