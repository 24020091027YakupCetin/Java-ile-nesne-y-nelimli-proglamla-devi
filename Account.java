
package account;
import java.util.Date;


public class Account {
    
    int id;
    double balance;
    double annualInterestRate;
   private Date dateCreated;

    
    public Account(){
        this.id=0;
        this.balance=0;
        this.dateCreated=new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        
        return this.dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate / (12);
        
    }
    
    public double getMonthlyInterest(){
        return (balance) * (annualInterestRate / (12));
        
    }
    
    public double withdraw(double amount){
      return balance -= amount;
        
    }
    
    public double deposit(double amount){
        return balance+= amount;
        
    } 
    

   
   
    
}
