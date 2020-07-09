package estaticasVsInstancia;

public class Somador {
	
	String nome;
	int valorInstancia = 0;
	static int valorEstatica = 0;
	
	
	public void somar() {
		valorInstancia++;
		valorEstatica++;
	}
	
	public void imprimir() {
		System.out.println("O Somador" +nome+ ": instancia = " +valorInstancia+ " estatica = " +valorEstatica);
	}
}
