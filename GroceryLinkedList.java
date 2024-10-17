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
            System.out.println("");
        
        } //print()

    //insert a FoodNode at the indicated index
    void insert(int index, FoodNode node)
    {
        if(index == 0)
        {
            insertAtStart(node);
        }
        else
        {
            FoodNode current = head;
            int count = 0;
            while( (current != null) && (count < index - 1))
            {
                current = current.getNextFood();
                count++;
            }
            if (current != null) 
            {
                node.setNextFood(current.getNextFood());
                current.setNextFood(node);
            }
        }
    }

    //insert a food after another specified food (HINT: use your find() and the other insert() method to help you )
    void insert(String food, FoodNode node)
    {
        int indexOfFood = find(food);
        if(indexOfFood != -1)
        {
            insert(indexOfFood + 1, node);
        }
    }

    //insert a FoodNode at the start of the list (prepend)
    void insertAtStart(FoodNode node) 
    {
        node.setNextFood(head);
        head = node;
    }

    //insert a FoodNode at the end of the list (append)
    void insertAtEnd(FoodNode node) 
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            FoodNode current = head;
            while(current.getNextFood() != null)
            {
                current = current.getNextFood();
            }
            current.setNextFood(node);
        }
    }

    //return if the list is empty
    boolean isEmpty() 
    {
        return head == null;
    }


    //find the specified food is your list. return the index of the food found and -1 if not found.
    public int find(String food) 
    {
        
        FoodNode current = head;
        int index = 0;
        while(current != null) //use a index int & a while loop to loop through the objects
        { // in the list, and return the index of the food object if it is found. Otherwise return -1.
            if( current.getFoodName().equals(food) )
            {
                return index;
            }
            current = current.getNextFood();
            index++;
        }
        return -1;
        
    }

    void remove(String food) 
    {
        if( isEmpty() ) //Case 1: empty list
            System.out.println("List is empty"); 
        FoodNode current = head;
        FoodNode previous = null;
        if(current.getFoodName().equals(food) ) //Case 2: remove 1st node
        {
            System.out.println("Removed: " + current.getFoodName());
        }
        while( (current.getNextFood() != null) && (!current.getFoodName().equals(food)) )
        {
            previous = current;
            current = current.getNextFood();
        }
        if(current.getFoodName().equals(food)) //Case 3: removed named node
        {
            previous.setNextFood(current.getNextFood());
            System.out.println("Removed: "  + current.getFoodName());
        }
        else
        {
            System.out.println("Sorry, no entry for " + food); //Case 4: node not found
        }
           
    }

}
