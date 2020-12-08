package br.com.teste.order;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.teste.order.business.object.SmoothieBO;

@SpringBootApplication
public class OrderApplication {

//	"Just Desserts,-banana,-cherry,-chocolate,-ice cream,-peanut"
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(OrderApplication.class, args);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu pedido: ");
		SmoothieBO smoothiesBO = new SmoothieBO();
		smoothiesBO.getOrder(teclado.nextLine());
	}
//	test 20
//	public static void main(String[] args) throws IOException {
//		SpringApplication.run(TestgeekhunterApplication.class, args);
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Digite seu pedido: ");
//		teclado.next();
//		SmoothieBO smoothiesBO = new SmoothieBO();
//		smoothiesBO.getSmoothies("src/main/resources/mock/smoothies.json");
//		smoothiesBO.getSmoothies("src/main/resources/mock/smoothies2.json");
//		smoothiesBO.getSmoothies("src/main/resources/mock/smoothies3.json");
//		smoothiesBO.getOrder(teclado.nextLine());
//		smoothiesBO.getSmoothies("src/main/resources/mock/consumerservicefee.json");
//		src/test/resources/mock/
//	}
//		teste 1
//		System.out.println(new TryFinally().tryAgain());
		
//		teste 2
//		try {
//			String[][] names = {{ "André", "Mike"}, null, {"Pedro"}};
//			System.out.println(names[2][1].substring(0, 2));
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(1);
//		}
		
//		teste 3
//		ColorPencil var1 = new ColorPencil();
//		ColorPencil var2 = new ColorPencil(RED);
//		ColorPencil var3 = new ColorPencil("RED");
//		Pencil var4 = new ColorPencil("BLUE");
		
//		teste 4
//		int a = 0;
//		while(a == a++) {
//			a++;
//			System.out.println(a);
//		}
		
//		teste 5
//		Printer myPrinter = new LaserPrinter();
//		System.out.println((LaserPrinter) myPrinter.pagesPerMin);
//		System.out.println(myPrinter.pagesPerMin);
//		System.out.println(LaserPrinter.myPrinter.pagesPerMin);
//		System.out.println(((LaserPrinter) myPrinter).pagesPerMin);

//		teste 6
//		int salesPhone = 1;
////		int salesX = 1;
//		System.out.println(salesPhone);
////		System.out.println(salesPhone++);
////		System.out.println(salesPhone++ + ++salesPhone);
//		System.out.println(salesPhone++ + ++salesPhone + ++salesPhone);
//		System.out.println(salesPhone);
////		System.out.println(salesPhone++ + ++salesPhone);
////		System.out.println(salesPhone++ + ++salesPhone + ++salesPhone);
////		System.out.println(salesPhone);
		
//		teste 7
//		for(int ctr = 2; ctr <= 30; ++ctr) {
//			if(ctr % 7 != 0)
//				continue;
////				exit;
////				break;
////				end;
//			if(ctr % 14 == 0)
//				System.out.println(ctr);
//		}
		
//		teste 8
//		ColorPack pack1 = new ColorPack();
//		System.out.println(pack1.getShadeCount());
		
////		teste 9
//		Book b1 = new Book("1234-4657");
//		Book b2 = new Book("1234-4657");
//		System.out.println(b1.equals(b2) + ":");
//		System.out.println(b1 == b2);
		
////		teste 10
//		boolean hungry = false;
//		while(hungry=true) {
//			Fish.count++;
//		}
//		System.out.println(Fish.count);
		
////		teste 11
//		double area = 10.89;
//		String color;
//		if(area < 5)
//			color = "RED";
//		else
//			color = "BLUE";
//		System.out.println(color);
		
//		teste 12
//		StringBuilder abl = new StringBuilder("eLion");
//		String ejg = null;
//		ejg = abl.append("X").substring(abl.indexOf("L"), abl.indexOf("X"));
//		System.out.println(ejg);
		
////		teste 13
//		String ejgStr[] = new String[][] {{null}, new String[] {"a", "b", "c"}, {new String()}}[0];
//		String ejgStr1[] = null;
//		String ejgStr2[] = {null};
//		
//		System.out.println(ejgStr);
//		System.out.println(ejgStr1);
//		System.out.println(ejgStr2);
		
//		teste 14
//		TestError test = new TestError();
//		int teste1 = test.erro();
//		System.out.println(teste1);
		
//		Teste 15
//		B b = new B();
//		C c = new C();
////		b = c;
//		A a = new A();
//		a.printName();
//		
//	}
	
}