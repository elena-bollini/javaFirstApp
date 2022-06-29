
/**
 * An instantiable class of electronics array
 *
 * @author Elena Bollini
 */

import java.util.Scanner;

public class ElectronicsArray {

    //initialise constant
    private final int MAX_NUM_ELECTRONICS = 10;
    //declare variables
    private Electronic[] electronicsArray;

    //initialise variables
    private int arrayLength = 0;

    public int getArrayLength() {
        return arrayLength;
    }

    //declare and instantiate variable of Scanner type
    Scanner myInput = new Scanner(System.in);

    // constructor of Electronic data type
    public ElectronicsArray() {
        electronicsArray = new Electronic[MAX_NUM_ELECTRONICS];
    }

    //option 1 add Electronic
    public void addElectronic() {
        System.out.println("Option 1- Add an electronic");
        if (arrayLength < MAX_NUM_ELECTRONICS) {
            System.out.println("Write electronic item name: ");
            String addName = myInput.nextLine();
            System.out.println("Write electronic item price: ");
            int addPrice;
            //loop that validate the input price
            do {
                System.out.println("The price can be between 100 and 5000 included. Please enter a valid price: ");
                addPrice = myInput.nextInt();
            } while (!(addPrice >= 100 && addPrice <= 5000));

            System.out.println("Write electronic item quantity: ");
            int addQuantity;
            //loop that validate the input quantity
            do {
                System.out.println("The quantity of the item can be between 1 and 100 included. Plese enter a valid quantity: ");
                addQuantity = myInput.nextInt();
            } while (!(addQuantity >= 1 && addQuantity <= 100));
            myInput.nextLine();

            electronicsArray[arrayLength] = new Electronic(addName, addPrice, addQuantity);
            arrayLength += 1;
        } else {
            System.out.println("You have reach the maximum number of items.");
        } //close if statement
    } //close addElectronic

// option 2
    public void displayAll() {
        for (int i = 0; i < arrayLength; i++) {
            electronicsArray[i].displayElectronic();
        }
    } //close displayAll

// option 3
//
    public void samePrice() {
//boolean that check if at least one match is found
        boolean electronicMatch = false;
        int inputPrice = myInput.nextInt();
        myInput.nextLine();
//loop through array and check match
        for (int i = 0; i < arrayLength; i++) {
            if (electronicsArray[i].getPrice() == inputPrice) {
                electronicMatch = true;
                System.out.println("Item " + (i + 1) + ": ");
                electronicsArray[i].displayElectronic();
            }
        }// close for
        if (electronicMatch == false) {
            System.out.println("No item with the same price has been found");
        }
    }//close samePrice

//option 4
//operation calculate average price
    public float averagePrice() {
        float averagePrice;
        int totalPrice = 0;
        for (int i = 0; i < arrayLength; i++) {
            //sum of the prices
            totalPrice += electronicsArray[i].getPrice();
        }
        averagePrice = totalPrice / arrayLength;
        return averagePrice;
    } // close averagePrice

//option 5
    public void cheapestElectronic() {
        //default value from 0, corresponds to first electronic in array
        int lowestIndex = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (electronicsArray[i].getPrice() < electronicsArray[lowestIndex].getPrice()) {
                lowestIndex = i;
            }
        }
        System.out.println("This is the item with the lowest price: ");
        electronicsArray[lowestIndex].displayElectronic();
    } // close cheapestElectronic

} // close ElettronicsArray class
