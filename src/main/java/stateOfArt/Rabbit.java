/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stateOfArt;



class Rabbit extends Animal{
String color;
    public Rabbit(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
    } 
    
        public void setColor (String color){
            color= color;
            System.out.println("The color of the Rabit is  : "+color);
        } 
}
