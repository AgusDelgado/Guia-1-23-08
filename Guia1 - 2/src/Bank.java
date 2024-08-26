public class Bank {

    private Integer id;
    private String name;
    private double balance;

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

    public Bank (){}

    public Bank (Integer id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void credit(double amount) {
        this.balance = this.balance + amount;
        mostrarBalance();
    }
    public void debit (double amount) {
        if (this.balance < amount){
            System.out.println("Fondos insuficientes");

        }else{
            this.balance = this.balance - amount;
            mostrarBalance();
        }
    }

    public void mostrar() {
        System.out.println(this.id + " " +this.name + " " +this.balance);
    }
    public void mostrarBalance(){
        System.out.println(this.balance);
    }
}



