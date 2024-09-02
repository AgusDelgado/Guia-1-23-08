import model.Book;

public class Main {
    public static void main(String[] args) {
        Book book =new Book("El quijote", "Miguel Cervantes", 500, 10);
        book.mostrar();
        Book book2 =new Book("Cien Años de Soledad", "Gabriel Garcia Marquez", 700, 5);
        book2.mostrar();
        book.saleBooks(3);
        book.mostrar();
        book2.saleBooks(8);
        book2.mostrar();
        book2.incrementoCopias(5);
        book2.mostrar();
    }
}

/*
En el main, realiza las siguientes operaciones:
a. Inicializa un libro con el título "El Quijote", autor "Miguel de
Cervantes", precio 500, y 10 copias disponibles.
b. Inicializa otro libro con el título "Cien Años de Soledad", autor
"Gabriel García Márquez", precio 700, y 5 copias disponibles.
c. Imprime los detalles de ambos libros.
d. Vende 3 copias del primer libro.
e. Imprime los detalles del primer libro.
f. Intenta vender 8 copias del segundo libro.
g. Incrementa en 5 la cantidad de copias disponibles del segundo libro.
h. Imprime los detalles del segundo libro.

 */