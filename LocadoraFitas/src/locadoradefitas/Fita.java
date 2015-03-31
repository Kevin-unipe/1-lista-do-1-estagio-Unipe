package locadoradefitas;

public class Fita {

	protected String titulo;
	protected float preco;
	
	public Fita(String titulo) {
		super();
		this.titulo = titulo;
	}

	public Fita(String titulo, float preco) {
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public float precoLocacao(float preco){
		return this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fita [titulo=").append(titulo).append(", preco=")
				.append(preco).append(", getTitulo()=").append(getTitulo())
				.append(", getPreco()=").append(getPreco())
				.append(", getClass()=").append(getClass())
				.append(", hashCode()=").append(hashCode())
				.append(", toString()=").append(super.toString()).append("]");
		return builder.toString();
	}
	
	
	
}
