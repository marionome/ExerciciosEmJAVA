package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex2_LSMatriz {
    public void main(String args[])
    {
        int a,b,c;
        int[][] m = new int[8][8];
        for(c = 1;c<=4;c++)
        {
            for(a=c-1;a<=8-c;a++)
            {
                for(b=c-1;b<=8-c;b++)
                {
                    m[a][b] = c;
                }
            }
        }
        
        for(a = 0;a <= 7;a++)
        {
            for(b=0;b <= 7;b++)
            {
            JOptionPane.showMessageDialog(null, m[a][b]);
            }
        }
    }
}
