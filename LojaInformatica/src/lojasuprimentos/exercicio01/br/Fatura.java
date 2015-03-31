//Crie uma classe chamada Fatura para que uma loja de suprimentos de informática possa utilizá-la para representar uma fatura de um item vendido na loja. 
//Uma Fatura deve incluir quatro partes das informações como variáveis de instância – o número(tipo String), a descrição(tipo String), 
//quantidade comprada de um item(tipo int) e o preço por item(tipo double). Sua classe deve fornecer um método set e um get para cada variável de instância. 
//Além disso, forneça um método chamado getValorFatura que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como um double. 
//Se o valor não for positivo, ele deve ser configurado como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0. 

package lojasuprimentos.exercicio01.br;

public class Fatura {

	private String numero;
	private String descricao;
	private int qtdcomprada;
	private double preco;
	
	public Fatura() {
		// TODO Auto-generated constructor stub
	}
	
	public Fatura(String descricao) {
		this.descricao = descricao;
	}
	
	public Fatura(String numero, String descricao) {
		this.numero = numero;
		this.descricao = descricao;
	}
	
	public Fatura(String numero, String descricao, double preco) {
		this(numero, descricao);
		this.preco = preco;
	}


	public Fatura(String numero, String descricao, int qtdcomprada, double preco) {
		this(numero, descricao, preco);
		this.qtdcomprada = qtdcomprada;
	}

	public double getValorFatura(){
		
		if(qtdcomprada*preco <= 0){
			return 0;
		}else
		return qtdcomprada*preco;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtdcomprada() {
		return qtdcomprada;
	}
	public void setQtdcomprada(int qtdcomprada) {
		this.qtdcomprada = qtdcomprada;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco <= 0.0){
			this.preco = 0.0;
		}else
		this.preco = preco;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fatura [numero= ").append(numero).append(", descricao= ")
				.append(descricao).append(", qtdcomprada= ").append(qtdcomprada)
				.append(", preco= ").append(preco).append(", Valor da fatura: ").append(getValorFatura()).append("]");
		return builder.toString();
	}
	
}
