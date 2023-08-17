function cargarMatriz() {
  let matriz = [[3], [6], [9], [12], [15]];
  let resultado = matriz.flat();
  let resultadoMatriz = document.getElementById("vector1");
  resultadoMatriz.innerHTML = "Vector 1: [" + resultado + " ]";

  resultado.shift();
  let resultadoMatriz2 = document.getElementById("vector2");
  resultadoMatriz2.innerHTML = "Vector 2: [" + resultado + " ]";

  resultado.push(18);
  let resultadoMatriz3 = document.getElementById("vector3");
  resultadoMatriz3.innerHTML = "Vector 3: [" + resultado + " ]";
}
