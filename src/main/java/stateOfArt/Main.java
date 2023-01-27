/*
This super class has three sub class named Rabbit, cat and dog. These three classes can
access the properties of the super class and has variable (String color), setter methods,
getter methods.
*/

package stateOfArt;


public class Main {
  
    public static void main(String[] args) {       
        
//        createing object of Rabbit class
        Rabbit rab = new Rabbit(); 
            rab.setVegetarian(true); // accesing superclass methods 
            rab.setEats("Grass");        // using refrence variable
            rab.setNoOfLegs(4);
            rab.setColor("White");
        
           // printing 
            System.out.println("Is Rabbit  Vegetarian: "+ rab.isVegetarian());
            System.out.println("Rabbit  Eats : "+ rab.getEats());
            System.out.println(" Rabbit  has "+ rab.getNoOfLegs()+" legs");
            System.out.println(" Color of the Rabbit : "+ rab.getColor());
            System.out.println();
            
//        createing object of Cat class
        Cat cat = new Cat();
         cat.setVegetarian(false);
         cat.setEats("fish");
         cat.setNoOfLegs(4);
         cat.setColor("White");
        
            System.out.println("Is Cat  Vegetarian: "+ cat.isVegetarian());
            System.out.println(" Cat  Eats: "+ cat.getEats());
            System.out.println(" Cat  has "+ cat.getNoOfLegs() +" legs");
            System.out.println(" Color of the Cat : "+ cat.getColor());
            System.out.println();
            
//        createing object of Dog class
        Dog dog = new Dog();
         dog.setVegetarian(false);
         dog.setEats("Meet");
         dog.setNoOfLegs(4);
         dog.setColor("Black");
        
            System.out.println("Is Dog Vegetarian: "+ dog.isVegetarian());
            System.out.println(" Dog  Eats: "+ dog.getEats());
            System.out.println(" Dog  has "+ dog.getNoOfLegs() +" legs");
             System.out.println(" Color of the Dog: "+ dog.getColor());
            System.out.println();
 
    }
}























