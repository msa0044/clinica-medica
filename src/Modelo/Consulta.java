/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author msa04
 */
public final class Consulta {

    //Esta classe sera usada para que o medico registre a consulta do paciente na data da mesma.
    private int idConsulta;
    private String medicacao;
    private String nomec;
    private int diac;
    private int mesc;
    private int anoc;
    private int horac;
    private int minutosc;

    private String nomep;
    private String CPFp;
    private int idadep;
    private String cidadep;
    private String bairrop;
    private String ruap;
    private int numeroDaCasap;
    private String telefonep;

    private String nomem;
    private String telefonem;
    private String CPFm;

    public Consulta(String medicacao, String nomeConsulta, int diaConsulta, int mesConsulta, int anoConsulta, int horaConsulta, int minutosConsulta, Medico medicoResponsavel, Paciente pacienteAcompanhado) {
        setMedicacao(medicacao);
        setNomec(nomeConsulta);
        setDiac(diaConsulta);
        setMesc(mesConsulta);
        setAnoc(anoConsulta);
        setHorac(horaConsulta);
        setMinutosc(minutosConsulta);
        setNomep(pacienteAcompanhado.getNome());
        setCPFp(pacienteAcompanhado.getCPF());
        setIdadep(pacienteAcompanhado.getIdade());
        setCidadep(pacienteAcompanhado.getCidade());
        setBairrop(pacienteAcompanhado.getBairro());
        setRuap(pacienteAcompanhado.getRua());
        setNumeroDaCasap(pacienteAcompanhado.getNumeroDaCasa());
        setTelefonep(pacienteAcompanhado.getTelefone());
        setNomem(medicoResponsavel.getNome());
        setTelefonem(medicoResponsavel.getTelefone());
        setCPFm(medicoResponsavel.getTelefone());
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.idConsulta;
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
        final Consulta other = (Consulta) obj;
        if (this.idConsulta != other.idConsulta) {
            return false;
        }
        return true;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public String getNomec() {
        return nomec;
    }

    public void setNomec(String nomec) {
        this.nomec = nomec;
    }

    public int getDiac() {
        return diac;
    }

    public void setDiac(int diac) {
        this.diac = diac;
    }

    public int getMesc() {
        return mesc;
    }

    public void setMesc(int mesc) {
        this.mesc = mesc;
    }

    public int getAnoc() {
        return anoc;
    }

    public void setAnoc(int anoc) {
        this.anoc = anoc;
    }

    public int getHorac() {
        return horac;
    }

    public void setHorac(int horac) {
        this.horac = horac;
    }

    public int getMinutosc() {
        return minutosc;
    }

    public void setMinutosc(int minutosc) {
        this.minutosc = minutosc;
    }

    public String getNomep() {
        return nomep;
    }

    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    public String getCPFp() {
        return CPFp;
    }

    public void setCPFp(String CPFp) {
        this.CPFp = CPFp;
    }

    public int getIdadep() {
        return idadep;
    }

    public void setIdadep(int idadep) {
        this.idadep = idadep;
    }

    public String getCidadep() {
        return cidadep;
    }

    public void setCidadep(String cidadep) {
        this.cidadep = cidadep;
    }

    public String getBairrop() {
        return bairrop;
    }

    public void setBairrop(String bairrop) {
        this.bairrop = bairrop;
    }

    public String getRuap() {
        return ruap;
    }

    public void setRuap(String ruap) {
        this.ruap = ruap;
    }

    public int getNumeroDaCasap() {
        return numeroDaCasap;
    }

    public void setNumeroDaCasap(int numeroDaCasap) {
        this.numeroDaCasap = numeroDaCasap;
    }

    public String getTelefonep() {
        return telefonep;
    }

    public void setTelefonep(String telefonep) {
        this.telefonep = telefonep;
    }

    public String getNomem() {
        return nomem;
    }

    public void setNomem(String nomem) {
        this.nomem = nomem;
    }

    public String getTelefonem() {
        return telefonem;
    }

    public void setTelefonem(String telefonem) {
        this.telefonem = telefonem;
    }

    public String getCPFm() {
        return CPFm;
    }

    public void setCPFm(String CPFm) {
        this.CPFm = CPFm;
    }

}
