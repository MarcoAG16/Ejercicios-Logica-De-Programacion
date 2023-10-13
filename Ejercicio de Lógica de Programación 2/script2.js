function convertirTemperatura() {
    // Solicitar al usuario la temperatura en grados Celsius
    var celsius = parseFloat(prompt("Ingrese la temperatura en grados Celsius:"));

    // Verificar si la entrada es un número
    if (isNaN(celsius)) {
        console.log("Error: Ingrese un valor numérico válido.");
        return;
    }

    // Convertir a grados Fahrenheit
    var fahrenheit = (celsius * 9/5) + 32;

    // Convertir a grados Kelvin
    var kelvin = celsius + 273.15;

    // Mostrar los resultados en la consola
    console.log("Grados Fahrenheit: " + fahrenheit.toFixed(2));
    console.log("Grados Kelvin: " + kelvin.toFixed(2));

    var resultadoDiv = document.createElement('div');
    resultadoDiv.innerHTML = "Grados Fahrenheit: " + fahrenheit.toFixed(2) + "<br>Grados Kelvin: " + kelvin.toFixed(2);
    document.body.appendChild(resultadoDiv);
}

// Llama a la función para realizar la conversión
convertirTemperatura();