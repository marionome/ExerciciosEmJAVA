package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex12_LS {
    public void main(String args[])
    {
    int a_atual,a_nascimento;
    a_atual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual:"));
    a_nascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento:"));
    CalcIdade(a_atual,a_nascimento);
    }
    
    public void CalcIdade(int atual,int nasci)
    {
    int idade;
    idade = atual - nasci;
    JOptionPane.showMessageDialog(null, "Sua idade é "+idade+" anos\nE em 17 anos, sera "+(idade+17)+" anos");
    }
}
