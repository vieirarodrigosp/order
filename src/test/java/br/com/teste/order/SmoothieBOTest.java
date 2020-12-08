package br.com.teste.order;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.teste.order.DTO.SmoothieDTO;
import br.com.teste.order.business.object.SmoothieBO;
import br.com.teste.order.config.MockedVariable;

@RunWith(SpringRunner.class)
public class SmoothieBOTest {
	@InjectMocks
	private SmoothieBO smoothieBO;
	@Test
	public void getOrderScenarioClassicAddChocolate() throws IOException {
		Optional<SmoothieDTO> smoothie = MockedVariable.getSmoothie("Classic,+chocolate");
		assertEquals(true
				, smoothie.get().getFruit().containsAll(
						smoothieBO.getOrder("Classic,+chocolate").getFruit()));
	}
	@Test
	public void getOrderScenarioClassicAddChocolateRemoveStrawberry() throws IOException {
		Optional<SmoothieDTO> smoothie = MockedVariable.getSmoothie("Classic,+chocolate,-strawberry");
		assertEquals(true
				, smoothie.get().getFruit().containsAll(
						smoothieBO.getOrder("Classic,+chocolate,-strawberry").getFruit()));
	}
	@Test
	public void getOrderScenarioClassic() throws IOException {
		Optional<SmoothieDTO> smoothie = MockedVariable.getSmoothie("Classic");
		assertEquals(true
				, smoothie.get().getFruit().containsAll(
						smoothieBO.getOrder("Classic").getFruit()));
	}
	@Test
	public void getOrderScenarioClassicRemoveStrawberry() throws IOException {
		Optional<SmoothieDTO> smoothie = MockedVariable.getSmoothie("Classic,-strawberry");
		assertEquals(true
				, smoothie.get().getFruit().containsAll(
						smoothieBO.getOrder("Classic,-strawberry").getFruit()));
	}
	@Test
	public void getOrderScenarioJustDesserts() throws IOException {
		Optional<SmoothieDTO> smoothie = MockedVariable.getSmoothie("Just Desserts");
		assertEquals(true
				, smoothie.get().getFruit().containsAll(
						smoothieBO.getOrder("Just Desserts").getFruit()));
	}
	@Test
	public void getOrderScenarioJustDessertsRemoveIceCreamRemovePeanut() throws IOException {
		Optional<SmoothieDTO> smoothie = MockedVariable.getSmoothie("Just Desserts,-ice cream,-peanut");
		assertEquals(true
				, smoothie.get().getFruit().containsAll(
						smoothieBO.getOrder("Just Desserts,-ice cream,-peanut").getFruit()));
	}
	@Test
	public void getOrderScenarioJustDessertsRemoveBananaRemoveCherryRemoveChocolateRemoveIceCreamRemovePeanut() throws IOException {
		Optional<SmoothieDTO> smoothie = MockedVariable.getSmoothie("Just Desserts,-banana,-cherry,-chocolate,-ice cream,-peanut");
		assertEquals(true
				, smoothie.get().getFruit().containsAll(
						smoothieBO.getOrder("Just Desserts,-banana,-cherry,-chocolate,-ice cream,-peanut").getFruit()));
	}
	@Test
	public void getOrderScenarioClassicRemoveBananaRemoveMangoRemovePeanut() throws IOException {
		Optional<SmoothieDTO> smoothie = MockedVariable.getSmoothie("Classic,-banana,-mango,-peanut");
		assertEquals(true
				, smoothie.get().getFruit().containsAll(
						smoothieBO.getOrder("Classic,-banana,-mango,-peanut").getFruit()));
	}
}