
public class ContaComum {

	private ManipuladorDeSaldo manipulador;
	
	public ContaComum() {
		this.manipulador = new ManipuladorDeSaldo();
	}
	public void deposita(double valor) {
		if(valor <= 0)
			throw new ValorInvalidoException();
		
		this.manipulador.adiciona(valor);;
	}
	public void rende() {
		this.manipulador.juros(0.1);
	}
	public void saca(double valor) {
		manipulador.adiciona(valor);
	}
	
	public double getSaldo() {
		return manipulador.getSaldo();
	}
	
	
	
}
