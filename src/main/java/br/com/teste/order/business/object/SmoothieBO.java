package br.com.teste.order.business.object;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.teste.order.DTO.SmoothieDTO;
import br.com.teste.order.converter.ReadFile;

public class SmoothieBO {
	public List<SmoothieDTO> getSmoothies(String file) throws IOException {
		List<SmoothieDTO> smoothies = new ObjectMapper().readValue(
				ReadFile.getJsonToObject(file), new TypeReference<List<SmoothieDTO>>(){});
		return smoothies;
	}
	public SmoothieDTO getOrder(String order) throws IOException {
		SmoothieDTO smoothie = new SmoothieDTO();
		smoothie.setName(this.getName(order));
		smoothie.setFruit(this.getSmoothieByName(smoothie.getName()).get().getFruit());
		order = this.getOrderListFruit(order);
		while (order.contains("-")||order.contains("+")) {
			String operation = order.substring(0, 1);
			switch (operation) {
			case "-":
				smoothie.getFruit().remove(this.getFruit(order));
				break;
			default:
				smoothie.getFruit().add(this.getFruit(order));
				break;
			}
			order = this.getOrderListFruit(order);
		}
		this.getPrintOrder(smoothie);
		return smoothie;
	}
	public Optional<SmoothieDTO> getSmoothieByName(String orderName) throws IOException {
		List<SmoothieDTO> smoothies = this.getSmoothies("src/main/resources/mock/smoothies.json");
		return smoothies.stream()
					.filter(smoothie ->
						smoothie.getName().equals(orderName))
					.map((SmoothieDTO smoothie) -> smoothie)
					.findFirst();
	}
	private void getPrintOrder(SmoothieDTO smoothie) {
		System.out.print("Seu pedido: "
				+ smoothie.getName() + ": ");
		smoothie.getFruit().stream()
			.forEach( (String fruit) -> System.out.print(fruit + ", "));
	}
	private String getName(String order) {
		if(order.contains(",")) {
			return order.substring(0, order.indexOf(","));
		} else {
			return order.substring(0, order.length());
		}
	}
	private String getOrderListFruit(String order) {
		if(order.contains(",")) {
			return order.toLowerCase().substring(order.indexOf(",")+1, order.length());
		} else {
			return "";
		}
	}
	private String getFruit(String order) {
		if(order.contains(",")) {
			return order.toLowerCase().substring(1, order.indexOf(","));
		} else {
			return order.toLowerCase().substring(1, order.length());
		}
	}
}