/**
 * 
 */
package ui.br;

import java.util.Scanner;

import lojasuprimentos.exercicio01.br.Fatura;

/**
 * @author Mariz
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String numero;
		String descricao;
		int qtdcomprada;
		double preco;
		
		System.out.print("Digite numero: ");
		numero = in.next();
		System.out.print("Digite descrição: ");
		descricao = in.next();
		System.out.print("Digite quantidade comprada: ");
		qtdcomprada = in.nextInt();
		System.out.print("Digite preco: ");
		preco = in.nextDouble();
			
		Fatura fatura = new Fatura(numero, descricao, qtdcomprada, preco);
		fatura.getValorFatura();
		
		System.out.println(fatura);
			}

}
