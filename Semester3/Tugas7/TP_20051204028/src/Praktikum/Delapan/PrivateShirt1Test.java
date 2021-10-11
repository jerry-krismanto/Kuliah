package Praktikum.Delapan;

public class PrivateShirt1Test {
    public static void main(String[] args) {
        PrivateShirt1 privShirt=new PrivateShirt1();
        char kodeWarna;
        //Mengisi kode warna yang valid
        privShirt.setKodeWarna('R');
        kodeWarna=privShirt.getKodeWarna();
        //Kelas Private String1Test bisa mengisi kodeWarna yang valid
        System.out.println("Kode Warna: "+kodeWarna);
        //mengisi kode warna yang salah
        privShirt.setKodeWarna('Z');
        kodeWarna=privShirt.getKodeWarna();
        //Kelas Private Shirt1Test bisa mengisi sebuah kodeWarna yang salah
        System.out.println("Kode Warna: "+kodeWarna);
    }
}
