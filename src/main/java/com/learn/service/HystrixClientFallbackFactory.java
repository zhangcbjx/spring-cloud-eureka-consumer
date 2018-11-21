package com.learn.service;

import feign.hystrix.FallbackFactory;

/**
 * @ClassName: HystrixClientFallbackFactory   
 * @Description: fallbackFactory与fallback方法不能同时使用,fallbackFactory可以捕捉异常信息
 * @author zhangcb  
 * @date 2018年11月21日 下午2:25:49 
 * @Copyright: 2018 www.yunqi.com Inc. All rights reserved.
 */
public class HystrixClientFallbackFactory implements FallbackFactory<FeignUserService> {

	@Override
	public FeignUserService create(Throwable cause) {
		return new FeignUserService() {
			@Override
			public String get() {
				System.out.println(cause.getMessage());
				return null;
			}
		};
	}

}
