package Praktikum.Tiga;

public class StudentRecord {
      private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;
    
    public StudentRecord(){ //constructor default
        studentCount++;
    }
    public StudentRecord(String temp){
        this.name = temp;
        studentCount++;
    }
    public StudentRecord(String name, String address){
        this.name = name;
        this.address = address;
        studentCount++;
    }
    public StudentRecord(double mGrade,double eGrade, double sGrade){
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
        studentCount++;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String temp){
        name = temp;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String temp){
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
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    public double getEnglishGrade(){
        return englishGrade;
    }
    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    public double getScienceGrade(){
        return scienceGrade;
    }
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    // rata rata nilai
    
    public double getAverage(){
        double result = 0;
        result = (mathGrade+englishGrade+scienceGrade)/3;
        return result;
    }
    // menghasilkan jumlah instance  StudentRecord
    public static int getStudentRecord(){
        return studentCount;
    }
    public void print(String temp){
        System.out.println("Name :"+name);
        System.out.println("Adress :"+address);
        System.out.println("Age :"+age);
    }
    public void print(double mGrade, double eGrade, double sGrade){
        System.out.println("Name :"+name);
        System.out.println("Math Grade :"+mGrade);
        System.out.println("English Grade :"+eGrade);
        System.out.println("Science Grade :"+sGrade);
    }
     
}
