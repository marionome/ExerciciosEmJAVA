package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex24_LS {
    public void main(String args[])
    {
    int a;
    a = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
    
    if ((a%2 == 0)&&(a%3==0))
        {
            JOptionPane.showMessageDialog(null, "o numero é divisivel por 2 e 3");
        }
    else
        {
            JOptionPane.showMessageDialog(null, "O numero não é divisel por 2 e 3 ao mesmo tempo");
        }
    }
}
