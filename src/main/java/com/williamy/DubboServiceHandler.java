package com.williamy;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.williamy.dubbo.IHelloDubboService;

@Service
public class DubboServiceHandler {
	@Reference(version="1.0.0")
	public
	IHelloDubboService helloservice;
}
