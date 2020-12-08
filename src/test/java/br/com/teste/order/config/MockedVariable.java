package br.com.teste.order.config;

import java.io.IOException;
import java.util.Optional;

import br.com.teste.order.DTO.SmoothieDTO;
import br.com.teste.order.business.object.SmoothieBO;

public class MockedVariable {
	public static Optional<SmoothieDTO> getSmoothie(String scenario) throws IOException {
		SmoothieBO smoothieBO = new SmoothieBO();
		Optional<SmoothieDTO> smoothie = Optional.ofNullable(new SmoothieDTO());
		switch (scenario) {
		case "Classic,+chocolate":
			smoothie = smoothieBO.getSmoothieByName("Classic");
			smoothie.get().getFruit().add("chocolate");
			break;
		case "Classic,+chocolate,-strawberry":
			smoothie = smoothieBO.getSmoothieByName("Classic");
			smoothie.get().getFruit().add("chocolate");
			smoothie.get().getFruit().remove("strawberry");
			break;
		case "Classic":
			smoothie = smoothieBO.getSmoothieByName("Classic");
			break;
		case "Classic,-strawberry":
			smoothie = smoothieBO.getSmoothieByName("Classic");
			smoothie.get().getFruit().remove("strawberry");
			break;
		case "Just Desserts":
			smoothie = smoothieBO.getSmoothieByName("Just Desserts");
			smoothie.get().getFruit().remove("strawberry");
			break;
		case "Just Desserts,-ice cream,-peanut":
			smoothie = smoothieBO.getSmoothieByName("Just Desserts");
			smoothie.get().getFruit().remove("ice cream");
			smoothie.get().getFruit().remove("peanut");
			break;
		case "Just Desserts,-banana,-cherry,-chocolate,-ice cream,-peanut":
			smoothie = smoothieBO.getSmoothieByName("Just Desserts");
			smoothie.get().getFruit().remove("banana");
			smoothie.get().getFruit().remove("cherry");
			smoothie.get().getFruit().remove("chocolate");
			smoothie.get().getFruit().remove("ice cream");
			smoothie.get().getFruit().remove("peanut");
			break;
		case "Classic,-banana,-mango,-peanut":
			smoothie = smoothieBO.getSmoothieByName("Classic");
			smoothie.get().getFruit().remove("banana");
			smoothie.get().getFruit().remove("mango");
			smoothie.get().getFruit().remove("peanut");
			break;
		}
		return smoothie;
	}
}