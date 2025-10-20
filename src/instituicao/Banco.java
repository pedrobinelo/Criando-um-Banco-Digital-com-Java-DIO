package instituicao;

import java.util.List;
import java.util.ArrayList;

import conta.Conta;
import shared.Endereco;

public class Banco {
	private String nome;
	private int codigoBanco;
	private String cnpj;
	private Endereco enderecoSede;
	private double capitalSocial;
	private List<Conta> contas;

	public Banco(String nome, int codigoBanco, String cnpj, Endereco enderecoSede, double capitalSocial) {
		this.nome = nome;
		this.codigoBanco = codigoBanco;
		this.cnpj = cnpj;
		this.enderecoSede = enderecoSede;
		this.capitalSocial = capitalSocial;
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEnderecoSede() {
		return enderecoSede;
	}

	public void setEnderecoSede(Endereco enderecoSede) {
		this.enderecoSede = enderecoSede;
	}

	public double getCapitalSocial() {
		return capitalSocial;
	}

	public void setCapitalSocial(double capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}

}
