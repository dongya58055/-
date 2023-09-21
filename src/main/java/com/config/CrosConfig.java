package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//解决跨域问题
@CrossOrigin
public class CrosConfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
	

//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
//		 registry.addMapping("/**")
//         .allowedOrigins("*")
//         .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
//         //是否支持跨域用户凭证
//         .allowCredentials(false)
//         .maxAge(3600)
//         .allowedHeaders("*");
//	}
	
}
