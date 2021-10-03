package Latihan;

import javax.swing.*;

public class satuJOption {
    
    public static void main(String[] args) {
        JFrame a;
        a = new JFrame();

        int nilai1 = Integer.parseInt(JOptionPane.showInputDialog(a, "Masukkan nilai 1"));
        int nilai2 = Integer.parseInt(JOptionPane.showInputDialog(a, "Masukkan nilai 2"));
        int nilai3 = Integer.parseInt(JOptionPane.showInputDialog(a, "Masukkan nilai 3"));
        
        int rata=(nilai1+nilai2+nilai3)/3;

        if(rata>60){
            JOptionPane.showMessageDialog(a,"Nilai rata-rata: "+rata+" :-)");
        }
        else{
            JOptionPane.showMessageDialog(a,"Nilai rata-rata: "+rata+" :-(");
        }
    }
}
