
abstract class Account {
    private int acc_Num;
    private double blnc;

    public Account(int acc_Num, double blnc) {
        this.acc_Num = acc_Num;
        this.blnc = blnc;
    }

    public int getAccountNumber() {
        return acc_Num;
    }

    public double getBalance() {
        return blnc;
    }

    public void deposit(double amt) {
    	blnc += amt;
    }

    public void withdraw(double amt) {
        if (amt <= blnc) {
        	blnc -= amt;
        } else {
            System.out.println("Insufficient balance::");
        }
    }
}

class SavingsAccount extends Account {
    private double ir;

    public SavingsAccount(int acc_Num, double blnc, double ir) {
        super(acc_Num, blnc);
        this.ir = ir;
    }

    public double getInterest_Rate() {
        return ir;
    }

    @Override
    public void deposit(double amount) {
        double i = amount * ir / 100;
        super.deposit(amount + i);
    }

    @Override
    public void withdraw(double amt) {
        if (amt <= getBalance()) {
            super.withdraw(amt);
        } else {
            System.out.println("Insufficient balance::");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraft_Limit;

    public CurrentAccount(int acc_Num, double blnc, double overdraft_Limit) {
        super(acc_Num, blnc);
        this.overdraft_Limit = overdraft_Limit;
    }

    public double getOverdraftLimit() {
        return overdraft_Limit;
    }

    @Override
    public void withdraw(double amt) {
        if (amt <= getBalance() + overdraft_Limit) {
            super.withdraw(amt);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit");
        }
    }
}

public class BankingApplication {
    public static void main(String[] args) {
      
        SavingsAccount savingsAccount = new SavingsAccount(14638766, 10980, 7.980);
        CurrentAccount currentAccount = new CurrentAccount(32175521, 29870, 876);

        savingsAccount.deposit(615);
        savingsAccount.withdraw(979);
        currentAccount.deposit(789);
        currentAccount.withdraw(25);
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: $" + savingsAccount.getBalance());
        System.out.println("Interest Rate: " + savingsAccount.getInterest_Rate());
        System.out.println("Current Account Details:");
        System.out.println("Account Number" + currentAccount.getAccountNumber());
        System.out.println("Balance:" + currentAccount.getBalance());
        System.out.println("Overdraft Limit: " + currentAccount.getOverdraftLimit());
    }
}