package ui.br;
import java.util.Scanner;

import data.br.Data;

public class Main {

public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
		 
		Data d = new Data();
		
		System.out.println("Digite o Dia: ");
		d.setDia(in.nextInt());
		System.out.println("Digite o Mês: ");
		d.setMes(in.nextInt());
		System.out.println("Digite o Ano: ");
		d.setAno(in.nextInt());

		System.out.println(d);
		

	}
}
