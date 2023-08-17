var valores = [true, 5, false, "hola", "adios", 2];

// a)
var textos = valores.filter((elemento) => typeof elemento === "string");
var textoMayor = "";
for (let i = 0; i < textos.length; i++) {
  if (textos[i].length > textoMayor.length) {
    textoMayor = textos[i];
  }
}
var resultadoTexto = document.getElementById("vector1");
resultadoTexto.innerHTML = "Vector 1: [" + textoMayor + " ]";

//b)
booleanos = valores.filter((elemento)=> typeof elemento === "boolean");
booleanoMayor = booleanos[0] > booleanos[1];
var resultadoBooleano = document.getElementById("vector2");
resultadoBooleano.innerHTML = "Vector 2: [" + booleanoMayor + " ]";

//c)

var numeros = valores.filter((elemento) => typeof elemento === "number");

var suma = numeros[0] + numeros[1];
var resultadoSuma = document.getElementById("suma");
resultadoSuma.innerHTML = "Suma: " + suma;

var resta = numeros[0] - numeros[1];
var resultadoResta = document.getElementById("resta");
resultadoResta.innerHTML = "Resta: " + resta;

var multiplicacion = numeros[0] * numeros[1];
var resultadoMultiplicacion = document.getElementById("multiplicacion");
resultadoMultiplicacion.innerHTML = "Multiplicación: " + multiplicacion;

var division = numeros[0] / numeros[1];
var resultadoDivision = document.getElementById("division");
resultadoDivision.innerHTML = "División: " + division;

