// Obtener el elemento input por su id
var input = document.getElementById("respuesta");

// Añadir un listener para el evento keypress
input.addEventListener("keypress", function(event) {
  // Si la tecla pulsada es enter
  if (event.keyCode === 13) {
    // Prevenir el comportamiento por defecto del navegador
    event.preventDefault();
    // Mostrar el mensaje con la respuesta
    alert("El día de hoy esta " + input.value);
  }
});