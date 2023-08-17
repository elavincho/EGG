const boton = document.getElementById("boton");
boton.addEventListener("click", resaltarPalabras);

let contador = 0;
let textoInicial = document.querySelector("#textoModificar").innerHTML;
let textoFinal = [];

function resaltarPalabras() {
  if (contador == 0) {
    contador++;
    document.getElementById("textoModificar").innerHTML = "";
    textoInicial = textoInicial.split(" ");
    textoInicial.forEach((element) => {
      if (element.length >= 8) {
        textoFinal.push(`<span class="amarillo">${element}`);
      } else {
        textoFinal.push(element);
      }
    });
    for (let i = 0; i < textoFinal.length; i++) {
      document.getElementById("textoModificar").innerHTML +=
        textoFinal[i] + " ";
    }
  } else {
    alert("Las palabras ya estan resaltadas");
  }
}
