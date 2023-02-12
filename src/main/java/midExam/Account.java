package midExam;

abstract class Account {
    protected double balance;
    protected double interest;
    
    public Account(){
      balance = 0;
      interest =0;
    }
    public Account (double initialBlance , double InitialInterest){
        this.balance=initialBlance;
        this.interest=InitialInterest;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract void addInterest(double interest,double time);
    abstract double getInterest();
    
}

 class SavingsAccount extends Account{

    @Override
    void deposit(double amount) {
        balance = balance + amount ;
        System.out.println("Your New Blance is : "+balance);
    }

    @Override
    void withdraw(double amount) {
         balance = balance - amount ;
        System.out.println("After Withdraw New Blance is : "+balance +" You Withdraw : "+amount);
    }

    @Override
    void addInterest(double interest,double time) {
      balance = balance*interest*time;  
    }

    @Override
    double getInterest() {
        return balance;
    }
    
}


