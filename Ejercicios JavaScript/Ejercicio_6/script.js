function verificar() {
  const num = document.getElementById("numero").value;

  if (num % 2 == 0 && num != 0) {
    resultadoVerificar.textContent = "Es un numero Par";
  } else if (num % 2 != 0) {
    resultadoVerificar.textContent = "Es un numero Impar";
  } else if (num == 0) {
    resultadoVerificar.textContent = "El numero no es Par ni Impar";
  }
}
