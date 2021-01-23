package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//画面遷移用のコントローラーを付与する
@Controller 
@EnableAutoConfiguration

public class HelloController
{
//	@Controller/@RestControllerを付与したクラスがマッピングするURLの接頭辞を設定
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello, Spring Boot Sample Application!";
	}
}
