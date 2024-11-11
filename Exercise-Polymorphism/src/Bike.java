public class Bike implements Vehicle{

    private String brand;
   private double hour;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

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

