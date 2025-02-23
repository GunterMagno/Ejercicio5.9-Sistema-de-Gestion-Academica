
class Estudiante(nombre: String, edad: Int, id: String, private val curso: String, private val calificacionPromedio: Double) : Persona(nombre, edad, id) {
    override fun mostrarRol() {
        println("Soy un Estudiante")
    }

    fun mostrarCalificacion() {
        println("Calificación promedio: $calificacionPromedio")
    }

    override fun toString(): String {
        return super.toString() + ", curso = $curso, calificación promedio = $calificacionPromedio"
    }
}