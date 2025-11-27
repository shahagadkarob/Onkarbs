import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Base class
class BankAccount {
    int accNo;
    String name;
    double balance;

    BankAccount(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful. New Balance: " + balance);
        }
        return balance;
    }
}

// Subclass 1
class SavingAccount extends BankAccount {
    double minBalance;
    double interestRate;

    SavingAccount(int accNo, String name, double balance, double minBalance, double interestRate) {
        super(accNo, name, balance);
        this.minBalance = minBalance;
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("Saving Account");
        super.display();
        System.out.println("Minimum Balance: " + minBalance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    double withdraw(double amount) {
        if ((balance - amount) < minBalance) {
            System.out.println("Cannot withdraw beyond minimum balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful. New Balance: " + balance);
        }
        return balance;
    }
}

// Subclass 2
class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(int accNo, String name, double balance, double overdraftLimit) {
        super(accNo, name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void display() {
        System.out.println("Current Account");
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }

    double withdraw(double amount) {
        if ((balance - amount) < -overdraftLimit) {
            System.out.println("Cannot withdraw beyond overdraft limit");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful. New Balance: " + balance);
        }
        return balance;
    }
}

// Subclass 3
class SalaryAccount extends BankAccount {
    String companyName;
    LocalDate lastTransactionDate;

    SalaryAccount(int accNo, String name, double balance, String companyName, LocalDate lastTransactionDate) {
        super(accNo, name, balance);
        this.companyName = companyName;
        this.lastTransactionDate = lastTransactionDate;
    }

    void display() {
        System.out.println("Salary Account");
        super.display();
        System.out.println("Company Name: " + companyName);
        System.out.println("Last Transaction Date: " + lastTransactionDate);
    }

    long getDaysSinceLastTransaction() {
        LocalDate today = LocalDate.now();
        long days = ChronoUnit.DAYS.between(lastTransactionDate, today);
        return days;
    }

    double withdraw(double amount) {
        long days = getDaysSinceLastTransaction();

        if (days > 60) {
            System.out.println("Cannot withdraw. No transaction in last 2 months " + days + " days ago");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful. New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
        return balance;
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(101, "Onkar", 10000, 2000, 5.5);
        sa.display();
        sa.withdraw(8500);
        System.out.println();

        CurrentAccount ca = new CurrentAccount(102, "Apurva", 5000, 2000);
        ca.display();
        ca.withdraw(6500);
        System.out.println();

        SalaryAccount sal = new SalaryAccount(103, "Rohit", 15000, "TCS", LocalDate.of(2025, 8, 10));
        sal.display();
        System.out.println("Days since last transaction: " + sal.getDaysSinceLastTransaction());
        sal.withdraw(2000);
    }
}
