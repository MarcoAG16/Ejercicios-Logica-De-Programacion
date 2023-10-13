function jugar() {
    const numeroSecreto = Math.floor(Math.random() * 100) + 1;
    const intentos = [];
    
    while (true) {
      let intento = prompt("Adivina el número secreto (del 1 al 100):");
      if (intento === null) {
        alert("Juego cancelado.");
        break;
      }
      
      intento = Number(intento);
      
      if (isNaN(intento) || intento < 1 || intento > 100) {
        alert("Por favor, ingresa un número válido entre 1 y 100.");
      } else {
        intentos.push(intento);
        if (intento < numeroSecreto) {
          alert("El número secreto es mayor. Sigue intentando.");
        } else if (intento > numeroSecreto) {
          alert("El número secreto es menor. Sigue intentando.");
        } else {
          alert("¡Felicidades! Adivinaste el número secreto.");
          document.getElementById("resultado").textContent = "¡Felicidades! Adivinaste el número secreto.";
          document.getElementById("intentos").textContent = "Números introducidos: " + intentos.join(", ");
          break;
        }
      }
    }
  }