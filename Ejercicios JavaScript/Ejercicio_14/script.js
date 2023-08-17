class Libro{
    constructor(ISBN, titulo, autor, paginas){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    cargarLibro(){
        this.ISBN = prompt("Ingrese el ISBN del Libro");
        this.titulo = prompt("Ingrese el Titulo del Libro");
        this.autor = prompt("Ingrese el Autor del Libro");
        this.paginas = prompt("Ingrese la Cantidad de Paginas del Libro");
    }
    mostrarLibro(){
        console.log("ISBN: " + this.ISBN);
        console.log("Titulo: " + this.titulo);
        console.log("Autor: " + this.autor);
        console.log("Paginas: " + this.paginas);
    }
}
var libro1 = new Libro(1234567, "Titulo Libro", "Autor Libro", 1000);

libro1.mostrarLibro();