package com.chinaunicom.management.config;

import com.chinaunicom.management.interceptor.HelloWorldInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    /**
     * addPathPatterns表示拦截路径
     * excludePathPatterns表示排除的路径
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HelloWorldInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/helloWorldString");
    }
}
