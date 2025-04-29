package com.example.demo.controller;

import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.ItemRepository;
import com.example.demo.service.ItemService;
import com.example.entity.Item;

@RestController
@RequestMapping("/api")
//@Component
public class ItemController {
	
	public ItemController() {
		// TODO Auto-generated constructor stub
		System.out.println("hiiiiiiiiiiiiiiiiii");
	}
	
	@Autowired
	ItemService itemService;
	
	@Autowired
	ItemRepository repo;
	
	@GetMapping("/items") 
	public List<Item> getItems(){
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		List<Item> itms = repo.findAll();
		
		return itms;
		
	}

}
