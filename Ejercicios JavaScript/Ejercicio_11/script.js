var frase = "";

function palabraMasLarga(frase) {
    frase = document.getElementById("palabra").value;
    let palabras = frase.split(" ");
    let palabraLarga = "";
    for (let i = 0; i < palabras.length; i++) {
      if (palabras[i].length > palabraLarga.length) {
        palabraLarga = palabras[i];
      }
    }
    document.getElementById("resultado").textContent = `Resultado: ${palabraLarga}`;
  }
  
  
  

