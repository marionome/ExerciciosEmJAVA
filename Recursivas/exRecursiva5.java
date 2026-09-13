import javax.swing.JOptionPane;

public class exRecursiva5 {
    
    public static void main(String args[])
    {
    int n,r;
    n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero:"));
    r = SomaRecursiva(n);
    JOptionPane.showMessageDialog(null, r);
    }
    
    public static int SomaRecursiva(int n)
    {
        if(n>1)
        {
            return  FatN(n)+SomaRecursiva(n-1);
        }
        else
        {
            return FatN(n);
        }
    }
    
    public static int FatN(int n){
    if (n>1){
    return n*FatN(n-1);
    }
    else
        {
        return n * n;
        }
    }
}
