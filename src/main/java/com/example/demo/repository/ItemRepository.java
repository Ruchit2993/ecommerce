package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
