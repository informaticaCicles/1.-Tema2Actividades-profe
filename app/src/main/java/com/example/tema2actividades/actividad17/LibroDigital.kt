package com.example.tema2actividades.actividad17

class LibroDigital(
    titulo: String,
    autor: String,
    añoPublicacion: Int,
    precio: Double,
    private var formato: String
) : Libro(titulo, autor, añoPublicacion, precio) {
    // Getter y Setter para la propiedad 'formato'
    fun getFormato(): String {
        return formato
    }

    fun setFormato(nuevoFormato: String) {
        formato = nuevoFormato
    }

    override fun toString(): String {
        return "${super.toString()}\nFormato: $formato"
    }

    override fun calcularPrecioDescuento(): Double {
        // Aplicar un descuento del 20% en los libros digitales
        return this.getPrecio() * 0.80
    }
}
