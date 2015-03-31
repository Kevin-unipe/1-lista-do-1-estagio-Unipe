package ui;

import java.lang.*;
import java.util.Scanner;

import folhapagamento.Pagamento;

public class Principal {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a frase: ");
		String frase = in.next();
		
		
		String s = frase.replaceAll("\\D", " ");
		String [] array = s.split(" ");
		
		int soma = 0;
		
		for(int i=0;i<array.length;i++){
			if(!array[i].equals("")){
				System.out.println(array[i]);
			soma = soma + Integer.parseInt(array[i]);
			}
		}
		
		System.out.println("O resulatado da soma foi de: " + soma);
		Pagamento pg = new Pagamento(soma);
}
}