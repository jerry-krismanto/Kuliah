package Praktikum.Sepuluh;

public class ConstructorShirt1Test {
     public static void main(String[] args) {
        ConstructorShirt1 constShirt=new ConstructorShirt1('R');
        char kodeWarna;
        kodeWarna= constShirt.getKodeWarna();
        System.out.println("Kode Warna: "+kodeWarna);
    }   
}
