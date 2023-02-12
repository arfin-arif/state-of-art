package midExam;

public class Triangle extends Shape {
     Triangle(double dimention1,double dimention2) {
         super( dimention1, dimention2);
    }
    
     void area(){
     double res = 0.5*dimention1*dimention2;
     System.out.println("Triangle area : " +res);
     }
}
