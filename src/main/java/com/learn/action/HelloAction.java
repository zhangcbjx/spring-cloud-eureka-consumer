package com.learn.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.learn.service.FeignUserService;

/**
 * @ClassName: HelloAction   
 * @Description: 
 * @author zhangcb  
 * @date 2018年11月7日 下午5:21:49 
 * @Copyright: 2018 www.yunqi.com Inc. All rights reserved.
 */
@RestController
public class HelloAction {
	@Autowired
    private RestTemplate restTemplate;
	@Autowired
	private FeignUserService feignUserService;
    
    @GetMapping("/hello")
    public String sayHello() {
    	System.out.println("通过@FeignClient方式调用：" + feignUserService.get());
    	/*
    	System.out.println("通过RestTemplate方式调用：" + 
    			restTemplate.getForObject("http://hello-provider/hello/get", String.class));
    	*/
        return "调用成功";
    }
}
