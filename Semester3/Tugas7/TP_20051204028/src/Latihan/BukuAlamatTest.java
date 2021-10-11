package Latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BukuAlamatTest {
    public static void main(String[] args) {
        BukuAlamat nameRecord = new BukuAlamat();
        BukuAlamat addressRecord = new BukuAlamat();
        BukuAlamat phoneRecord = new BukuAlamat();
        BukuAlamat emailRecord = new BukuAlamat();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] name = new String[100];
        String[] address = new String[100];
        String[] phone = new String[100];
        String[] email = new String[100];
        int menu=0;
        String choice="";
        int num=0;
        int total = 0;

        do {
            try {
                System.out.println("1. Input data");
                System.out.println("2. Delete Data");
                System.out.println("3. Show data");
                System.out.println("4. Update data");
                System.out.println("5. Exit");
                System.out.println("Masukkan pilihan anda: ");
                try {
                    menu=Integer.parseInt(reader.readLine());
                } catch (Exception e) {
                    System.out.println("error");
                }
                switch(menu){
                    case 1:
                        System.out.println("Masukkan jumlah siswa baru: ");
                        total = Integer.parseInt(reader.readLine());
                        for(int i=0; i<total; i++){
                            System.out.println("Data ke-"+(i+1));
                            System.out.println("Masukkan nama: ");
                            try {
                                name[i]=reader.readLine();
                            } catch (IOException e) {
                                System.out.println("error");
                            }
                            System.out.println("Masukkan alamat: ");
                            try {
                                address[i]=reader.readLine();
                            } catch (IOException e) {
                                System.out.println("error");
                            }
                            System.out.println("Masukkan no hp: ");
                            try {
                                phone[i]=reader.readLine();
                            } catch (IOException e) {
                               System.out.println("error");
                            }
                            System.out.println("Masukkan email: ");
                            try {
                                email[i]=reader.readLine();
                            } catch (IOException e) {
                               System.out.println("error");
                            }        
                        }
                        for(int i=0; i<total; i++){
                            nameRecord.setName(name[i], i);
                            addressRecord.setAddress(address[i], i);
                            phoneRecord.setPhone(phone[i], i);
                            emailRecord.setEmail(email[i], i);
                        }
                        System.out.println("data berhasil dimasukkan");
                        break;
                    
                    case 2:
                        System.out.println("Masukkan nomor data yang akan dihapus (1-"+total+"): ");
                        try {
                            num = Integer.parseInt(reader.readLine());
                        } catch (Exception e) {
                            System.out.println("error");
                        }   
                        System.out.println("Data ditemukan");
                        num=num-1;
                        nameRecord.setName(name[num], num);
                        addressRecord.setAddress(address[num], num);
                        phoneRecord.setPhone(phone[num], num);
                        emailRecord.setEmail(email[num], num);
                        System.out.println("Nama: "+nameRecord.getName(num));
                        System.out.println("Alamat: "+addressRecord.getAddress(num));
                        System.out.println("No Telp: "+phoneRecord.getPhone(num));
                        System.out.println("Email: "+emailRecord.getEmail(num));
                        System.out.println("Apa anda yakin ingin menghapus data? y/n");
                        try {
                            choice = reader.readLine();
                        } catch (IOException e) {
                            System.out.println("error");
                        }
                        if((choice=="n")||(choice=="N")){
                            System.out.println("Data tidak dihapus");
                        }
                        else{
                            name[num]="";
                            address[num]="";
                            phone[num]="";
                            email[num]="";
                            nameRecord.setName(name[num], num);
                            addressRecord.setAddress(address[num], num);
                            phoneRecord.setPhone(phone[num], num);
                            emailRecord.setEmail(email[num], num);
                            System.out.println("Data berhasil dihapus");
                        }
                        break;

                    case 3:
                        System.out.println("Daftar semua data: ");
                        for(int i=0; i<total; i++){
                            nameRecord.setName(name[i], i);
                            addressRecord.setAddress(address[i], i);
                            phoneRecord.setPhone(phone[i], i);
                            emailRecord.setEmail(email[i], i);
                            System.out.println("Nama: "+nameRecord.getName(i));
                            System.out.println("Alamat: "+addressRecord.getAddress(i));
                            System.out.println("No Telp: "+phoneRecord.getPhone(i));
                            System.out.println("Email: "+emailRecord.getEmail(i));
                        }
                        break;
                    case 4:
                        System.out.println("Masukkan no data yang akan di update: ");
                        try {
                            num = Integer.parseInt(reader.readLine());
                        } catch (IOException e) {
                            System.out.println("error");
                        }
                        System.out.println("Data ditemukan");
                        num=num-1;
                        nameRecord.setName(name[num], num);
                        addressRecord.setAddress(address[num], num);
                        phoneRecord.setPhone(phone[num], num);
                        emailRecord.setEmail(email[num], num);
                        System.out.println("Nama: "+nameRecord.getName(num));
                        System.out.println("Alamat: "+addressRecord.getAddress(num));
                        System.out.println("No Telp: "+phoneRecord.getPhone(num));
                        System.out.println("Email: "+emailRecord.getEmail(num));
                        System.out.println("Apa anda yakin ingin mengupdate data? y/n");
                        try {
                            choice = reader.readLine();
                        } catch (IOException e) {
                            System.out.println("error");
                        }
                        if((choice=="n")||(choice=="N")){
                            System.out.println("Data tidak dihapus");
                        }
                        else{
                            System.out.println("Data ke-"+(num+1));
                            System.out.println("Masukkan nama: ");
                            try {
                                name[num]=reader.readLine();
                            } catch (IOException e) {
                                System.out.println("error");
                            }
                            System.out.println("Masukkan alamat: ");
                            try {
                                address[num]=reader.readLine();
                            } catch (IOException e) {
                                System.out.println("error");
                            }
                            System.out.println("Masukkan no hp: ");
                            try {
                                phone[num]=reader.readLine();
                            } catch (IOException e) {
                               System.out.println("error");
                            }
                            System.out.println("Masukkan email: ");
                            try {
                                email[num]=reader.readLine();
                            } catch (IOException e) {
                               System.out.println("error");
                            }
                            nameRecord.setName(name[num], num);
                            addressRecord.setAddress(address[num], num);
                            phoneRecord.setPhone(phone[num], num);
                            emailRecord.setEmail(email[num], num);    
                            System.out.println("data berhasil diubah");     
                        }
                        break;
                        default:
                            System.out.println("Exiting...");
                }
            } catch (IOException e) {
                System.out.println("error");
            }
        } while (menu!=5);
        System.out.println("Exiting...");
    }
}
