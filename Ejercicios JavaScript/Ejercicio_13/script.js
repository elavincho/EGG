//Creamos un objeto tipo persona
const personas = [];
// Creamos una clase y constructor con los atributos de la persona
class Persona {
    constructor(nombre, edad, sexo, peso, altura){
        this.nombre = nombre;
        this.edad = edad,
        this. sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    mostrar(){
        console.log(this.nombre, this.edad, this.sexo, this.peso, this.altura);
    }
}
// Creamos una nueva persona con sus atributos
const persona1 = new Persona("Juan", 24, "H", 89, 1.76);
//Agregamos a la persona al array (push agraga el objeto al final del array)
personas.push(persona1);
const persona2 = new Persona("Lola", 21, "M", 57, 1.61);
//Agregamos a la persona al array (unshift agrega el objeto al principio del array)
personas.unshift(persona2);
const persona3 = new Persona("Mora", 25, "O", 87, 1.78);
//Agregamos a la persona al array
personas.push(persona3);

//Mostramos a las personas
console.log(personas);

personas.forEach((persona) => persona.mostrar());

console.log(typeof personas);

var listaPersonas = JSON.stringify(personas);
console.log(listaPersonas);
console.log(typeof listaPersonas);

var nuevoPaquete = JSON.parse(listaPersonas);
console.log(nuevoPaquete);
console.log(typeof nuevoPaquete);