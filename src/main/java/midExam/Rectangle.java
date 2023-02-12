package midExam;

public  class Rectangle extends Shape{
     Rectangle(double dimention1,double dimention2) {
         super( dimention1, dimention2);
    }
    
     void area(){
     double res = dimention1*dimention2;
     System.out.println("Rectangle area : " +res);
     }
    
    
}
