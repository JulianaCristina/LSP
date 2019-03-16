
public class ContaDeEstudante extends ContaComum{

	@Override
	public void rende() {
		throw new ContaNaoRendeException();
	}
}
