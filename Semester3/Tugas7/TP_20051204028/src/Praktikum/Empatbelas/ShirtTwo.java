package Praktikum.Empatbelas;

public class ShirtTwo {
     public int shirID=0;//Default ID for the shirt
    public String description="-description required";
    public char colordCode='U';//The color codes are R=Red,B=Blue,U=Unset
    public double price=0.0;//Default price for all shirt
    public int quantityInStock=0; //Default quantity for all shirts

    public void setShirInfo(int ID, String desc, double cost){
        shirID=ID;
        description=desc;
        price=cost;
    }
    public void setShirtInfo(int ID, String desc, double cost, char color){
        shirID=ID;
        description=desc;
        price=cost;
        colordCode=color;
    }
    public void setShirInfo(int ID, String desc, double cost,char color, int quantity){
        shirID=ID;
        description=desc;
        price=cost;
        colordCode=color;
        quantityInStock=quantity;
    }
    //This method displays the values for on item
    public void display(){
        System.out.println("Item ID : "+shirID);
        System.out.println("Item description : "+description);
        System.out.println("Color code : "+colordCode);
        System.out.println("Item price : "+price);
        System.out.println("Quantity in stock : "+quantityInStock);
    }//end of display method
}
