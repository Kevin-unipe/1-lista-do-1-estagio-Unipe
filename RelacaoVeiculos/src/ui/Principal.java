package ui;

import veiculos.exercicio07.Veiculo;
import veiculos.exercicio07.VeiculoCarga;
import veiculos.exercicio07.VeiculoPasseio;

public class Principal {

	public static void main(String[] args) {
		
		Veiculo veiculoCarga = new VeiculoCarga("mno-2345", "Hyundai", "modelo", "ano", 200.000, 0, 200, 1000);
		veiculoCarga.valorDaLocacao(200);
		Veiculo veiculoPasseio = new VeiculoPasseio("placa", "marca", "modelo", "ano", 200.000, 0, 200, true, 4);
		veiculoPasseio.valorDaLocacao(200);
		
		System.out.println(veiculoCarga);
		System.out.println(veiculoPasseio);
	}

}
