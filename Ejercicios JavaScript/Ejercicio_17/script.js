function cargarVector(){
    var vector1 = [];

  for (let i = 0; i < 5; i++) {
    vector1.push(Math.floor(Math.random() * 50) + 1);
  }
  var resultadoVector1 = document.getElementById("vector1");
  resultadoVector1.innerHTML = "Vector 1: [" + vector1 + " ]";

  for (let i = 0; i < 2; i++) {
    vector1.pop();
  }
  var resultadoVector2 = document.getElementById("vector2");
  resultadoVector2.innerHTML = "Vector 2: [" + vector1 + " ]";
}