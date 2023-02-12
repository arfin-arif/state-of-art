/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midExam;

/**
 *
 * @author arifm
 */
public class ShapeMain {
    public static void main(String[] args) {
        Shape shape;
        shape = new Rectangle(10, 20);
        shape.area();
        
        shape = new Circle(10);
        shape.area();
        shape = new Triangle(10, 20);
        shape.area();
       
    }
    
}
