/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufjf.controler;

import com.ufjf.acoes.model.investimentos.Investimentos;
import com.ufjf.acoes.view.Tela;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author yanfo
 */
public class TratarLista implements ListSelectionListener {
    Tela tela;

    public TratarLista(Tela tela) {
        this.tela = tela;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int firstIndex = tela.getLista().getSelectedIndex();
        
        if(firstIndex!=-1) {
            Investimentos elementAt = tela.getLista().getModel().getElementAt(firstIndex);
            tela.getTfNome().setText(elementAt.getNome());
            tela.getTfPreco().setText(elementAt.getPreco());
            tela.getTfQuantidade().setText(elementAt.getQuantidade());
            
            tela.setLastIndex(firstIndex);
        }
    }
}
