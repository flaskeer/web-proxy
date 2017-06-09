package com.asterisk.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class WebProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebProxyApplication.class, args);
	}
}
