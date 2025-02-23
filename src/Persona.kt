
open class Persona(private val nombre: String, private val edad: Int, private val id: String) {
    init {
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío." }
        require(edad >= 0) { "La edad no puede ser negativa." }
        require(id.isNotBlank()) { "El ID no puede estar vacío." }
    }

    open fun mostrarRol() {
        println("Persona")
    }

    override fun toString(): String {
        return "Persona(nombre = $nombre, edad = $edad, id = $id)"
    }
}