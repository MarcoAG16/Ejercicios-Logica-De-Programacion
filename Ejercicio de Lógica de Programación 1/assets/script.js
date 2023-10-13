/*
Realizar un programa que conste de una clase llamada Alumno, que tena como atributos el nombre y la nota del alumno. Definir metodos para inicizializar sus atributos (metodo constructor), imprimirlos y mostar un mensaje con el resultado de la nota si ha aprobado o no.

    Atributos:
        -nombre
        -nota (calificacion)


    metodos:
        -constructor
        -metodo evaluacion(si aprueba o no)
        -metodo imprimirInfo(nombre y la nota)


    Logica del negocio:
        -If para evaluar la nota (si la nota es menor a 6, esta reprobado)
        -Recuperamos la informacion por medio de un prompt
        -Generamos 3 instancias para probar mi codigo (la nota sea igual a 6, la ota sea menor que 6, la nota sea mayor a 6)





*/

//Creacion de la clase (3 pasos)
class alumno {
    //1. Atributos o propiedades


    //3. Constructor donde le di identidad a mi objeto(this)
    constructor (nombre, nota){
        this.nombre = nombre;
        this.nota = nota;


    }


    //2. Metodos
    evaluacion(nota){
        //condicion para saber si esta aprobado o reprobado
        if (nota>=6){
            console.log("Aprobado");

        }else{
            console.log("Reprobado")
        }

    }

    imprimirInfo(nombre,nota){

        console.log("Nombre del aumno: ",nombre);
        console.log("Nota del alumno ", nota);
    }
}


//Instancias de alumnos
let alumno1 = new alumno ("Felipe", 3);
let alumno2 = new alumno ("Felipe", 7);
let alumno3 = new alumno ("Felipe",6);


//Invocando metodos
alumno1.evaluacion(alumno1.nota);
alumno2.evaluacion(alumno2.nota);
alumno3.evaluacion(alumno3.nota);