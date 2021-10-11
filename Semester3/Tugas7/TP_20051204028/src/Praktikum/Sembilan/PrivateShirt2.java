package Praktikum.Sembilan;

public class PrivateShirt2 {
    private int idBaju=0;//ID default untuk baju
    private String keterangan="-Keterangan Diperlukan";//default
    //kode warna R=Merah,G=Hijau,B=Biru,U=Tidak Ditentukan
    private char kodeWarna='U';
    private double harga=0.0;//Harga default untuk semua barang
    private int jmlStok=0;//Default untuk jumlah barang

    public char getKodeWarna() {
        return kodeWarna;
    }

    public void setKodeWarna(char kode) {
        switch (kode){
            case 'R':
            case 'G':
            case 'B':
                kodeWarna=kode;
                break;
            default:
                System.out.println("kodeWarna Salah, gunakan R, G, atau B");
        }
    }
    //method get dan set untuk idBaju, keterangan
    //harga, dan jmlStok akan mengikuti 
}
