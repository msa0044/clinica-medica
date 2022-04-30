/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Modelo.*;
import DAO.*;
import java.util.ArrayList;

/**
 *
 * @author msa04
 */
public class Dados {
    /*Classe improvisória de substituição da Base de Dados*/
    public static ArrayList<Paciente> ListaDePacientes = new ArrayList();
    public static ArrayList<ConsultasAgendadas> ListaDeConsultasAgendadas = new ArrayList();
    public static ArrayList<Medico> ListaDeMedicos = new ArrayList();
    public static ArrayList<Login> ListaDeLogins = new ArrayList();
    
    public static void pegarDados(){
        ListaDePacientes = DAOPaciente.getLista();
        ListaDeLogins = DAOLogin.getLista();
        ListaDeMedicos = DAOMedico.getLista();
        ListaDeConsultasAgendadas = DAOConsultasAgendadas.getLista();
        DAOConsultasAgendadas.ordenar();
    }
    public static ArrayList<Paciente> getListaDePacientes() {
        return ListaDePacientes;
    }

    public static void setListaDePacientes(ArrayList<Paciente> aListaDePacientes) {
        ListaDePacientes = aListaDePacientes;
    }

    public static ArrayList<ConsultasAgendadas> getListaDeConsultasAgendadas() {
        return ListaDeConsultasAgendadas;
    }

    public static void setListaDeConsultasAgendadas(ArrayList<ConsultasAgendadas> aListaDeConsultasAgendadas) {
        ListaDeConsultasAgendadas = aListaDeConsultasAgendadas;
    }

    public static ArrayList<Medico> getListaDeMedicos() {
        return ListaDeMedicos;
    }

    public static void setListaDeMedicos(ArrayList<Medico> aListaDeMedicos) {
        ListaDeMedicos = aListaDeMedicos;
    }

    
}
