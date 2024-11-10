import java.util.Scanner;

public class Car implements Vehicle{
//    Scanner input=new Scanner(System.in);

    String model;
    double days;

 //رسوم الايجار
    @Override
    public double calculateRentalCost() {
        return days*50;
    }

    //تفاصيل المركبه
    @Override
    public void displayDetails() {
        System.out.println("Rental Details: \n"+
                "Car Model: "+model+
                "\nDaily Rental Rate:" +days
                +"\nRental Cost: "+"$"+calculateRentalCost());

    }
}
