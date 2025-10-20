package conta;

import cliente.Cliente;
import instituicao.Agencia;
import instituicao.Banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Banco banco, Agencia agencia, Cliente cliente) {
		super(banco, agencia, cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
