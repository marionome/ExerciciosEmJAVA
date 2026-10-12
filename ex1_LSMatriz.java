package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex1_LSMatriz {
    public static void main(String args[])
    {
    int[][] matriz = new int[4][3];
    for(int i = 0; i<4;i++)
        {
        for(int j = 0; j<3;j++)
            {
            matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
            }
        }
    produtoMes(matriz);
    produtoSemana(matriz);
    totalMes(matriz);
    
    }
    
    public static void produtoMes(int[][] mat)
    {
    int[] total_pro = new int[3];
    for(int i = 0;i<3;i++)
        {
        for(int j = 0; j<4; j++)
            {
            total_pro[i] = total_pro[i] + mat[j][i];
            }
        }   
    JOptionPane.showMessageDialog(null, "A quantidade que cada produto vendeu no mes foi:\n1° produto:"+total_pro[0]+"\n2° produto:"+total_pro[1]+"\n3° produto:"+total_pro[2]);
    }
    public static void produtoSemana(int[][] mat)
    {
    int[]total_sem = new int[4];
    for(int i = 0; i<4;i++)
        {
        for(int j=0;j<3;j++)
            {
            total_sem[i] = total_sem[i]+mat[i][j];
            }
        }
    JOptionPane.showMessageDialog(null,"O total de produtos vendidos em cada semana é:\n1°semana: "+total_sem[0]+"\n2°semana: "+total_sem[1]+"\n3°semana: "+total_sem[2]+"\n4°semana: "+total_sem[3]);
    }
    public static void totalMes(int[][] mat)
    {
    int total = 0;
    for(int i = 0;i<4;i++)
        {
        for(int j = 0;j<3;j++)
            {
            total = total+mat[i][j];
            }
        }
    JOptionPane.showMessageDialog(null,"O total de produtos vendidos no mes é: "+total);
    }
}
