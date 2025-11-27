class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount() {
        this.accountNumber = 0;
        this.holderName = "Not Given";
        this.balance = 0.0;
    }

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    void setBalance(double balance) {
        this.balance = balance;
    }
    int getAccountNumber() {
        return this.accountNumber;
    }
    String getHolderName() {
        return this.holderName;
    }
    double getBalance() {
        return this.balance;
    }


    void Display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double dailyWithdrawalLimit;

    SavingsAccount(){
        super();
        this.dailyWithdrawalLimit = 0.0;
    }
    SavingsAccount(int accountNumber, String holderName, double balance,double dailyWithdrawalLimit) {
        super(accountNumber, holderName, balance);
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }
    void setDailyWithdrawalLimit(double dailyWithdrawalLimit) {
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }
    double getDailyWithdrawalLimit() {
        return this.dailyWithdrawalLimit;
    }

    void Display() {
        super.Display();
        System.out.println("Daily Withdrawal Limit: " + dailyWithdrawalLimit);
    }
}

class TestBank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        SavingsAccount s1 = new SavingsAccount(101, "Onkar", 50000, 20000);
        s1.Display();
        b1.Display();
    }
}
