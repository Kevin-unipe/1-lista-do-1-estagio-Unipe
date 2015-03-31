package veiculos.exercicio07;

public class Veiculo {

	 protected String placa; 
	 protected String marca; 
	 protected String modelo; 
	 protected String ano;
	 protected double valorKmRodado; 
	 protected int kmInicial; 
	 protected int kmFinal;
	 protected double valor;
	 
	public Veiculo(String placa, String marca, String modelo, String ano) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	public Veiculo(String placa, String marca, String modelo, String ano, double valorKmRodado, int kmInicial, int kmFinal) {
		this(placa, marca, modelo, ano);
		this.valorKmRodado = valorKmRodado;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
	}
	
	public double valorDaLocacao(double valor){
		return this.valor -= (kmInicial - kmFinal)*valor; 
	}
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public double getValorKmRodado() {
		return valorKmRodado;
	}
	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}
	public int getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}
	public int getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [placa=").append(placa).append(", marca=")
				.append(marca).append(", modelo=").append(modelo)
				.append(", ano=").append(ano).append(", valorKmRodado=")
				.append(valorKmRodado).append(", kmInicial=").append(kmInicial)
				.append(", kmFinal=").append(kmFinal).append(", valor=")
				.append(valor).append(", getPlaca()=").append(getPlaca());
		return builder.toString();
	}
	 
	 
	 
	
}
