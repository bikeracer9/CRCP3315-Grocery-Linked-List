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