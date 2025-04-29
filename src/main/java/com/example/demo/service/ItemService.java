package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ItemRepository;
import com.example.entity.Item;

@Service
public class ItemService {
	
	@Autowired
	ItemRepository itemRepo;

	public List<Item>getAllItems(){
		
		List<Item> Il= new ArrayList<Item>();
		Il=(List<Item>) itemRepo.findAll();
		return Il;
	}
}
