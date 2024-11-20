package com.devsuperior.desafio01;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	Order order = new Order();

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.print("Código: ");
		order.setCode(sc.nextInt());

		System.out.print("Valor do pedido: ");
		order.setBasic(sc.nextDouble());

		System.out.print("Valor do desconto: ");
		order.setDiscount(sc.nextDouble());

		System.out.printf("Pedido código = %d%n", order.getCode());

		double total = orderService.total(order);
		System.out.printf("Valor total: R$ %.2f%n", total);

		sc.close();
	}
}
