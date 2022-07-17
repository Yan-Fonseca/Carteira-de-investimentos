/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufjf.controler;

import com.ufjf.acoes.model.investimentos.Investimentos;
import com.ufjf.acoes.view.Tela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

/**
 *
 * @author yanfo
 */
public class AdicionarInvestimento implements ActionListener {
    Tela tela;

    public AdicionarInvestimento(Tela tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Investimentos> model = (DefaultListModel<Investimentos>) tela.getLista().getModel();
        
        model.addElement(
                new Investimentos(
                    tela.getTfNome().getText(),
                    tela.getTfQuantidade().getText(),
                    tela.getTfPreco().getText()
                )
        );
    }
}
