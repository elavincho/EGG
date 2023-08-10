function muestraMensajeSoleado() {
    alert("El día de hoy esta Soleado!!");
}
function muestraMensajeNublado() {
    alert("El día de hoy esta Nublado!!");
}
function muestraMensajeLloviendo() {
    alert("El día de hoy esta Lloviendo!!");
}
document.getElementById("btnSoleado").onclick=muestraMensajeSoleado;
document.getElementById("btnNublado").onclick=muestraMensajeNublado;
document.getElementById("btnLloviendo").onclick=muestraMensajeLloviendo;
  