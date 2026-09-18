package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex22_LS {
    public void main(String args[])
    {
        int a,b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        if (a>b)
        {
        JOptionPane.showMessageDialog(null, "valores na ordem crescente:\n"+b+" "+a);
        }
        else
        {
        JOptionPane.showMessageDialog(null, "valores na ordem crescente:\n"+a+" "+b);
        }
    
    }
}
