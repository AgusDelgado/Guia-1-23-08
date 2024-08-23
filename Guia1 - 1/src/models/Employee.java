package models;

public class Employee {

    Integer dni;
    String name;
    String lastname;
    double salary;

    public int getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void mostrar (){
        System.out.println(this.dni + " " + this.name + " " + this.lastname + " ");
        System.out.printf("%.2f",this.salary);
    }

    public void annualSalary (){
        System.out.println("El salario anual es de " + this.salary * 12);
    }

    public void salaryIncrease (float porcentage) {
        this.salary = ((this.salary * porcentage) /100) + this.salary;

    }
    public Employee(Integer dni, String name, String lastname, double salary) {
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
    }



}

