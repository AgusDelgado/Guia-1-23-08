package model;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private double price;
    private Integer copies;

    private static Integer idCounter = 0;

    public Integer getId() {
        return id;
    }


    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String title, String author, double price, Integer copies) {
        this.title = title;
        this.id = giveId();
        this.author = author;
        this.price = price;
        this.copies = copies;
    }

    private Integer giveId(){
        idCounter++;
        return idCounter;
    }

    public void mostrar(){
        System.out.println("Id:" +this.id + " Libro:" +this.title + "  Autor: " + this.author + " Precio: " + this.price + " Numero de copias: " + this.copies);
    }

    public void saleBooks(Integer copies){
        if (this.copies < copies){
            System.out.println("Copias insuficientes");

        }else {
            this.copies = this.copies - copies;
        }
    }
    public void incrementoCopias (Integer copies){
        this.copies = this.copies + copies;

    }
}


/*
/*Modela un objeto Libro que tenga las siguientes características: id (único y
autoincremental), título, autor, precio y cantidad de copias disponibles.
En dicha clase implementa los siguientes métodos:
● Un constructor que inicialice el Libro con su título, autor, precio y
cantidad de copias. El id debe ser asignado automáticamente.
● Métodos getters y setters para cada atributo, excepto el id, que solo
tendrá un getter.
● Un método que permita vender una cierta cantidad de copias de un
libro, disminuyendo la cantidad disponible. Si no hay suficientes
copias, debe mostrar un mensaje indicando que la operación no es
posible.
● Un método que permita incrementar la cantidad de copias disponibles
en el inventario.
● Un método que imprima por pantalla los detalles del libro en el
siguiente formato: Libro[id=?, título=?, autor=?, precio=?, copias
disponibles=?]
 */