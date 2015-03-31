//Você foi contratado pela Scuderia Ferrari para desenvolver o sistema de controle de sua nova linha de montagem. Escreva uma classe Carro que tem como atributos cor, modelo, 
//velocidadeAtual, velocidadeMaxima e também os métodos ligar() e acelerar() que recebe como parâmetro a velocidade a ser acrescentada a velocidade atual. 
//Esta classe também deve conter métodos get e set para cada um dos atributos listados. O método acelerar() deve avisar ao usuário da classe se a velocidade máxima designada para o carro for excedida. 
//Para o desenvolvimento desta classe todos os princípios de orientação a objetos e organização das classes em pacotes ensinados em sala de aula devem ser respeitados. 

package scuderiaferrari.exercicio02.br;

public class Carro {

	 private String cor;
	 private String modelo;
	 private int velocidadeAtual = 0;
	 private static final int velocidadeMaxima = 200;
	 
	public Carro(String cor, String modelo) {
		this.cor = cor;
		this.modelo = modelo;
	}



	public void ligar(){
		 System.out.println("Carro ligado");
	 }
	 
	 public void acelerar(int aceleracao) {
		 if(aceleracao  >= velocidadeMaxima || velocidadeAtual >= velocidadeMaxima){
			 System.out.println("velocidade maxima excedida");
			 velocidadeAtual = 200;
		 }else{
				this.velocidadeAtual += aceleracao;
		 }
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public static int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [cor= ").append(cor).append(", modelo= ")
				.append(modelo).append(", velocidadeAtual= ")
				.append(velocidadeAtual).append("]");
		return builder.toString();
	} 
	

	 
}
