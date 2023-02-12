package midExam;

public class AccountMain {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(); 
        sa.deposit(10000);
        sa.withdraw(0);
        sa.addInterest(.02,1);
        System.out.println("The interset is : "+sa.getInterest());
    }
    
}
