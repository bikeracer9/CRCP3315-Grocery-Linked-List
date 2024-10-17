/*
 * Prescott Lau
 * October 16th
 * 
 * This class is the GroceryLinkedList class. It has all the code to add and maintain a list of
 * the FoodNode objects. The GroceryLinkedList is like a container that holds FoodNode balls.
 */

public class GroceryLinkedList {
    FoodNode head; //head of the list.

    public GroceryLinkedList() //constructor:
    {
        head = null; //start with an empty list!
    }

    
    /*
     * Prints all the foods in a list.
     * If there is nothing in the list, it prints "GroceryList is empty."
     */
    public void print()
    {
        if (isEmpty()) //if isEmpty = true:
        
            System.out.println("GroceryList is empty"); 
        
        FoodNode current = head ; //Start at head
        
        while (current!= null)
            { //While not the end of the list
            
                System.out.println(current.toString()); //print data
                
                current = current.getNextFood(); //go to next node
            }
            System.out.println(""); 
        
    } //end of print()


    /*
    * inserts a FoodNode at the indicated index provided.
    */
    void insert(int index, FoodNode node)
    {
        if(index == 0) //if the given index is zero, insert the node at beginning.
        {
            insertAtStart(node);
        }
        else //otherwise: loop through the nodes to find where to place the next node.
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
    }//end of insert(index, node) 


    /*
     * Inserts a new FoodNode after another specified FoodNode.
     * Uses find to get the index of the specified FoodNode.
     * Then also uses insert (with a given index) method to add the
     * new FoodNode after the specified FoodNode.
     */
    void insert(String food, FoodNode node)
    {
        int indexOfFood = find(food);
        if(indexOfFood != -1) //if the indexOfFood is not -1
        {
            insert(indexOfFood + 1, node);
        }
    }//end of insert(food, node)


    /*
     * Inserts a FoodNode at the start of the list (prepend).
     */
    void insertAtStart(FoodNode node) 
    {
        node.setNextFood(head); 
        head = node;
    }//end of insertAtStart()


    /*
     * Inserts a FoodNode at the end of the list (append). 
     */
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
    }//end of insertAtEnd()


    /*
     * Boolean to return "true" if the list is empty.
     */
    boolean isEmpty() 
    {
        return head == null;
    }//end of isEmpty()


    /*
     * Find the specified Food is your list. 
     * Returns the index of the food found and returns -1 if specified food item is not found.
     */
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
    } //end of find()

    /*
     * Removes the specified given FoodNode.
     */
    void remove(String food) 
    {
        if( isEmpty() ) //Case 1: empty list
            System.out.println("List is empty"); 
            System.out.println("");
        FoodNode current = head;
        FoodNode previous = null;
        if(current.getFoodName().equals(food) ) //Case 2: Remove 1st node
        { // because current = head at the moment.
            System.out.println("Removed: " + current.getFoodName());
            System.out.println("");
        }
        while( (current.getNextFood() != null) && (!current.getFoodName().equals(food)) )
        { //while loop to go through the list of FoodNodes.
            previous = current;
            current = current.getNextFood();
        }
        if(current.getFoodName().equals(food)) //Case 3: Removed given named node
        {
            previous.setNextFood(current.getNextFood());
            System.out.println("Removed: "  + current.getFoodName());
            System.out.println("");
        }
        else
        {
            System.out.println("Sorry, no entry for " + food); //Case 4: node not found
        }
           
    }

}
