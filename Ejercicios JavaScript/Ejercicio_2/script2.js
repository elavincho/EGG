function calcArea(){
    const radio = document.getElementById("radio");
    const area = Math.PI*radio.value;
    const resultado = document.getElementById("resultadoArea");
    resultado.textContent = "El area es de: " + area;
}

function calcPerimetro(){
  const radio = document.getElementById("radio");
    const perimetro = 2*Math.PI*radio.value;
    const resultado = document.getElementById("resultadoPerimetro");
    resultado.textContent = "El perimetro es: " + perimetro;
}
