package cliente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import conta.Conta;
import instituicao.Agencia;
import shared.Endereco;

public class Cliente {
	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private String telefone;
	private double rendaMensal;
	private Agencia agenciaVinculada;
	private List<Conta> contas;

	public Cliente(String nome, String cpf, LocalDate dataNascimento, Endereco endereco, String telefone, double rendaMensal, Agencia agenciaVinculada) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
		this.rendaMensal = rendaMensal;
		this.agenciaVinculada = agenciaVinculada;
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}

	public Agencia getAgenciaVinculada() {
		return agenciaVinculada;
	}

	public void setAgenciaVinculada(Agencia agenciaVinculada) {
		this.agenciaVinculada = agenciaVinculada;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
}
