public class GroceryLinkedList {
    FoodNode head;

    public GroceryLinkedList() 
    {
        head = null; //start with an empty list!
    }

    //traverse and print all the foods in a list
    public void print()
    {
        if (isEmpty())
        
            System.out.println("GroceryList is empty");
        
        FoodNode current = head ; //Start traversal at head
        
        while (current!= null)
            { //While not end of list
            
                System.out.println(current.toString()); //print data
                
                current = current.getNextFood(); //go to next node
            
            }
        
        } //print()

    //insert a FoodNode at the indicated index
    void insert(int index, FoodNode node)
    {
        current = current.getFoodIndex();
        current.setNextFood(node);
    }

    //insert a food after another specified food (HINT: use your find() and the other insert() method to help you )
    void insert(String food, FoodNode node)
    {

    }

    //insert a FoodNode at the start of the list (prepend)
    void insertAtStart(FoodNode node) 
    {
        node.nextFood = head;
        head = node;
    }

    //insert a FoodNode at the end of the list (append)
    void insertAtEnd(FoodNode node) 
    {
        FoodNode current = head;
        while(current.nextFood != null)
        {
            current = current.nextFood;
        }
        current.nextFood = node;
    }

    //return whether the list is empty
    boolean isEmpty() 
    {
        return head == null;
    }


    //find the specified food is your list. return the index of the food found and -1 if not found.
    public int find(String food) 
    {
        if(isEmpty())
            return -1;
        else
        {
            FoodNode current = head;
            while( (current.getNextFood() != null) && (!current.getFoodName().equals(food)) )
                current = current.getNextFood();
                if(current.getFoodName().equals(food))
                    return food.indexOf("" + current); //?????????
                else
                    return -1;
        }
        // FoodNode current = head;
        // FoodNode previous = null;
        // if(current.getFoodName().equals(food)) 
        // {
        //     return current.getFoodIndex(); 
        // }
        // else
        // {
        //     return -1;
        // }
        
    }

    //remove specified food by name
    // String remove(String food) 
    // {
    //     if( isEmpty() ) //Case 1: empty list
    //         return "List is empty"; 
    //     FoodNode current = head;
    //     FoodNode previous = null;
    //     if(current.getFoodName().equals(food) ) //Case 2: remove 1st node
    //     {
    //         return "Removed" + current.toString();
    //     }
    //     while( (current.getNextFood() != null) && (!current.getFoodName().equals(food)) )
    //     {
    //         previous = current;
    //         current = current.getNextFood();
    //     }
    //     if(current.getFoodName().equals(food)) //Case 3: removed named node
    //     {
    //         previous.setNextFood(current.getNextFood());
    //         return "Removed"  + current.toString();
    //     }
    //     else
    //     {
    //         return "Sorry, no entry for " + food; //Case 4: node not found
    //     }
           
    // }



    void remove(String food) 
    {
        if( isEmpty() ) //Case 1: empty list
            System.out.println("List is empty"); 
        FoodNode current = head;
        FoodNode previous = null;
        if(current.getFoodName().equals(food) ) //Case 2: remove 1st node
        {
            System.out.println("Removed" + current.toString());
        }
        while( (current.getNextFood() != null) && (!current.getFoodName().equals(food)) )
        {
            previous = current;
            current = current.getNextFood();
        }
        if(current.getFoodName().equals(food)) //Case 3: removed named node
        {
            previous.setNextFood(current.getNextFood());
            System.out.println("Removed"  + current.toString());
        }
        else
        {
            System.out.println("Sorry, no entry for " + food); //Case 4: node not found
        }
           
    }

}
