import java.awt.*;

public class DreamRestaurant {
    public static void main(String[] args) {
        //below i created an array for apps, entrees, and desserts
        MenuItem[] apps = new MenuItem[5];
        MenuItem[] entrees = new MenuItem[5];
        MenuItem[] desserts = new MenuItem[5];
        // in each of the arrays i am creating 5 items for each of the three arrays
        //i am giving each menu item its index in the array and naming and pricing each menu item
        apps[0] = new MenuItem("French fries", 5.99);
        apps[1] = new MenuItem("Mozzarella sticks", 6.99);
        apps[2] = new MenuItem("French onion soup", 7.99);
        apps[3] = new MenuItem("Shrimp Dumplings", 8.99);
        apps[4] = new MenuItem("Combo platter", 12.99);

        entrees[0] = new MenuItem("Chicken parm w/ pasta", 12.99);
        entrees[1] = new MenuItem("American cheese burger w/ fries", 14.99);
        entrees[2] = new MenuItem("Grilled cheese w/ tomato soup", 13.99);
        entrees[3] = new MenuItem("10 piece wings 2/ fries", 14.99);
        entrees[4] = new MenuItem("Baked chicken w/ veggies", 14.99);

        desserts[0] = new MenuItem("Fried ice-cream", 6.99);
        desserts[1] = new MenuItem("Cheese cake", 7.99);
        desserts[2] = new MenuItem("Banana foster", 7.99);
        desserts[3] = new MenuItem("Cake pops", 3.99);
        desserts[4] = new MenuItem("Funnel cake", 10.99);

        System.out.println("Dream Menu: ");

        //in order to display apps i use a for loop to iterate and display each item and price in the array
        System.out.println("Appetizers: ");
        for (int i = 0; i < apps.length; i++) {
            System.out.println(apps[i]);
        }
        //in order to display entrees i use a for loop to iterate and display each item and price in the array
        System.out.println("Entrees: ");
        for (int i = 0; i < entrees.length; i++) {
            System.out.println(entrees[i]);
        }
        //in order to display desserts i use a for loop to iterate and display each item and price in the array
        System.out.println("Desserts: ");
        for (int i = 0; i < desserts.length; i++) {
            System.out.println(desserts[i]);
        }




    }
}
//i am creating a new class called menu item
class MenuItem {

    //below are the field string and price of each menu item
    private String name;
    private double price;

    //i created a constructor method  where the menu item is displayed and the price is shown in the string
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return name + ": $" + price;
    }
}
