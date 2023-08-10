function validarLetra(){
    const letra = document.getElementById("letraIngresada").value;
    if(
        letra == "S" ||
        letra == "s" ||
        letra == "N" ||
        letra == "n"){
            alert(`Correcto!!`);
            resultadoValidar.textContent = "Correcto!!";
        }else{
            alert(`Incorrecto!`);
            resultadoValidar.textContent = "Incorrecto!";
        }
}

    