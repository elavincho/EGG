function edad() {
    var respuesta = prompt("Ingrese su edad");
    if(respuesta >= 18){
        alert(`Es mayor de Edad`);
    }else{
        alert(`Es menor de Edad`);
    }
};
edad();