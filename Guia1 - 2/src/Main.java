//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Package.Bank bank = new Package.Bank();


    }
}


/*Modele el objeto que representa la cuenta de un banco, con identificador,
nombre y balance. Considere los getters, setters y constructores necesarios.
Luego, realizar los siguientes métodos:
a. El método crédito que representa un depósito de dinero en la
cuenta. Este método debe devolver el balance luego de la operación.
b. El método débito que representa una sustracción de dinero de la
cuenta. Este método debe devolver el balance luego de la operación. Si
el dinero en la cuenta no es suficiente para cubrir la sustracción, se
debe imprimir por pantalla un aviso sin permitir dicha sustracción.
c. Un método que imprima por pantalla las características del objeto.
En el main, realice las siguientes operaciones:
1. Inicialice una cuenta con un monto inicial de 15000.
2. Realice una operación de crédito de 2500.
3. Realice una operación de compra de 1500.
4. Realice una operación de compra de 30000.
5. Imprima por pantalla los valores de la cuenta y verifique que el
balance sea correcto.*/