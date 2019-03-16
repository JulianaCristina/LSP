import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {
	public static void main(String[] ags) {
		for(Rentavel conta : contasDoBanco()) {
			conta.rende();			
			System.out.println("Novo Saldo:"+ conta.getSaldo());
			
		}
	}

	private static List<Rentavel>contasDoBanco() {
		
		return Arrays.asList(new ContaComum(), new ContaComum());
	}
}
