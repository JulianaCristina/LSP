import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {
	public static void main(String[] ags) {
		for(ContaComum conta : contasDoBanco()) {
			conta.rende();
			
			System.out.println("Novo Saldo:");
			System.out.println(conta.getSaldo());
		}
	}

	private static List<ContaComum> contasDoBanco() {
		
		return Arrays.asList(new ContaComum(), new ContaDeEstudante());
	}
}