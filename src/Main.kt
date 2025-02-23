
fun main() {

    val estudiante = Estudiante("Carlos", 21, "E123", "Ingeniería", 8.7)
    val profesor = Profesor("Paquito", 44, "P456", "Matemáticas", 20)

    println(estudiante)
    estudiante.mostrarRol()
    estudiante.mostrarCalificacion()

    println(profesor)
    profesor.mostrarRol()
    profesor.mostrarExperiencia()

}