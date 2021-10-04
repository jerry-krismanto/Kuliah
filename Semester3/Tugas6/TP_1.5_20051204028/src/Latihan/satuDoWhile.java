package Latihan;

public class satuDoWhile {
    public static void main(String[] args) {
        String[] days = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
        int i=0;
        do{
            System.out.println(days[i]);
            i++;
        }
        while(i<days.length);
    }
}
