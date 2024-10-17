/*
 * Prescott Lau
 * October 16th
 * 
 * This is the Main class. It calls the GroceryList method to creates a GroceryList. 
 * 
 * Adds all the FoodNodes into the GroceryList.
 * 
 * Each test below does something different. 
 */
 
public class Main
{
    public static void main(String[] args) {
        
        //Create the GroceryLinkedList
        GroceryLinkedList GroceryList = new GroceryLinkedList();

        //Test 1:
        System.out.println("-----------------------------------------------" );
        System.out.println("Test 1: \n" );

        GroceryList.insertAtStart( new FoodNode("Milk") );
        GroceryList.insertAtEnd( new FoodNode("Bananas") );
        GroceryList.insertAtEnd( new FoodNode("Ice Cream") );
        GroceryList.insertAtEnd( new FoodNode("Spinach") );
        GroceryList.insertAtEnd( new FoodNode("Chicken") );

        System.out.println("Grocery List:");
        System.out.println("");

        GroceryList.print();

        System.out.println("-----------------------------------------------" );


        //Test 2:
        System.out.println("Test 2: \n" );

        GroceryList.remove("Ice Cream");
        
        System.out.println("Grocery List:");
        System.out.println("");
        
        GroceryList.print();
        
        System.out.println("-----------------------------------------------" );
        

        //Test 3:
        System.out.println("Test 3: \n" );

        GroceryList.remove("Chicken");
        
        System.out.println("Grocery List:");
        System.out.println("");
        
        GroceryList.print();
        
        System.out.println("-----------------------------------------------" );


        //Test 4:
        System.out.println("Test 4: \n" );

        int indexOfSpinach = GroceryList.find("Spinach");
        System.out.println("Spinach is number #" + indexOfSpinach + " in the grocery list.");
        System.out.println("");

        System.out.println("Grocery List:");
        System.out.println("");
        
        GroceryList.print();
        
        System.out.println("-----------------------------------------------" );

        //Test 5:
        System.out.println("Test 5: \n" );

        int eggsIndex = GroceryList.find("Eggs");
        if(eggsIndex == -1)
        {
            GroceryList.insertAtEnd( new FoodNode("Eggs") );
        }
        System.out.println("");
        
        System.out.println("Grocery List:");
        System.out.println("");
        
        GroceryList.print();
        
        System.out.println("-----------------------------------------------" );


        //Test 6:
        System.out.println("Test 6: \n" );

        GroceryList.insertAtStart( new FoodNode("Onions") );
        
        System.out.println("Grocery List:");
        System.out.println("");
        
        GroceryList.print();
        
        System.out.println("-----------------------------------------------" );

        //Test 7:
        System.out.println("Test 7: \n" );

        GroceryList.insert("Bananas", new FoodNode("Strawberries") );
        
        System.out.println("Grocery List:");
        System.out.println("");
        
        GroceryList.print();
        
        System.out.println("-----------------------------------------------" );

    }

}