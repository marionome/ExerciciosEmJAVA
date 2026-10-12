package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
public class ex2_LSvetor {
    public static void main(String args[])
    {
    int[] vet = new int[5];
    int maior, menor;
    double media;
    for(int i = 0; i<vet.length;i++)
        {
        vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        }
    maior = CalcMaior(vet);
    menor = CalcMenor(vet);
    media = CalcMedia(vet);
    JOptionPane.showMessageDialog(null,"O maior numero no vetor é: "+maior+"\nE o menor é: "+menor);
    JOptionPane.showMessageDialog(null,"A media dos valores do vetor é: "+media);
    }
    
    public static int CalcMaior(int[] vetor)
    {
    int maior = 0;
    for(int i = 0; i<vetor.length; i++ )
        {
        if(vetor[i]>maior)
            {
            maior = vetor[i];
            }   
        }
    return maior;
    }
    
    public static int CalcMenor(int[] vetor)
    {
    int menor = 0;
    boolean first = true;
    for(int i = 0; i<vetor.length; i++ )
        {
        if(vetor[i]<menor || first == true)
            {
            menor = vetor[i];
            first = false;
            }   
        }
    return menor;
    }
    
    public static double CalcMedia(int[] vetor)
    {
    double media = 0;
    for(int i = 0; i<vetor.length;i++)
        {
        media = vetor[i]+media;
        }
    media = media/vetor.length;
    return media;
    }
}
