/*Metodo 1 por alerta*/
function validar(){
    var caracter = prompt(`Ingrese un Caracter`);
    if(
        caracter == "S" ||
        caracter == "s" ||
        caracter == "N" ||
        caracter == "n"){
            alert(`Correcto!!`);
        }else{
            alert(`Incorrecto!`);
        }
};
validar();

/*Metodo 2 por consola*/
function validarLetra(){
    var letra = prompt(`Ingrese una letra`);
    while(letra !== "s" && letra !== "S" && letra !== "n"&& letra !== "N" ){
        console.log("Incorrecto!");
        letra = prompt(`Ingrese la letra nuevamente`);
        
    };
    console.log("Correcto!!");
};
validarLetra();

/*Metodo 3 por consola if ternario*/

function validarLetraTernario(){
    var prueba = prompt("Ingrese la letra S/N");
    var final = (prueba == "s") ? "Ingreso S" : "Ingreso N";
    alert(final);
};
validarLetraTernario();