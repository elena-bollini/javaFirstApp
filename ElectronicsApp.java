
/**
 * application to perform funcionalities based on userchoice, using text-based menu
 *
 * @author Elena Bollini
 */

import java.util.Scanner; // import Scanner class

public class ElectronicsApp {

    public static void main(String[] args) {
        //declare var
        int userChoice;
        //declare and instantiate a var of ElectronicsArray type
        ElectronicsArray myElectronicsArray = new ElectronicsArray();

        //declare and instantiate variable of Scanner type
        Scanner myInput;
        myInput = new Scanner(System.in);

        //loop that displays the Menu, request user input and act accordingly
        do {
            //prints the entire menu
            displayMenu();
            //gets an integer that represent the user choice
            userChoice = myInput.nextInt();
            myInput.nextLine();

            //switch case which selects functionalities based on the userChoice
            switch (userChoice) {
                case 1:
                    myElectronicsArray.addElectronic();
                    System.out.println("Press return to continue");
                    myInput.nextLine();
                    break;

                case 2:
                    System.out.println("Option 2- List of electronics: ");
                    if (myElectronicsArray.getArrayLength() >= 1) {
                        myElectronicsArray.displayAll();
                    } else {
                        System.out.println("Error: option not available. There are no electronics stored");
                    }
                    System.out.println("Press return to continue");
                    myInput.nextLine();
                    break;

                case 3:
                    System.out.println("Option 3- Items with the same price");
                    if (myElectronicsArray.getArrayLength() >= 1) {
                        System.out.println("Insert a price to search all the items with the same price: ");
                        myElectronicsArray.samePrice();
                    } else {
                        System.out.println("Error: option not available. There are no electronics stored");
                    }
                    System.out.println("Press return to continue");
                    myInput.nextLine();
                    break;

                case 4:
                    System.out.println("Option 4- Average price of the electronics provided");
                    if (myElectronicsArray.getArrayLength() >= 1) {
                        System.out.println("The average price of the electronics items so far is: " + myElectronicsArray.averagePrice());
                    } else {
                        System.out.println("Error: option not available. There are no electronics stored");
                    }
                    System.out.println("Press return to continue");
                    myInput.nextLine();
                    break;

                case 5:
                    System.out.println("Option 5- Get cheapest electronic:");
                    //print first obj with lowest price. not the price
                    if (myElectronicsArray.getArrayLength() >= 1) {
                        myElectronicsArray.cheapestElectronic();
                    } else {
                        System.out.println("Error: option not available. There are no electronics stored");
                    }
                    System.out.println("Press return to continue");
                    myInput.nextLine();
                    break;

                case 6:
                    System.out.println("option 6- Exit the application");
                    break;
                default:
                    System.out.println("choice not valid. choose options between 1 and 6");
                    break;
            } //Switch statement
        } while (userChoice != 6);
    } //main

//dysplay Menu function
    public static void displayMenu() {
        System.out.println("*********************************************************************");
        System.out.println("Application Menu - Item Type: Electronic");
        System.out.println("This appication can manage 10 items maximum");
        System.out.println("enter 1 - Add an electronic");
        System.out.println("enter 2 - Display all the electronics");
        System.out.println("enter 3 - Search and display all the items whose have a given price");
        System.out.println("enter 4 - Calculate the average price of all the items entered");
        System.out.println("enter 5 - Determine and display the electronic with the lowest price");
        System.out.println("enter 6 - Exit application");
        System.out.println("*********************************************************************");
    }

} //ElectronicsApp class
