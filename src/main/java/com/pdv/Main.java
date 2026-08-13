package com.pdv;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Classe principal do sistema PDV
 */
public class Main {

    

    
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   Sistema PDV - Ponto de Venda v1.0.0");
        System.out.println("   Java 11");
        System.out.println("==============================================");
        System.out.println();
        System.out.println("Aplicação iniciada com sucesso!");
        JFrame mainFrame = new JFrame("Sistema PDV");

       mainFrame.add(new JLabel("Bem-vindo ao Sistema PDV!"));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600);
         mainFrame.setVisible(true); 

    }
}
