public class Truck implements Vehicle{

    private String type;
    private double week;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeek() {
        return week;
    }

    public void setWeek(double week) {
        this.week = week;
    }

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
