public class Shirt {
    public int shirtID = 1;
    public String description = "Cool Shirt";
    public String colorCode = "Red";
    public double price = 9.99;
    public int quantityInStock = 3;
    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}