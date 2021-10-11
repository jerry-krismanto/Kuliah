package Praktikum.Satu;

public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;
    
    public String getName(){
        return name;
    }
    public void setName(String temp){
        name = temp;
    }
    public String getAdress(){
        return address;
    }
    public void setAdress(String temp){
        address = temp;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int temp){
        age = temp;
    }
    public double getMathGrade(){
        return mathGrade;
    }
    public void setMathGrade(double temp){
        mathGrade = temp;
    }
    public double getEnglishGrade(){
        return englishGrade;
    }
    public void setEnglishGrade(double temp){
        englishGrade = temp;
    }
    public double getScienceGrade(){
        return scienceGrade;
    }
    public void setScienceGrade(double temp){
        scienceGrade = temp;
    }
    
    // menghitung rata-rata nilai
    public double getAverage(){
        double result = 0;
        result = (mathGrade+englishGrade+scienceGrade)/3;
        return result;
    }
    // menghasilkan jumlah instance  StudentRecord
    public static int getStudentCount(){
        return studentCount;
    }   
}
