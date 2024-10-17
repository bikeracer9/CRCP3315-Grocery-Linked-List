/*
 * Prescott Lau
 * October 16th
 * 
 * This class is the FoodNode class. It has the code to create a single object (a FoodNode) 
 * that the GroceryLinkedList class uses to create a longer list of these FoodNodes.
 * 
 * This class only has one data object: its name.
 */

public class FoodNode {

    FoodNode nextFood;
    String foodName;
    public FoodNode(String foodName)
    {
        this.foodName = foodName;
        nextFood = null;
    }

    
    /*
    * Getters & Setters for FoodName (data)
    */
    public String getFoodName()
    {
        return foodName;
    }

    public void setFoodName(String f)
    {
        this.foodName = f;
    }


    /*
    * Getters & Setters for NextFood
    */
    public FoodNode getNextFood()
    {
        return nextFood;
    }

    public void setNextFood(FoodNode n)
    {
        this.nextFood = n;
    }

    public String toString()
    {
        return foodName;
    }

}