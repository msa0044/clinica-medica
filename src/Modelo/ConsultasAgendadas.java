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
public class ConsultasAgendadas {
    //a CLASSE sintetizara um calendario de consultas proximas em uma das telas da aplicação.
    protected int idConsultaAgendada;
    protected String nomeConsulta;
    protected int diaConsulta;
    protected int mesConsulta;
    protected int anoConsulta;
    protected int horaConsulta;
    protected int minutosConsulta;
    protected long milissegundos;
    protected Medico medicoResponsavel;
    protected Paciente pacienteAcompanhado;

    public ConsultasAgendadas() {
    }

    public ConsultasAgendadas(String nomeConsulta, int diaConsulta, int mesConsulta, int anoConsulta, int horaConsulta, int minutosConsulta, Medico medicoResponsavel, Paciente pacienteAcompanhado) {
        this.nomeConsulta = nomeConsulta;
        this.diaConsulta = diaConsulta;
        this.mesConsulta = mesConsulta;
        this.anoConsulta = anoConsulta;
        this.horaConsulta = horaConsulta;
        this.minutosConsulta = minutosConsulta;
        this.medicoResponsavel = medicoResponsavel;
        this.pacienteAcompanhado = pacienteAcompanhado;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.idConsultaAgendada;
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
        final ConsultasAgendadas other = (ConsultasAgendadas) obj;
        if (this.idConsultaAgendada != other.idConsultaAgendada) {
            return false;
        }
        return true;
    }

    public String toStringAll() {
        return "ConsultasAgendadas{" + "idConsultaAgendada=" + idConsultaAgendada + ", nomeConsulta=" + nomeConsulta + ", diaConsulta=" + diaConsulta + ", mesConsulta=" + mesConsulta + ", anoConsulta=" + anoConsulta + ", horaConsulta=" + horaConsulta + ", minutosConsulta=" + minutosConsulta + ", medicoResponsavel=" + medicoResponsavel + ", pacienteAcompanhado=" + pacienteAcompanhado + '}';
    }
    
    @Override
    public String toString() {
        return "Nome: "+ nomeConsulta + "; Data: " + diaConsulta +"/"+ mesConsulta+"/"+ anoConsulta + "; Horário: "+ horaConsulta + ":"+ minutosConsulta+ ";\nIdentificação: (" + idConsultaAgendada + ")";
    }
    public String toStringList() {
        return "Nome: "+ nomeConsulta + "; Identificação: (" + idConsultaAgendada + ")";
    }
    
    
    public Medico getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(Medico medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public Paciente getPacienteAcompanhado() {
        return pacienteAcompanhado;
    }

    public void setPacienteAcompanhado(Paciente pacienteAcompanhado) {
        this.pacienteAcompanhado = pacienteAcompanhado;
    }

    public int getDiaConsulta() {
        return diaConsulta;
    }

    public void setDiaConsulta(int diaConsulta) {
        this.diaConsulta = diaConsulta;
    }

    public int getMesConsulta() {
        return mesConsulta;
    }

    public void setMesConsulta(int mesConsulta) {
        this.mesConsulta = mesConsulta;
    }

    public int getAnoConsulta() {
        return anoConsulta;
    }

    public void setAnoConsulta(int anoConsulta) {
        this.anoConsulta = anoConsulta;
    }

    public int getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(int horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public int getMinutosConsulta() {
        return minutosConsulta;
    }

    public void setMinutosConsulta(int minutosConsulta) {
        this.minutosConsulta = minutosConsulta;
    }

    public int getIdConsultaAgendada() {
        return idConsultaAgendada;
    }

    public void setIdConsultaAgendada(int idConsultaAgendada) {
        this.idConsultaAgendada = idConsultaAgendada;
    }

    public String getNomeConsulta() {
        return nomeConsulta;
    }

    public void setNomeConsulta(String nomeConsulta) {
        this.nomeConsulta = nomeConsulta;
    }

    public long getMilissegundos() {
        return milissegundos;
    }

    public void setMilissegundos(long milissegundos) {
        this.milissegundos = milissegundos;
    }
}
