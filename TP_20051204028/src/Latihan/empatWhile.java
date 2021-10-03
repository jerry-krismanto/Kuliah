package Latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class empatWhile {
    public static void main(String[] args) {
        int angka=0;
        int pangkat=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Masukkan koofisien: ");
            angka = Integer.parseInt(reader.readLine());
            System.out.println("Masukkan pangkat: ");
            pangkat = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("error");
        }
        int i=0;
        long hasil=1;
        while(i<pangkat){
            hasil = hasil*angka;
            i++;
        }
        System.out.println(hasil); 
    }
}
