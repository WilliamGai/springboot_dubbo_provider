package com.williamy;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.williamy.dubbo.IHelloDubboService;

@Controller
@SpringBootApplication
public class App {

	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello dubbo provider!";
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
		LogCore.RPC.info("app started{}", Arrays.toString(args));
	}

}
