var frase = "";
var separarFrase = "";

function ingresar() {
  frase = document.getElementById("frase").value;
  let fraseOriginal = document.getElementById("fraseOriginal");
  fraseOriginal.innerHTML = "Frase Original: " + frase;
}

function subString() {
    for (var i = 0; i < frase.length; i++) {
        separarFrase += frase.substring(i, i + 1) + '  ';
    }
  let fraseSeparada = document.getElementById("respuestaSubString");
  fraseSeparada.innerHTML = "Frase Separada: " + separarFrase;
}
