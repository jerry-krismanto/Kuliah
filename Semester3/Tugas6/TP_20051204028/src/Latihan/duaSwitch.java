package Latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class duaSwitch {
    public static void main(String[] args) {

        int angka=0;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Masukkan angka: ");
            angka =  Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println();
        }

        try {
            switch(angka){
                case 1:{
                    System.out.println("satu");
                    break;
                }
                case 2:{
                    System.out.println("dua");
                    break;
                }
                case 3:{
                    System.out.println("tiga");
                    break;
                }
                case 4:{
                    System.out.println("empat");
                    break;
                }
                case 5:{
                    System.out.println("lima");
                    break;
                }
                case 6:{
                    System.out.println("enam");
                    break;
                }
                case 7:{
                    System.out.println("tujuh");
                    break;
                }
                case 8:{
                    System.out.println("delapan");
                    break;
                }
                case 9:{
                    System.out.println("sembilan");
                    break;
                }
                case 10:{
                    System.out.println("sepuluh");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
