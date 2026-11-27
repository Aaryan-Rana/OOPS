

public class BankAccountClass {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Aaryan", 100000);
        obj.displayBalance();

    //     //OR
    //     BankAccount account = new BankAccount("Aaryan", 100000);
    //     account.displayBalance();
    }
    
}

class BankAccount{
    String accountholder = "Alok";
    double balance = 200000;

    BankAccount(String accountholder, double balance){
        this.accountholder=accountholder;
        this.balance=balance;
    }

    void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }

    void displayBalance(){
        System.out.println(accountholder + ":" +balance);
    }
}
