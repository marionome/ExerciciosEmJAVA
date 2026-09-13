package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex9_LS {
    public void main(String args[])
    {
    int a,b;
    a = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
    b = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
    CalcSoma(a,b);
    }
    
    public void CalcSoma(int a,int b)
    {
    int soma;
    soma = (a*a)+(b*b);
    JOptionPane.showMessageDialog(null, "A soma é: "+soma);
    }
    
}
