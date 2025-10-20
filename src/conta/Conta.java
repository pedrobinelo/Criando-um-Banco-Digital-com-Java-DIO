package conta;

import cliente.Cliente;
import instituicao.Agencia;
import instituicao.Banco;

public abstract class Conta implements IConta {
	private static int SEQUENCIAL = 1; // Para gerar números de conta
	protected Banco banco;
	protected Agencia agencia;
	protected String numeroConta;
	protected Cliente titular;
	protected double saldo;

	// Construtor
	public Conta(Banco banco, Agencia agencia, Cliente titular) {
		if (banco == null || agencia == null || titular == null) {
			throw new IllegalArgumentException("Banco, agência e titular não podem ser nulos.");
		}

		this.banco = banco;
		this.agencia = agencia;
		this.numeroConta = String.format("%s-%d", agencia.getNumeroAgencia(), SEQUENCIAL++);
		this.titular = titular;
		this.saldo = 0.0;
		agencia.adicionarConta(this);
		titular.adicionarConta(this);
	}

	@Override
	public void sacar(double valor) {
		if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.err.println("Saldo insuficiente ou valor inválido.");
        }
	}

	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.err.println("Valor de depósito inválido.");
		}
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.titular.getNome()));
		System.out.println(String.format("Agencia: %s", this.agencia.getNomeAgencia()));
		System.out.println(String.format("Numero: %s", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
