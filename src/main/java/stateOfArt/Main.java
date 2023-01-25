/*
This super class has three sub class named Rabbit, cat and dog. These three classes can
access the properties of the super class and has variable (String color), setter methods,
getter methods.
*/

package stateOfArt;


public class Main {
  
    public static void main(String[] args) {
        
        
//        Rabbit
        Rabbit rab = new Rabbit(true, "grass", 2);
        boolean rabVege= rab.getVegetarian();
        String rabEat = rab.getEats();
        int rabLeg = rab.getnoOfLegs();
        rab.setColor("white and black");
        
            System.out.println("Is Rabbit  Vegetarian: "+ rabVege);
            System.out.println(" Rabbit  Eats: "+ rabEat);
            System.out.println(" Rabbit  has "+ rabLeg +" legs");
            System.out.println();
            
//            cat 
        Cat cat = new Cat(false, "meet", 4);
        boolean catVege= cat.getVegetarian();
        String catEat = cat.getEats();
        int catLeg = cat.getnoOfLegs();
        cat.setColor("White");
        
            System.out.println("Is Cat  Vegetarian: "+ catVege);
            System.out.println(" Cat  Eats: "+ catEat);
            System.out.println(" Cat  has "+ catLeg +" legs");
            System.out.println();
//            Dog 
        Dog dog = new Dog(false, "garbeg", 4);
        boolean dogVege= dog.getVegetarian();
        String dogEat = dog.getEats();
        int dogLeg = dog.getnoOfLegs();
        dog.setColor("Brown");
            System.out.println("Is Dog  Vegetarian: "+ dogVege);
            System.out.println(" Dog  Eats: "+ dogEat);
            System.out.println(" Dog  has "+ dogLeg +" legs");

            
          
        
    }
}
