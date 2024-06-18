package com.example.demo;

import com.example.demo.model.Garcom;
import com.example.demo.service.GarcomService;
import com.example.demo.service.PedidoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Scanner;



@SpringBootApplication
public class RestaurantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantesApplication.class, args);}
	@Bean
	public CommandLineRunner demo (GarcomService garcomService, PedidoService pedidoService) {
		return args -> {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite 1 para cadastrar garçom");
			System.out.println("Digite 2 para cadastrar pedido");
			System.out.println("Digite 3 para listar o garçom");
			System.out.println("Digite 4 para listar o pedido");

			int opcao = sc.nextInt();
			switch (opcao){
				case 1:
					Garcom g = new Garcom();
					System.out.println("Digite o nome do garçom: ");
					g.setNome(sc.next());
					garcomService.cadastrarGarcom(g);
					System.out.println(g);

					break;
			}


		sc.close();
		};

	}

}
