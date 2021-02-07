package com.food.consumer.menu.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc")
public class MenuController {

	@RequestMapping("/a")
	public String getName() {
		return "Hi Sharma";
	}
}
