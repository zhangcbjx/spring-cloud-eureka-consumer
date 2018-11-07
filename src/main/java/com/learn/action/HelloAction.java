/**
 * 
 */
package com.learn.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    
    @GetMapping("/hello")
    public String sayHello() {
        return restTemplate.getForObject("http://hello-provider/hello/get", String.class);
    }
}
