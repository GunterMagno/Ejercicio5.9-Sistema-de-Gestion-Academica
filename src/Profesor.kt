
class Profesor(nombre: String, edad: Int, id: String, private val departamento: String, private val aniosExperiencia: Int) : Persona(nombre, edad, id) {
    override fun mostrarRol() {
        println("Soy un Profesor")
    }

    fun mostrarExperiencia() {
        println("Años de experiencia: $aniosExperiencia")
    }

    override fun toString(): String {
        return super.toString() + ", departamento = $departamento, años de experiencia = $aniosExperiencia"
    }
}