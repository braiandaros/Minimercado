package minimercado;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Minimercado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Float> precos = new ArrayList<>();
        System.out.println("|-------------------------------------------------------|");
		System.out.println("|Bem vindo ao mercado aqui voce pode escolher seus itens|");
		System.out.println("|  e adicionalos ao carrinho para finalizar sua compra. |");
		System.out.println("|-------------------------------------------------------|");
		while(true) {
		System.out.println("|Digite um produto ou digite 'sair':                    |");
		System.out.println("|-------------------------------------------------------|");
		String produto = entrada.nextLine();
		
			if( produto.equalsIgnoreCase("sair")){
				break;
			}
		
			boolean precovalido = false;
			while(!precovalido) {
				System.out.println("Digite o preco do produto:  ");
				try {
					Float produtopreco = entrada.nextFloat();
					entrada.nextLine();
					
				    produtos.add(produto);
                    precos.add(produtopreco);
                    
                    System.out.println("O produto adicionado foi " + produto + "e o seu preço é " + produtopreco);
					precovalido = true;
		        } 
				catch(InputMismatchException e) {
		            System.out.println("Valor invalido.");
		            entrada.next();
		        }
			} 
		}
				
		entrada.close();
		
		System.out.println("Produtos e preços cadastrados: ");
		for (int i = 0; i < produtos.size(); i++) {
	           System.out.println("| Produto: " + produtos.get(i) + " com o Preço: " + precos.get(i));
	    }
	}
}