//Voc� foi contratado pela Scuderia Ferrari para desenvolver o sistema de controle de sua nova linha de montagem. Escreva uma classe Carro que tem como atributos cor, modelo, 
//velocidadeAtual, velocidadeMaxima e tamb�m os m�todos ligar() e acelerar() que recebe como par�metro a velocidade a ser acrescentada a velocidade atual. 
//Esta classe tamb�m deve conter m�todos get e set para cada um dos atributos listados. O m�todo acelerar() deve avisar ao usu�rio da classe se a velocidade m�xima designada para o carro for excedida. 
//Para o desenvolvimento desta classe todos os princ�pios de orienta��o a objetos e organiza��o das classes em pacotes ensinados em sala de aula devem ser respeitados. 

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
