package veiculos.exercicio07;

public class VeiculoPasseio extends Veiculo {
	
	private boolean arcondicionado;
	private int qtdportas;

	public VeiculoPasseio(String placa, String marca, String modelo, String ano, double valorKmRodado, int kmInicial, int kmFinal, boolean arcondicionado, int qtdportas) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal);
		this.arcondicionado = arcondicionado;
		this.qtdportas = qtdportas;
	}


	public boolean isArcondicionado() {
		return arcondicionado;
	}

	public void setArcondicionado(boolean arcondicionado) {
		this.arcondicionado = arcondicionado;
		if(arcondicionado == true){
			System.out.println("Possui.");
		}else
			System.out.println("Não possui ar-condicionado.");
	}

	public int getQtdportas() {
		return qtdportas;
	}

	public void setQtdportas(int qtdportas) {
		this.qtdportas = qtdportas;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VeiculoPasseio [arcondicionado=")
				.append(arcondicionado).append(", qtdportas=")
				.append(qtdportas).append(", placa=").append(placa)
				.append(", marca=").append(marca).append(", modelo=")
				.append(modelo).append(", ano=").append(ano)
				.append(", valorKmRodado=").append(valorKmRodado)
				.append(", kmInicial=").append(kmInicial).append(", kmFinal=")
				.append(kmFinal).append(", valor=").append(valor);
		return builder.toString();
	}

	
	
}
