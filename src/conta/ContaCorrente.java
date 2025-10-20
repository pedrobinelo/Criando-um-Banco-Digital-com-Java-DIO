package conta;

import cliente.Cliente;
import instituicao.Agencia;
import instituicao.Banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Banco banco, Agencia agencia, Cliente cliente) {
		super(banco, agencia, cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
