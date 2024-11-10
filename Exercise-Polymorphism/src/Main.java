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

            Vehicle vehicle;
            switch (number) {
                case 1:
                    vehicle = new Car(); // الإشارة إلى كائن Car
                    System.out.println("Enter Car Model: ");
                    ((Car) vehicle).model = input.nextLine();
                    System.out.println("Enter Rental Days: ");
                    ((Car) vehicle).days = input.nextDouble();
                    vehicle.displayDetails();
                    rentedVehicles.add(vehicle);
                    break;

                case 2:
                vehicle = new Bike(); // الإشارة إلى كائن Bike
                System.out.println("Enter Bike Brand: ");
                ((Bike) vehicle).brand = input.nextLine();
                System.out.println("Enter Hourly Rental Rate: ");
                ((Bike) vehicle).hour = input.nextDouble();
                vehicle.displayDetails();
                rentedVehicles.add(vehicle);
                break;

                case 3:
                    vehicle = new Truck(); // الإشارة إلى كائن Truck
                    System.out.println("Enter type Truck: ");
                    ((Truck) vehicle).type = input.nextLine();
                    System.out.println("Enter Daily Rental Rate: ");
                    ((Truck) vehicle).week = input.nextDouble();
                    vehicle.displayDetails();
                    rentedVehicles.add(vehicle);
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