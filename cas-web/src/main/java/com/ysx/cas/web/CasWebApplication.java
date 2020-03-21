package com.ysx.cas.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
@ComponentScan(basePackages = {"com.ysx"})
@EnableTransactionManagement
public class CasWebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CasWebApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		log.info("加载应用配置...");
		return application.sources(CasWebApplication.class);
	}

//	@Bean
//	public CorsFilter corsFilter() {
//		log.info("跨域Filter配置...");
//		final CorsConfiguration config = new CorsConfiguration();
//		// 放行哪些原始域
//		// config.setAllowedOrigins(Collections.singletonList("*"));
//		config.addAllowedOrigin("*");
//		// 是否发送 Cookie
//		config.setAllowCredentials(true);
//		// config.setAllowedHeaders(Arrays.asList("Origin", "Content-Type", "Accept"));
//		// 放行哪些原始请求头部信息
//		// config.setAllowedHeaders(Collections.singletonList("*"));
//		config.addAllowedHeader("*");
//		// 放行哪些请求方式
//		config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH"));
//		// 添加映射路径
//		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		source.registerCorsConfiguration("/**", config);
//		return new CorsFilter(source);
//	}
}
