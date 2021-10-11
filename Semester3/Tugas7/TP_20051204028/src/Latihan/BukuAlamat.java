package Latihan;

public class BukuAlamat {
    private String[] name = new String[100];
    private String[] address = new String[100];
    private String[] phone = new String[100];
    private String[] email = new String[100];
    private static int count;

    public BukuAlamat(){
        count = 0;
    }
    public String getName(int index){
        return name[index];
    }
    public String getAddress(int index){
        return address[index];
    }
    public String getPhone(int index){
        return phone[index];
    }
    public String getEmail(int index){
        return email[index];
    }
    public void setName(String name, int index){
        this.name[index] = name;
        count++;
    }
    public void setAddress(String address, int index){
        this.address[index] = address;
    }
    public void setPhone(String phone, int index){
        this.phone[index] = phone;
    }
    public void setEmail(String email, int index){
        this.email[index] = email;
    }
    public static int getCount(){
        return count;
    }
}
