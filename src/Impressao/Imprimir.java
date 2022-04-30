/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impressao;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author msa04
 */
public class Imprimir {
    /*Esta classe será melhor aproveitada depois da criação das tela, refere à impressão da ficha médica
    já está funcionando previamente caso queira dar uma olha, na execução do programa é solicitada.*/
    public static void ImprimirArquivo (String caminhoDoArquivo){
        Desktop d = Desktop.getDesktop();
        
        try {
            File arquivoParaImpressao = new File (caminhoDoArquivo);
            d.print(arquivoParaImpressao);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao imprimir a receita", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
