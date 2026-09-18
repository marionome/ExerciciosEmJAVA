package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex19_LS {
    public void main(String args[])
    {
    double a,b;
    a = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
    b = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
    if (a>b)
        {
            JOptionPane.showMessageDialog(null,"O maior é o numero: "+a);
        }
    else
        {
            if(b>a)
            {
            JOptionPane.showMessageDialog(null,"O maior é o numero: "+b);
            }
            else
            {
            JOptionPane.showMessageDialog(null,"Os dois valores são iguais");
            }
        }
    }

}
