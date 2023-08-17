function calcularRadio(){
    const diametro = document.getElementById("diametro").value;

    var radio = (diametro / 2);

    var resuladoRadio = document.getElementById("resultadoRadio");
    resuladoRadio.innerHTML = "Radio: " + radio;

}







