  const reverseString = () => {
    const palabra = document.getElementById('palabra').value;
    const palabraInvertida = palabra.split('').reverse().join('');
    document.getElementById('resultado').textContent = `La palabra invertida es: ${palabraInvertida}`;
  };
    