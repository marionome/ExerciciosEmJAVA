package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
import java.util.*;

public class ex3_LSMatriz {
    
    public void main(String args[])
    {
        int[][] m = new int [20][20];
        m = encherMatriz(m);
        mostrarMatriz(m);
    }
    
    public int[][] encherMatriz(int m[][])
    {
    Random rand = new Random();
    for(int i = 0; i<20;i++)
        {
        for(int j = 0; j<20;j++)
            {
            m[i][j] = rand.nextInt(100);
            }
        }
    return m;
    }
    
    public void mostrarMatriz(int[][] m)
    {
    for(int i = 0; i<20; i++)
        {
        for(int j = 0; j<20; j++)
            {
            if(m[i][j]%3==0 && m[i][j]%7==0)
                {
                System.out.println(m[i][j]);
                }
            
            }
        }
    }
}
