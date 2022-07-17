/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufjf.acoes.view;


import com.ufjf.acoes.model.investimentos.Investimentos;
import com.ufjf.controler.AdicionarInvestimento;
import com.ufjf.controler.TratarLista;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 *
 * @author yanfonseca
 */
public class Tela extends JFrame {
    private JPanel tela;
    private JList<Investimentos> lista;
    private JTextField tfNome;
    private JTextField tfQuantidade;
    private JTextField tfPreco;
    private int lastIndex;

    public Tela() {
        this.lastIndex = 0;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public JList<Investimentos> getLista() {
        return lista;
    }

    public void setLista(JList<Investimentos> lista) {
        this.lista = lista;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

    public JTextField getTfNome() {
        return tfNome;
    }

    public void setTfNome(JTextField tfNome) {
        this.tfNome = tfNome;
    }

    public JTextField getTfQuantidade() {
        return tfQuantidade;
    }

    public void setTfQuantidade(JTextField tfQuantidade) {
        this.tfQuantidade = tfQuantidade;
    }

    public JTextField getTfPreco() {
        return tfPreco;
    }

    public void setTfPreco(JTextField tfPreco) {
        this.tfPreco = tfPreco;
    }
    
    private void configuraJanela() {
        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.tela = new JPanel();
        this.tela.setLayout(new BorderLayout());
        
        //this.addWindowListener();
    }
    
    private void configuraFormulario() {
        int size = 15;
        JPanel jpFormulario = new JPanel();
        jpFormulario.setBorder(BorderFactory.createTitledBorder("Investir"));
        
        jpFormulario.add(new JLabel("Nome:"));
        tfNome = new JTextField(size);
        jpFormulario.add(tfNome);
        
        jpFormulario.add(new JLabel("Preço:"));
        tfPreco = new JTextField(size);
        jpFormulario.add(tfPreco);
        
        jpFormulario.add(new JLabel("Quantidade:"));
        tfQuantidade = new JTextField(size);
        jpFormulario.add(tfQuantidade);
        
        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.addActionListener(new AdicionarInvestimento(this));
        jpFormulario.add(btnAdicionar);
        
        tela.add(jpFormulario, BorderLayout.NORTH);
    }
    
    private void configuraInvestimentos() {
        JPanel jpInvestimentos = new JPanel();
        jpInvestimentos.setBorder(BorderFactory.createTitledBorder("Investimentos"));
        jpInvestimentos.setLayout(new BorderLayout());
        jpInvestimentos.setPreferredSize(new Dimension(400,300));
   
        
        // Adicionar mais coisas aqui:
        
        DefaultListModel<Investimentos> model = new DefaultListModel<>();
        lista = new JList<>(model);
        lista.setVisible(true);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lista.addListSelectionListener(new TratarLista(this));
        jpInvestimentos.add(new JScrollPane(lista));
        
        
        tela.add(jpInvestimentos, BorderLayout.WEST);
    }
    
    public void configuraCaixa() {
        JPanel caixa = new JPanel();
        caixa.setBorder(BorderFactory.createTitledBorder("Caixa"));
        caixa.add(new JLabel("Gastos Totais: "));
        caixa.setPreferredSize(new Dimension(400,300));
        
        tela.add(caixa, BorderLayout.EAST);
    }
    
    public void mostraTela() {
        this.add(tela);
        this.setVisible(true);
    }
    
    public void montaTela() {
        // Fazer a montagem da tela;
        configuraJanela();
        configuraFormulario();
        configuraInvestimentos();
        configuraCaixa();
        mostraTela();
    }
    
    public static void main(String[] args) {
        Tela tela = new Tela();
        tela.montaTela();
    }
}
