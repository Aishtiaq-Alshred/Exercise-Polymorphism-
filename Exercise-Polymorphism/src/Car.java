public class Car implements Vehicle{

    private String model;
    private double days;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }

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
