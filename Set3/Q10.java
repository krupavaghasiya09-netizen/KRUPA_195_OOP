class BankAccount {
    String account_holder_name;
    double balance;

    static double interest_rate = 5.0;
    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

      double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

       void display() {
        System.out.println("Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }

     static void updateInterestRate(double newRate) {
        interest_rate = newRate;
    }

    public static void main(String[] args) {
     
        BankAccount a1 = new BankAccount("Krupa", 10000);
        BankAccount a2 = new BankAccount("Rahul", 20000);

        System.out.println("Before Updating Interest Rate:");
        a1.display();
        a2.display();

        BankAccount.updateInterestRate(7.0);

        System.out.println("\nAfter Updating Interest Rate:");
        a1.display();
        a2.display();
    }
}
