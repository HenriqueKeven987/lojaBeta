package application;

import java.util.Locale;
import java.util.Scanner;

import entities.products;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		/*System.out.println(product.nome);
		System.out.println(product.preco);
		System.out.println(product.quantidade);*/
		
		
		System.out.println("Entre com os dados do produto");
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		/*System.out.print("Quantidade: ");
		int quantidade = entrada.nextInt();*/
		System.out.print("Preço: ");
		double preco = entrada.nextDouble();		
		
		products product = new products();
		//teste git
		product.setNomePreco(nome, preco);
		
		
		System.out.println("Dados do produto: "+ product);
		
		System.out.print("entre com o numero de produtos a ser adicionado ao Estoque: ");
		product.addStock(entrada.nextInt());
		System.out.println("Dados do produto: "+ product);
		
		/*product.setNome("alura");
		nome = product.getNome();*/
		System.out.println("Nome atualizado: "+ nome);
		
		System.out.print("quantos produtos vao ser retirados do estoque: ");
		product.rmStock(entrada.nextInt());
		System.out.println("Dados do produto: "+ product);
		
		
		entrada.close();
		

	}

}
