public class MenuProgram {
    public static void main(String[] args) {
        
        MenuComponent burger = new MenuItem("Classic Burger", 250.00);
        MenuComponent fries = new MenuItem("Large Fries", 85.00);
        MenuComponent soda = new MenuItem("Root Beer", 60.00);
        MenuComponent sundae = new MenuItem("Vanilla Sundae", 45.00);

       
        MenuCategory soloMeal = new MenuCategory("Barkada Solo Meal");
        soloMeal.add(burger);
        soloMeal.add(fries);
        soloMeal.add(soda);

        
        MenuCategory mainMenu = new MenuCategory("Main Menu");
        mainMenu.add(soloMeal);
        mainMenu.add(sundae);

        
        mainMenu.print();
        
        System.out.println("\n=========================================");
        System.out.println("Total Menu Value: P" + String.format("%.2f", mainMenu.getPrice())); 
    }
}