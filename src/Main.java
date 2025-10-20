import java.time.LocalDate;

import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;
import instituicao.Agencia;
import instituicao.Banco;
import shared.Endereco;

public class Main {

	public static void main(String[] args) {
		// Informações do banco
		Endereco enderecoPadrao = new Endereco("Rua das Flores", "74", null, "Centro", "São Paulo", "SP", "79000-000", "Brasil");
		Banco bancoPadrao = new Banco("Banco FINANCE", 1, "00.000.000/0001-00", enderecoPadrao, 1000000.00);
		Agencia agenciaPadrao = new Agencia("1", "Sede", enderecoPadrao, bancoPadrao, "0800-000-000");

		// Informações do cliente
		Endereco enderecoCliente = new Endereco("Avenida Brasil", "100", "Apt 202", "Jardim América", "Rio de Janeiro", "RJ", "20000-000", "Brasil");
		Cliente fulano = new Cliente("Waldir Braz", "123.456.789-00", LocalDate.of(1980, 5, 20), enderecoCliente, "1199999-9999", 5000.00, agenciaPadrao);

		Conta contaCorrente = new ContaCorrente(bancoPadrao, agenciaPadrao, fulano);
		Conta contaPoupanca = new ContaPoupanca(bancoPadrao, agenciaPadrao, fulano);

		bancoPadrao.adicionarConta(contaCorrente);
		bancoPadrao.adicionarConta(contaPoupanca);
		
		contaCorrente.depositar(100);
		contaCorrente.transferir(100, contaPoupanca);

		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}

}
