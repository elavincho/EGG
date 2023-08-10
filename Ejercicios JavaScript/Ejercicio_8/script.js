var numMax = 0;
var numMin = 100000000000000;
var cantNum = 0;
var numPromedio = 0;
var promedio = 0;

while (true) {
  var num = parseInt(prompt("Ingrese un numero"));
  if (num == 0) {
    break;
  }
  if (num > numMax) {
    numMax = num;
    cantNum++;
    numPromedio += num;
  }
  if (num < numMax) {
    numMin = num;
    cantNum++;
    numPromedio += num;
  }
}
alert("Numero Maximo: " + numMax);
alert("Numero Minimo: " + numMin);
alert("Cantidad de Numeros Ingresados: " + cantNum);
alert("Promedio de Todos los Numeros: " + numPromedio);
