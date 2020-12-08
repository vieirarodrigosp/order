package br.com.teste.order.DTO;

import java.util.List;

public class SmoothieDTO {
	String name;
	List<String> fruit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getFruit() {
		return fruit;
	}
	public void setFruit(List<String> fruit) {
		this.fruit = fruit;
	}
}