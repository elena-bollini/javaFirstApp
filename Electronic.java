
/**
 * An instantiable class of electronic item
 *
 * @author Elena Bollini
 */

public class Electronic {

    //declare variable
    private String name;
    private int price;
    private int quantity;

    //create an object of Electronic data type
    //Electronic() constructor
    public Electronic(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //declare getter methods

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // method display electronic
    public void displayElectronic() {
        System.out.println(this.name + " " + this.price + " " + this.quantity);
    }

}
