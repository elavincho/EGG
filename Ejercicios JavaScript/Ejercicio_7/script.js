var limite = 0;

function agreLimite() {

    limite = parseInt(document.getElementById("limite").value);
    let valorLimite = document.getElementById("valorLimite");
    valorLimite.innerHTML = "Limite: " + limite;
}

var suma = 0;

function agregarNumero(){
    if (suma < limite){
        var sumando = parseInt(document.getElementById("sumando").value);
        suma = suma + sumando;
        let valorSuma = document.getElementById("valorSuma");
        valorSuma.innerHTML = suma;
        document.getElementById("sumando").value = "";
    }
    if(suma >= limite){
        alert("El numero ingresado es mayor o igual al limite!");
    }
}


