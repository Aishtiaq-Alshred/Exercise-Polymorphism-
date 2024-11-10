public class Truck implements Vehicle{

    String type;
    double week;

    @Override
    public double calculateRentalCost() {
        return week*500;
    }

    @Override
    public void displayDetails() {

        System.out.println("Rental Details: \n"+
                "type Truck: "+type+
                "\nDaily Rental Rate:" +week
                +"\nRental Cost: "+"$"+calculateRentalCost());


    }
}
