package entities;

public class Account {

    private int number;
    private String holder;
    private double balance;


    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double valor){
        this.balance += valor;
    }

    public void withdraw(double valor) {
        this.balance -= valor + 5.0;
    }

    public String toString(){
        return "Account " + this.number + ", Holder: " + this.holder + ", Balance: $ " + String.format("%.2f", this.balance);
    };
}
