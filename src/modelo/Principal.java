/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import javax.swing.JOptionPane;
import visao.Binomial;
import visao.Poisson;
import visao.TelaInicial;

/**
 *
 * @author Otavio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TelaInicial tela = new TelaInicial();
        tela.setSize(400, 350);
        tela.setResizable(false);
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }
    
}
