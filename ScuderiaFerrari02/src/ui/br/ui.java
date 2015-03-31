package ui.br;

import java.util.Scanner;

import scuderiaferrari.exercicio02.br.Carro;

public class ui {

	public static void main(String[] args) {
	
		String cor;
		String modelo;
		int acelerar;
		int aumento = 1;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Qual a cor do carro: ");
		cor = in.next();
		System.out.print("Qual o modelo do carro: ");
		modelo = in.next();
		Carro carro = new Carro(cor, modelo);
		
		carro.ligar();
		
		while (aumento != 0){
		
		System.out.print("digite quanto deseja acelera: ");	
		acelerar = in.nextInt();
		
		carro.acelerar(acelerar);
		System.out.println(carro);
		
		System.out.println("Digite 1 se quiser acelerar, e qualquer valor para sair: ");
		aumento = in.nextInt();
		}	
	}
	
}
