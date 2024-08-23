import models.Employee;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee(23456234, "Carlos","Gutierrez", 25000);
        employee.mostrar();
        employee.salaryIncrease((float) 15);
        employee.annualSalary();
        employee.mostrar();
    }
}



/*Modele el objeto Empleado que posee las siguientes características, dni,
nombre, apellido y salario. El mismo debe contar con la posibilidad de
calcular el salario anual.

 A su vez se requiere otro método que permita
aumentar el salario dependiendo del porcentaje que se le pase por
parámetro.
Considere crear un método que facilite imprimir por pantalla las
características del objeto de la siguiente forma:
Empleado[dni=?, nombre=?, apellido=?, salario=?]

En el main, realice las siguientes operaciones:
a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial
de 25000.
b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
27500.
c. Imprima ambos objetos por pantalla.
d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
salario anual del mismo.
*/