
function calcularFibonacci() {
    let numero = prompt("Por favor, ingresa un número para calcular la serie de Fibonacci:");

    // Verificar si el valor ingresado es un número válido.
    if (!isNaN(numero)) {
      numero = Number(numero); // Convertir el valor a un número.

      if (numero < 0) {
        console.log("El número debe ser mayor o igual a 0.");
      } else {
        let serie = [];
        if (numero >= 1) {
          serie.push(0);
        }
        if (numero >= 2) {
          serie.push(1);
        }
        for (let i = 2; i < numero; i++) {
          let siguiente = serie[i - 1] + serie[i - 2];
          serie.push(siguiente);
        }
        console.log("Serie de Fibonacci:", serie.join(", "));

        // Mostrar la serie en el DOM (en un elemento con el id "resultado").
        document.getElementById("resultado").textContent = "Serie de Fibonacci: " + serie.join(", ");
      }
    } else {
      console.log("Por favor, ingresa un número válido.");
    }
  }

  calcularFibonacci();