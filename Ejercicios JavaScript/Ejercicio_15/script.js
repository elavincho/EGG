
var circulo = new Object();

var radio;

circulo.radio;



circulo.area;

circulo.perimetro;

function area(){
   
    radio = document.getElementById("radio").value;
    circulo.radio = radio;
    console.log(circulo.radio);
    var area = Math.PI * radio ** 2;
    circulo.area = area;
    console.log(circulo.area);
    var resultadoArea = document.getElementById("resultadoArea");
    resultadoArea.innerHTML = "Area: " + area;


} 

function Perimetro(){
   
    //const radio = document.getElementById("radio").value;
    var perimetro = 2 * Math.PI * radio;
    circulo.perimetro = perimetro;
    console.log(circulo.perimetro);
    var resuladoPerimetro = document.getElementById("resultadoPerimetro");
    resuladoPerimetro.innerHTML = "Perimetro: " + perimetro;
}

console.log(circulo.radio, circulo.perimetro, circulo.area);


