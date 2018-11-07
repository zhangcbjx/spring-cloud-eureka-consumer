package com.learn;
/**
 * 
 */


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: SpringStart   
 * @Description: 
 * @author zhangcb  
 * @date 2018年11月7日 下午3:16:23 
 * @Copyright: 2018 www.yunqi.com Inc. All rights reserved.
 */
@SpringBootApplication
@EnableEurekaClient  // 创建服务提供者
public class SpringConsumerStart {
	private static Logger log = LoggerFactory.getLogger(SpringConsumerStart.class);
	/**
	 * @Title: main
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringConsumerStart.class, args);
		log.info("YunQi WApp booted.");
	}

}
