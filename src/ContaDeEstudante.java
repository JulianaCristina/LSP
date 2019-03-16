
public class ContaDeEstudante{

	//ao inves de extends usa-se composição, onde apenas estancio a conta comum
	// ContaComum contaComum; 
//	@Override
//	public void rende() {
//		throw new ContaNaoRendeException();
//	}
	
	private ManipuladorDeSaldo manipulador;
	
	public ContaDeEstudante() {
		this.manipulador = new ManipuladorDeSaldo();
	}
	public void saca(double valor) {
		manipulador.adiciona(valor);
	}
}
