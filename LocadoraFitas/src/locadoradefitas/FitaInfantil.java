package locadoradefitas;

public class FitaInfantil extends Fita{

	public FitaInfantil(String titulo, float preco) {
		super(titulo, preco);
	}
	
	public FitaInfantil(String titulo) {
		super(titulo);
	}

	public float precoLocacao(float preco) {
		return this.preco = (float) (preco - preco*0.4);
	}

	public String toString() {
		return "Titulo: " + titulo + ", Preço: " + preco;
	}
	
	
	
}
