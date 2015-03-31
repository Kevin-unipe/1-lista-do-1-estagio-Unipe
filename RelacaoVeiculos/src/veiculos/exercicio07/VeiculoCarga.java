package veiculos.exercicio07;

public class VeiculoCarga extends Veiculo {
	
	private double capacidadeCarga;

	public VeiculoCarga(String placa, String marca, String modelo, String ano, double valorKmRodado, int kmInicial, int kmFinal, double capacidadeCarga) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal);
		this.capacidadeCarga = capacidadeCarga;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VeiculoCarga [capacidadeCarga=")
				.append(capacidadeCarga).append(", placa=").append(placa)
				.append(", marca=").append(marca).append(", modelo=")
				.append(modelo).append(", ano=").append(ano)
				.append(", valorKmRodado=").append(valorKmRodado)
				.append(", kmInicial=").append(kmInicial).append(", kmFinal=")
				.append(kmFinal).append(", valor=").append(valor)
				.append(", getCapacidadeCarga()=").append(getCapacidadeCarga());
		return builder.toString();
	}

	
	
}
