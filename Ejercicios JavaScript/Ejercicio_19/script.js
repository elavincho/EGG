function cargarVector() {
  let vectorA = [];
  let vectorB = [];

  for (let i = 0; i < 50; i++) {
    vectorA.push(Math.floor(Math.random() * 100) + 1);
  }
  //Ordenamos el vector
  vectorA.sort(function (a, b) {
    return a - b;
  });

  var resultadoVectorA = document.getElementById("vectorA");
  resultadoVectorA.innerHTML = "Vector A: [" + vectorA + " ]";

  vectorB = vectorA.slice(0, 10);
  for (let i = 0; i < 10; i++) {
    vectorB.push(0, 5);
  }
  var resultadoVectorB = document.getElementById("vectorB");
  resultadoVectorB.innerHTML = "Vector A: [" + vectorB + " ]";
}
