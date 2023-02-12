package midExam;

public class Circle extends Shape{
    
    Circle(double redius) {
         super( redius, redius);
    }
    
     void area(){
     double res =Math.PI* dimention1*dimention2;
     System.out.println("Circle area : " +res);
     }
}
