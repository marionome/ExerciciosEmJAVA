package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex26_LS {
    
    public void main(String args[])
    {
    int a,b;
    a = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
    b = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
    if(a>b)
        {
        funMulti(a,b);
        }
    else
        {
        funMulti(b,a);
        }
    
    }
    
    public void funMulti(int maior, int menor)
    {
       if(maior%menor == 0)
       {
       JOptionPane.showMessageDialog(null,"O numero maior é multiplo do segundo");
       }
       else 
       {
       JOptionPane.showMessageDialog(null,"O numero maior não é multiplo do segundo");
       }
    }
}