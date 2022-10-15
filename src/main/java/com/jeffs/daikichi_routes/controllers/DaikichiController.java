package com.jeffs.daikichi_routes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("")
	public String index() {
		return "Welcome";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to " + city;	}
	
	@RequestMapping("/lotto/{luckyNum}")
	public String lotto(@PathVariable("luckyNum") int luckyNum) {
		String lottoMessage;
		if (luckyNum % 2 == 0) {
			lottoMessage = "You will take a grand jounrey in the near future, but be weary of tempting offers.";
		} else {
			lottoMessage = "You have enjoyed the fruits of your labor but now is a great time to spend with family and friends.";
		}
		return lottoMessage;
	}

}
