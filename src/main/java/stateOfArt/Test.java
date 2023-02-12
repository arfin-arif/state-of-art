/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stateOfArt;

/**
 *
 * @author arifm
 */
public class Test {
    public static void main(String[] args) {
  
        
        Cat cat = new Cat();
        cat.setColor("Black");
        cat.setEats("Fish");
        cat.setVegetarian(false);
        cat.setNoOfLegs(4);
        
        System.out.println("Cat color is : "+cat.getColor());
        System.out.println("Cat has : "+cat.getNoOfLegs()+" legs");
    }
}
