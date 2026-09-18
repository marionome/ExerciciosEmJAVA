package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex23_LS {

public static void main(String args[])
    {
        int a,b,c,d;
        a=Integer.parseInt(JOptionPane.showInputDialog("Insira um valor(em ordem crescente):"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Insira um valor(em ordem crescente):"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Insira um valor(em ordem crescente):"));
        d=Integer.parseInt(JOptionPane.showInputDialog("Insira um valor(não precisa ser em ordem crescente:"));
        
        if (d<a)
        {
            JOptionPane.showMessageDialog(null,"a ordem ficou:"+d+" "+a+" "+b+" "+c);
        }
        else
        {
            if(d<b)
            {
                JOptionPane.showMessageDialog(null,"a ordem ficou:"+a+" "+d+" "+b+" "+c);
            }
            else
            {
                if(d<c)
                {
                    JOptionPane.showMessageDialog(null,"a ordem ficou:"+a+" "+b+" "+d+" "+c);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"a ordem ficou:"+a+" "+b+" "+c+" "+d);
                }
            }
        }
    }    
}
