/**
 * 
 */
package com.learn.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: Configuration
 * @Description:
 * @author zhangcb
 * @date 2018年11月7日 下午5:20:02
 * @Copyright: 2018 www.yunqi.com Inc. All rights reserved.
 */
@Configuration
public class CloudConfiguration {
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
