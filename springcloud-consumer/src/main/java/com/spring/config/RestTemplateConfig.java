package com.spring.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
//	@Bean
//	public ClientHttpRequestFactory simpleClientHttpRequestFactory() {
//	    SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
//	    factory.setReadTimeout(5000);//ms
//	    factory.setConnectTimeout(15000);//ms
//	    return factory;
//	}
}
