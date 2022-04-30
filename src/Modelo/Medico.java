/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author msa04
 */
public class Medico {
    /*Esta é a classe que descreve o Médico*/
    private int idMedico;
    private String nome;
    private String telefone;
    private String CPF;
    private Login login;

    public Medico() {
    }
    
    public Medico(Login login, String nome, String CPF,String telefone) {
        this.login = login;
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.idMedico;
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
        final Medico other = (Medico) obj;
        if (this.idMedico != other.idMedico) {
            return false;
        }
        return true;
    }

    public String toStringAll() {
        return "Medico{" + "idMedico=" + idMedico + ", nome=" + nome + ", telefone=" + telefone + ", CPF=" + CPF + "}";
    }

    @Override
    public String toString() {
        return "Nome: "+ nome + "; Telefone: "+ telefone + "; CPF: "+ CPF + ";\nidentificação: (" + idMedico +")";
    }
    public String toStringList() {
        return "Nome: "+ nome + "; identificação: (" + idMedico +")";
    }
    
    
    

    
    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Login getLogin() {
        return login;
    }
}
