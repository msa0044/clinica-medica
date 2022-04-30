/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impressao;

import Modelo.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author msa04
 */
public class CriarArquivoDeImpressao {
    boolean ok = false;
    public CriarArquivoDeImpressao(ConsultasAgendadas consulta, String textoParaImpressao, boolean imprimir) {

        String caminhoDoArquivo = consulta.getMedicoResponsavel().getNome()
                + "(" + consulta.getMedicoResponsavel().getIdMedico() + ")"
                + " - " + consulta.getPacienteAcompanhado().getNome() + "("
                + consulta.getPacienteAcompanhado().getIdPaciente() + ")" + ".txt";

        JFileChooser seletor = new JFileChooser();
        seletor.setDialogTitle("Escolher Diretório");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo .txt", "txt");
        seletor.setFileFilter(filter);
        seletor.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);


        String diretorio = null;
        int i = seletor.showOpenDialog(null);

        if (i == JFileChooser.APPROVE_OPTION) {
            diretorio = seletor.getSelectedFile().getAbsolutePath() + "\\" + caminhoDoArquivo;
            try (
                    FileWriter criarArquivo = new FileWriter(diretorio, false);
                    BufferedWriter buffer = new BufferedWriter(criarArquivo);
                    PrintWriter escreverArquivo = new PrintWriter(buffer);) {

                escreverArquivo.append(textoParaImpressao);
                escreverArquivo.close();
                if(imprimir){
                Imprimir.ImprimirArquivo(diretorio);
                }
                ok = true;
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar a receita", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } else {

        }
    }
    public boolean getOk(){
        return ok;
    }
}
