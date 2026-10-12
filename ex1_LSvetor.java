package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex1_LSvetor {
    public static void main(String args[])
    {
    int[] vet = new int[5];
        for(int i = 0;i<vet.length;i++)
        {
        vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        }
        
    calcMedia(vet);
    calcSoma(vet);
    
    }
    
    public static void calcMedia(int[] vet)
    {
    double media=0;
    int cont=0;
    
    for(int i = 0;i<vet.length;i++)
        {
        if(vet[i]>=10 && vet[i]<=200)
            {
            media = media + vet[i];
            cont++;
            }
        }
    media = media/cont;
    JOptionPane.showMessageDialog(null, "A media dos valores entre 10 e 200 é: "+ media);
    }
    
    public static void calcSoma(int[] vet)
    {
    int soma=0;
    for(int i = 0;i<vet.length;i++)
        {
        if(vet[i]%2==1)
            {
            soma = soma+vet[i];
            }
        }
    JOptionPane.showMessageDialog(null,"A soma dos valores impares é: "+soma);
    }
}
