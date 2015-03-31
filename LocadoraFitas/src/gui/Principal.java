package gui;

import java.util.Scanner;

import locadoradefitas.Fita;
import locadoradefitas.FitaInfantil;
import locadoradefitas.FitaLancamento;

public class Principal {

	public static void main(String[] args) {
		
		Scanner in =  new Scanner(System.in);
		
		String titulo;
		float preco;
		int x;
		
		System.out.println("Digite o titulo: ");
		titulo = in.nextLine();
		System.out.println("Digite o Preço: ");
		preco = in.nextFloat();
		
		System.out.println("Digite o 1 para lançamento, e 2 para Infantil: ");
		x = in.nextInt();
		
		switch(x){
		
		case 1: Fita fitaLancamento = new FitaLancamento(titulo);
		fitaLancamento.precoLocacao(preco);
		System.out.println(fitaLancamento); break;
		
		case 2 :Fita fitaInfantil = new FitaInfantil(titulo);
		fitaInfantil.precoLocacao(preco);
		System.out.println(fitaInfantil);break;
		
		default: System.out.println("opção incorreta!!!");break;
		


		}
	}
	
}
