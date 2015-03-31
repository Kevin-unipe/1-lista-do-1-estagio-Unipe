package locadoradefitas;

public class FitaLancamento extends Fita {

	public FitaLancamento(String titulo, float preco) {
		super(titulo, preco);
	}

	public FitaLancamento(String titulo) {
		super(titulo);
	}

	public float precoLocacao(float preco) {
		return this.preco = (float) (preco + preco*0.2);
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + ", Preço: " + preco;
	}
	
	
	
}
