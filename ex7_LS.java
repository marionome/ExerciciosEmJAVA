package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex7_LS {
    public void main(String args[])
    {
    int larg,altu,comp;
    larg = Integer.parseInt(JOptionPane.showInputDialog("Insira a largura"));
    altu = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura"));
    comp = Integer.parseInt(JOptionPane.showInputDialog("Insira o comprimento"));
    CalcVol(larg,altu,comp);
    }
    
    public void CalcVol(int l, int a, int c)
    {
    int vol;
    vol = l*a*c;
    JOptionPane.showMessageDialog(null,"O volume é: "+vol);
    
    }
}
