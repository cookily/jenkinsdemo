package cn.cookily.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("/")
	public String sayHello(){
    	//修改返回的字符串的内容
        return "cookily. Hello jenkins, " + new Date().toLocaleString();
    }
}
