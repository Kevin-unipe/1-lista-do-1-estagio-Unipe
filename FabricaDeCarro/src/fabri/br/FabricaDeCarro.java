package fabri.br;

public class FabricaDeCarro {
	
	private static FabricaDeCarro fabrica = new FabricaDeCarro();

	private FabricaDeCarro(){
		
	}
	
	public static FabricaDeCarro getFabrica() {
		return fabrica;
	}
	
}
