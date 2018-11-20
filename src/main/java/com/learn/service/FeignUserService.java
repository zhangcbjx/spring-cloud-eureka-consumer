package com.learn.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: FeignUserService   
 * @Description: 
 * @author zhangcb  
 * @date 2018年11月20日 下午5:02:09 
 * @Copyright: 2018 www.yunqi.com Inc. All rights reserved.
 */
@FeignClient(value="hello-provider")
public interface FeignUserService {
	@RequestMapping (value = "hello/get", method = RequestMethod.GET)
	@ResponseBody
    public String get()	;
}
