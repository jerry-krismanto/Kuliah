package Latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class duaBuffered{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] angka = new int[10];
        try {
            for(int i=0; i<10; i++){
                System.out.println("Masukkan angka ke-"+(i+1));
                angka[i] = Integer.parseInt(reader.readLine());
            }
        } catch (IOException e) {
            System.out.println("error");
        }
        int big=0;
        int cur=0;
        try {
            for(int i=0; i<10; i++){
                big=angka[i];
                if(big>cur){
                    cur=big;
                }
            }
            System.out.println("Angka terbesar: "+cur);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}