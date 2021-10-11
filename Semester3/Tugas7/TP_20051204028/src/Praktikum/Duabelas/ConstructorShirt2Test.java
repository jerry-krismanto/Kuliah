package Praktikum.Duabelas;

public class ConstructorShirt2Test {
     public static void main(String[] args) {
        ConstructorShirt2 constShirtSatu=new ConstructorShirt2('R');
        ConstructorShirt2 constShirtDua=new ConstructorShirt2('G');
        ConstructorShirt2 constShirtTiga=new ConstructorShirt2('B',1000);
        char kodeWarna;
        int jumlah;
        kodeWarna=constShirtSatu.getKodeWarna();
        System.out.println("Kode Warna Object 1: "+kodeWarna);
        kodeWarna=constShirtDua.getKodeWarna();
        System.out.println("Kode Warna Object 2: "+kodeWarna);
        kodeWarna=constShirtTiga.getKodeWarna();
        jumlah=constShirtTiga.getJmlStok();
        System.out.println("Kode Warna Object 3: "+kodeWarna);
        System.out.println("Jumlah Stok Object 3: "+jumlah);
    }
}
