function validarEdad() {
  
  const edad = document.getElementById("edadIngresada").value;
  if (edad >= 18) {
    var resultado = document.getElementById("resultadoEdad");
    resultadoValidar.textContent = "Es mayor de Edad ";
  } else {
    resultado = document.getElementById("resultadoValidar");
    resultado.textContent = "Es menor de Edad ";
  }


}

  