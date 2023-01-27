/*
Create a Super class named Animal which has variables (private boolean vegetarian, private
String eats, private int noOfLegs), a parameterized Constructor, setter methods, getter
methods for all variables. It also has methods (public boolean isVegetarian(), public void
setNoOfLegs(int noOfLegs)).

This super class has three sub class named Rabbit, cat and dog. These three classes can
access the properties of the super class and has variable (String color), setter methods,
getter methods.
*/

package stateOfArt;

public class Animal {
   
  private  boolean vegetarian;
  private  String eats;
  private  int noOfLegs;    

    Animal(){}// default  Constructor
    
//  parameterized Constructor
    Animal(boolean vegetarian,String eats, int noOfLegs ) {
        this.vegetarian=vegetarian; //instance variable = local variable
        this.eats=eats;
        this.noOfLegs=noOfLegs;
      }
//getter method for vegetarian
    public boolean isVegetarian() {
        return vegetarian;
    }
//setter method for vegetarian
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
//getter method for eats
    public String getEats() {
        return eats;
    }
//setter method for eats
    public void setEats(String eats) {
        this.eats = eats;
    }
//getter method for noOfLegs
    public int getNoOfLegs() {
        return noOfLegs;
    }
//setter method for noOfLegs
    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
            
     
}

