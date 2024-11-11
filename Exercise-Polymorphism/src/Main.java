import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        List<Vehicle> rentedVehicles = new ArrayList<>();
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Vehicle Rental System\n" +
                    "1. Rent a Car\n" +
                    "2. Rent a Bike\n" +
                    "3. Rent a Truck\n" +
                    "4. View Rented Vehicles\n" +
                    "5. Exit  ");

            System.out.println();

            System.out.println("Enter your choice:");
             number = input.nextInt();
            input.nextLine();

           
            switch (number) {
             case 1:
                    Car c1 = new Car();
                    System.out.println("Enter Car Model: ");
                    c1.model = input.nextLine();
                    System.out.println("Enter Rental Days: ");
                    c1.days = input.nextDouble();
                    c1.displayDetails();
                    rentedVehicles.add(c1);
                    break;

                case 2:
                    Bike b1 = new Bike();
                    System.out.println("Enter Bike Brand: ");
                    b1.brand = input.nextLine();
                    System.out.println("Enter Hourly Rental Rate: ");
                    b1.hour = input.nextDouble();
                    b1.displayDetails();
                    rentedVehicles.add(b1);
                    break;

                case 3:
                    Truck t1 = new Truck();
                    System.out.println("Enter type Truck: ");
                    t1.type = input.nextLine();
                    System.out.println("Enter Daily Rental Rate: ");
                    t1.week = input.nextDouble();
                    t1.displayDetails();
                    rentedVehicles.add(t1);
                    break;




                case 4:
                    System.out.println();
                    for (Vehicle v : rentedVehicles) {
                        v.displayDetails();
                    }


                    break;
                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    break;
            }
        }while (number!=5);


    }
}
