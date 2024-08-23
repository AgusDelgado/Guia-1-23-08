package Package;

public class Bank {

    Integer id;
    String name;
    double balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Bank (Integer id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void credit(double amount) {
        this.balance = this.balance + amount;
    }
    public void debit (double amount) {
        this.balance = this.balance - amount;
    }
    public void objet () {
        System.out.println(this.id + " " +this.name + " " +this.balance);
    }

}



