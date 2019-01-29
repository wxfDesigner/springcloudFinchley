package com.tdh.urlInterceptor.zipkin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
//@EnableEurekaClient
@EnableZipkinServer
//@EnableZipkinStreamServer
public class Application {
	static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
//	static {
//		// Make sure java.util.logging goes to log4j2
//		// https://docs.spring.io/spring-boot/docs/current/reference/html/howto-logging.html#howto-configure-log4j-for-logging
//		System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");
//	}

//	public static void main(String[] args) {
//		new SpringApplicationBuilder(Application.class).listeners(new RegisterZipkinHealthIndicators()).run(args);
//	}

//	@Bean
//	public Collector collector() {
//		return Collector.newBuilder(logger.getClass()).build();
//	}

}
