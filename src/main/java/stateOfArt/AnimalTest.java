
package stateOfArt;

public class AnimalTest {
   private boolean vegetarian;
   private String eats;
   private int noOfLegs;


   AnimalTest() {
    }
  
   AnimalTest (boolean vegetarian, String eats, int noOfLegs) {           
      this.vegetarian = vegetarian; // instance variable = local variable
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
   

  
}

 class Cat extends AnimalTest{
  private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
