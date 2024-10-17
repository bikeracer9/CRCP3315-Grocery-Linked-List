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
        System.out.println("Spinach is number " + indexOfSpinach + " in the grocery list.");
        
        System.out.println("Grocery List:");
        System.out.println("");
        
        GroceryList.print();
        
        System.out.println("-----------------------------------------------" );

        //Test 5:

        //Test 6:

        //Test 7:

    }

}