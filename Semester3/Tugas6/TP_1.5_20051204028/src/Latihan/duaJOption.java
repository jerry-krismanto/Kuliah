package Latihan;

import javax.swing.*;

public class duaJOption {
    public static void main(String[] args) {
        JFrame a = new JFrame();
        int angka[] = new int[10];

        for(int i=0; i<10; i++){
            angka[i] = Integer.parseInt(JOptionPane.showInputDialog(a, "Masukkan angka ke"+(i+1)));
        }
        int big=0;
        int cur=0;
        for(int i=0; i<10; i++){
            big=angka[i];
            if(big>cur){
                cur=big;
            }
        }
        JOptionPane.showMessageDialog(a, "Angka terbesar: "+cur);
    }
}
