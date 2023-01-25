/*
Create a Super class named Animal which has variables (private boolean vegetarian, private
String eats, private int noOfLegs), a parameterized Constructor, setter methods, getter
methods for all variables. It also has methods (public boolean isVegetarian(), public void
setNoOfLegs(int noOfLegs)).
*/

package stateOfArt;

public class Animal {
    
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;
    
    
       Animal(){
        
    }

    Animal(boolean vegetarian,String eats, int noOfLegs ) {
        this.vegetarian=vegetarian;
        this.eats=eats;
        this.noOfLegs=noOfLegs;
      }
            //  to set is veg or not 
             public void setVegetarian() {
                  vegetarian = vegetarian;
                   }  
              //  to get is veg or not 
              public boolean getVegetarian() {
                   return vegetarian;
               }
            //  to set is eats or not 
             public void setEats(String eats) {
                   eats = eats;
                
               }  
              //  to get is eats or not 
             public String getEats() {
                   return eats;
               }
            //  to set is noOfLegs or no
               public void setnoOfLegs(int noOfLegs) {
                    if (noOfLegs >=1 && noOfLegs <=4 ) {
                   noOfLegs = noOfLegs;
                    } else {
                    System.out.println("Error! Legs  can't be negative!");
              }
               }
             //  to get is noOfLeg
               public int getnoOfLegs() {
                   return noOfLegs;
               } 
   
    
    
}
