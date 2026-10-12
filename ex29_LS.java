package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex29_LS {
    public void main(String args[])
    {
    int tipo;
    double valor;
    
    valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do investimento:"));
    tipo = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo do investimento\n1 para poupança\n2 para renda fixa"));
    
    switch(tipo)
        {
        case 1:
            valor = valor+(valor*0.03);
        break;
        
        case 2:
            valor = valor+(valor*0.05);
        break;
        
        default:
            
        }
    JOptionPane.showMessageDialog(null, "O valor depois de 30 dias é: "+valor);
    }
}
