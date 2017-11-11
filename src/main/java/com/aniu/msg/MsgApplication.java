package com.aniu.msg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aniu.msg.dal.dao")
//@EnableAutoConfiguration(exclude = {HypermediaAutoConfiguration.class})
public class MsgApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgApplication.class, args);
	}
}
