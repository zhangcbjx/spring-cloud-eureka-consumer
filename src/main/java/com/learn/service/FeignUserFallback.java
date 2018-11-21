/**
 * 
 */
package com.learn.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName: FeignUserFallback   
 * @Description: 服务容错降级
 * @author zhangcb  
 * @date 2018年11月21日 下午1:46:53 
 * @Copyright: 2018 www.yunqi.com Inc. All rights reserved.
 */
@Component
public class FeignUserFallback implements FeignUserService{
	@Override
	public String get() {
		System.out.println("FeignUserFallback");
		return null;
	}

}
