function calcular() {
  const num1 = document.getElementById("primerNumero").value;
  const num2 = document.getElementById("segundoNumero").value;
  const tipoOperacion = document.getElementById("operacion").value;
  var resultado;
  var defaul = "Ingrese una operacion Valida";
  switch (tipoOperacion.toLowerCase()) {
    case "s":
      resultado = parseInt(num1) + parseInt(num2);
      resultadoCalculo.textContent = resultado;
      break;
    case "r":
      resultado = num1 - num2;
      resultadoCalculo.textContent = resultado;
      break;
    case "m":
      resultado = num1 * num2;
      resultadoCalculo.textContent = resultado;
      break;
    case "d":
      resultado = num1 / num2;
      resultadoCalculo.textContent = resultado;
      break;

    default:
      resultadoCalculo.textContent = "Ingrese una Operación Valida!";
      break;
  }
}
