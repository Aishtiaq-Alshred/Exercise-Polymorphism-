public class Bike implements Vehicle{

    String brand;
    double hour;


    @Override
    public double calculateRentalCost() {
        return hour*10;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental Details: \n"+
                "Bike Brand:  "+brand+
                "\nHourly Rental Rate:" +hour
                +"\nRental Cost: "+"$"+calculateRentalCost());

    }
}
