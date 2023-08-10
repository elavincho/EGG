var palabra = "";
var invertida = "";

function ingresar() {
  palabra = document.getElementById("palabra").value;
  var palabraOriginal = document.getElementById("palabraOriginal");
  palabraOriginal.innerHTML = "Palabra Original: " + palabra;
}

const reverseString = () => {
  palabra.split("").reverse().join("");
  invertida = document.getElementById("respuestaReverseString");
  invertida.innerHTML = "Palabra Invertida: " + palabra;
};
