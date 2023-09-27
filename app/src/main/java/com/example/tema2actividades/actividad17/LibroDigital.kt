package com.example.tema2actividades.actividad17

class LibroDigital(
    titulo: String,
    autor: String,
    añoPublicacion: Int,
    precio: Double,
    private var formato: String
) : Libro(titulo, autor, añoPublicacion, precio) {
    // Getter y Setter para la propiedad 'formato'


    override fun toString(): String {
        return "${super.toString()}\nFormato: $formato"
    }

    override fun calcularPrecioDescuento(): Double {
        // Aplicar un descuento del 20% en los libros digitales
        return this.precio * 0.80
    }
}
