package Praktikum.Sepuluh;

public class ConstructorShirt1 {
    private int idBaju=0;//ID Default untuk baju
    private String keterangan="-Keterangan Diperlukan";//default
    //kode warna R=Merah,G=Hijau,B=Biru,U=Tidak Ditentukan
    private char kodeWarna='U';
    private double harga=0.0;//harga default untuk semua barang
    private int JmlStok=0;//default untuk jumlah barang

    public ConstructorShirt1(char kodeAwal){
        switch (kodeAwal){
            case 'R':
            case 'G':
            case 'B':
                kodeWarna=kodeAwal;
                break;
            default:
                System.out.println("kodeWarna salah, gunakan R,G, atau B");
        }
    }

    public char getKodeWarna() {
        return kodeWarna;
    } 
}
