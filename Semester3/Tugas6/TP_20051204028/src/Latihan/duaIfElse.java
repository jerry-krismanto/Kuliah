package Latihan;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class User{
    int angka;

    User(int angka){
        this.angka=angka;
    }
    public void display(){
        try {
            if(angka==1) System.out.println("satu");
            else if(angka==2) System.out.println("dua");
            else if(angka==3) System.out.println("tiga");
            else if(angka==4) System.out.println("empat");
            else if(angka==5) System.out.println("lima");
            else if(angka==6) System.out.println("enam");
            else if(angka==7) System.out.println("tujuh");
            else if(angka==8) System.out.println("delapan");
            else if(angka==9) System.out.println("sembilan");
            else if(angka==10) System.out.println("sepuluh");
        } catch (Exception e) {
            System.out.println("error");
        }
       
    }
}

public class duaIfElse {
    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Masukkan angka: ");
            int angka = Integer.parseInt(reader.readLine());
            User std = new User(angka);
            std.display();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
