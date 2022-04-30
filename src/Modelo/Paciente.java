/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import DAO.DAOConsultasAgendadas;

/**
 *
 * @author msa04
 */
public class Paciente {
    /* Esta é classe que descreve o paciente*/
    private int idPaciente;
    private String nome;
    private String CPF;
    private int idade;
    private String cidade;
    private String bairro;
    private String rua;
    private int numeroDaCasa;
    private String telefone;
    

    public Paciente() {
    }
    
    public Paciente(String nome, String CPF, int idade, String cidade, String bairro, String rua, int numeroDaCasa, String telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numeroDaCasa = numeroDaCasa;
        this.telefone = telefone;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.idPaciente;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        if (this.idPaciente != other.idPaciente) {
            return false;
        }
        return true;
    }

    public String toStringAll() {
        return "Paciente{" + "idPaciente=" + idPaciente + ", nome=" + nome + ", CPF=" + CPF + ", idade=" + idade + ", cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua + ", numeroDaCasa=" + numeroDaCasa + ", telefone=" + telefone + '}';
    }
    
    @Override
    public String toString() {
        return "Nome: "+ nome + "; Telefone: "+ telefone + "; CPF: "+ CPF + ";\nEndereço: "+ cidade +", "+ bairro +", "+ rua +", " + numeroDaCasa + ";\nidentificação: (" + idPaciente +")";
    }
    public String toStringList() {
        return "Nome: "+ nome + "; Identificação: (" + idPaciente +")";
    }

    
    
    
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(int numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
}
