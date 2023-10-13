function calcularFactorial() {
    let numero = prompt("Por favor, ingresa un número para calcular su factorial:");
    
    // Verificar si el valor ingresado es un número válido.
    if (!isNaN(numero)) {
      numero = Number(numero); // Convertir el valor a un número.

      if (numero < 0) {
        console.log("El factorial no está definido para números negativos.");
      } else if (numero === 0) {
        console.log(`El factorial de ${numero} es 1.`);
      } else {
        let factorial = 1;
        for (let i = 1; i <= numero; i++) {
          factorial *= i;
        }
        console.log(`El factorial de ${numero} es ${factorial}.`);
      }
    } else {
      console.log("Por favor, ingresa un número válido.");
    }
  }

  calcularFactorial();