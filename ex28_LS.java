package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex28_LS {
    
    public void main(String args[])
    {
    double preco,media;
    preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do produto"));
    media = Double.parseDouble(JOptionPane.showInputDialog("Insira a media mensal do produto"));
    
    if ((preco <30)&&(media<500))
            {
            preco = preco+(preco*0.1);
            }
    else{
        if ((preco<80)&&(media<1000))
            {
            preco = preco+(preco*0.15);
            }
        else{
            if((preco>=80)&&(media>=1000))
            {
            preco = preco-(preco*0.05);
            }
            }
        }
    JOptionPane.showMessageDialog(null,"O novo preço do produto é:"+preco);
    }
}
