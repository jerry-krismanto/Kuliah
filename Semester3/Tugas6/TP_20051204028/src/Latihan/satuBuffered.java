package Latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Siswa{
    int nilai1;
    int nilai2;
    int nilai3;
    Siswa(int nilai1, int nilai2, int nilai3){
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }

    public void display(){
        try {
            int rata = (this.nilai1+this.nilai2+this.nilai3)/3;
            if(rata>60){
                System.out.println("Nilai rata-rata: "+rata+" :-)");
            }
            else{
                System.out.println("Nilai rata-rata: "+rata+" :-(");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}


public class satuBuffered{
    public static void main(String[] args) throws IOException {
    try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan nilai 1: ");
        int nilai1 = Integer.parseInt(reader.readLine());
        System.out.println("Masukkan nilai 2: ");
        int nilai2 = Integer.parseInt(reader.readLine());
        System.out.println("Masukkan nilai 3: ");
        int nilai3 = Integer.parseInt(reader.readLine());
        Siswa std = new Siswa(nilai1, nilai2, nilai3);
        std.display();
       } catch (Exception e) {
           System.out.println("error");
       }    
      
    }
}