import java.awt.*;
import java.util.Random;



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
        apps[2] = new MenuItem("Chicken soup", 7.99);
        apps[3] = new MenuItem("Shrimp Dumplings", 8.99);
        apps[4] = new MenuItem("Combo platter", 12.99);

        entrees[0] = new MenuItem("Chicken parm w/ pasta", 12.99);
        entrees[1] = new MenuItem("American cheese burger w/ fries", 14.99);
        entrees[2] = new MenuItem("Grilled cheese w/ tomato soup", 13.99);
        entrees[3] = new MenuItem("10 piece wings w/ fries", 14.99);
        entrees[4] = new MenuItem("Baked chicken w/ veggies", 14.99);

        desserts[0] = new MenuItem("Fried ice-cream", 6.99);
        desserts[1] = new MenuItem("Cheese cake", 7.99);
        desserts[2] = new MenuItem("Banana foster", 7.99);
        desserts[3] = new MenuItem("Acai bowl", 12.99);
        desserts[4] = new MenuItem("Funnel cake", 10.99);

        System.out.println("Below is my Dream Menu: ");

        //in order to display apps i use a for loop to iterate and display each item and price in the array
        System.out.println("\nAppetizers: ");
        for (int i = 0; i < apps.length; i++) {
            System.out.println(apps[i]);
        }
        //in order to display entrees i use a for loop to iterate and display each item and price in the array
        System.out.println("\nEntrees: ");
        for (int i = 0; i < entrees.length; i++) {
            System.out.println(entrees[i]);
        }
        //in order to display desserts i use a for loop to iterate and display each item and price in the array
        System.out.println("\nDesserts: ");
        for (int i = 0; i < desserts.length; i++) {
            System.out.println(desserts[i]);
        }
        //below i am combining all my food items to a single array
        MenuItem[] allFoodItems = new MenuItem[15];
        System.arraycopy(apps, 0, allFoodItems, 0, apps.length);
        System.arraycopy(entrees, 0, allFoodItems, apps.length, entrees.length);
        System.arraycopy(desserts, 0, allFoodItems, apps.length + entrees.length, desserts.length);

        //below i am creating a new array for 20 random food items
        MenuItem[] randomFoodItems = new MenuItem[20];

        //below i am generating random instances and adding the items to the new array
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomIndex = random.nextInt(allFoodItems.length);
            randomFoodItems[i] = allFoodItems[randomIndex];
        }
        //define an array to track the counts of items ordered
//        int[] itemCounts = new int[allFoodItems.length];
//        //iterate through the randomFoodsItems and update the count
//        for (MenuItem item : randomFoodItems) {
//            int itemIndex = findItemIndex(item, allFoodItems);
//            if (itemIndex != -1) {
//                itemCounts[itemIndex]++;
//            }
//
//        }


        //below i am displaying the random food items
        System.out.println( "\nHooray! What a successful day at our Dream Restaurant's drive thru! We've fulfilled our days worth of items sold. Check it out!: ");
        for (int i = 0; i < randomFoodItems.length; i++) {
            System.out.println(randomFoodItems[i]);

        }

        //below i am calculating the total money made
        double totalMoneyMade = 0.0;
        for(MenuItem item : randomFoodItems){
            totalMoneyMade += item.getPrice();
            String itemName = item.getName();


        }


        // below i am calculating and displaying the percentage if sales for each item


        System.out.println("\nSummary: ");
        System.out.println("\nTotal Money Made: $" + totalMoneyMade);

        System.out.println("\nSales Percentage for each item: ");
        for (MenuItem item: allFoodItems) {
            double salesPercentage = (item.getPrice() /  totalMoneyMade) * 100;
            System.out.println(item.getName() + ": " + salesPercentage + "%");
        }
        // Display items ordered and their counts
//        System.out.println("\nItems Ordered and Their Counts:");
//        for (int i = 0; i < allFoodItems.length; i++) {
//            if (itemCounts[i] > 0) {
//                System.out.println(allFoodItems[i].getName() + ": " + itemCounts[i] + " times");
//            }
//        }




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
    //in order to get the price from the dream restaurant class i had to create a getPrice function in the MenuItem class
    public double getPrice() {
        return price;
    }
    //calling getName()
    public String getName() {
        return name;
    }
    public static int findItemIndex(MenuItem item, MenuItem[] items) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(item.getName())) {
                return i;
            }
        }
        return -1; // Item not found
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}
