package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int item_Id;
	@Column
	private String item_name;
	@Column
	private int item_Count;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Item(String item_name, int item_Count) {
		super();
		this.item_name = item_name;
		this.item_Count = item_Count;
	}



	public int getItem_Id() {
		return item_Id;
	}
	public void setItem_Id(int item_Id) {
		this.item_Id = item_Id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getItem_Count() {
		return item_Count;
	}
	public void setItem_Count(int item_Count) {
		this.item_Count = item_Count;
	}
	@Override
	public String toString() {
		return "Item [item_Id=" + item_Id + ", item_name=" + item_name + ", item_Count=" + item_Count + "]";
	}
		
}
