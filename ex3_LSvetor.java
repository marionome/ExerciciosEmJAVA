package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex3_LSvetor {
    public static void main(String args[])
    {
    int[] vet1 = new int[3];
    int[] vet2 = new int[3];
    int[] vet3 = new int[6];
    
    inserirVetor(vet1);
    inserirVetor(vet2);
    
    for(int i=0;i<vet3.length;i++)
        {
        if(i<=2)
            {
            vet3[i] = vet1[i];
            }
        else
            {
            vet3[i] = vet2[i-3];
            }
        }
    
    for(int i=0;i<vet3.length;i++)
        {
        JOptionPane.showMessageDialog(null, vet3[i]);
        }
    }
    
    public static int[] inserirVetor(int[] vet)
    {
    for(int i = 0; i < 3;i++)
        {
        vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        }
    return vet;    
    }
}
