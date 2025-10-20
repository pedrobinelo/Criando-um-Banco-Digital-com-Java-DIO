package instituicao;

import java.util.List;
import java.util.ArrayList;

import conta.Conta;
import shared.Endereco;

public class Agencia {
    private String numeroAgencia;
    private String nomeAgencia;
    private Endereco enderecoAgencia;
    private Banco banco;
    private List<Conta> contas;
    private String telefone;
    
    public Agencia(String numeroAgencia, String nomeAgencia, Endereco enderecoAgencia, Banco banco, String telefone) {
        this.numeroAgencia = numeroAgencia;
        this.nomeAgencia = nomeAgencia;
        this.enderecoAgencia = enderecoAgencia;
        this.banco = banco;
        this.telefone = telefone;
        this.contas = new ArrayList<>();
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public Endereco getEnderecoAgencia() {
        return enderecoAgencia;
    }

    public void setEnderecoAgencia(Endereco enderecoAgencia) {
        this.enderecoAgencia = enderecoAgencia;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

}
