package com.example.tema2actividades.actividad17

open class Libro(
    private var titulo: String,
    private var autor: String,
    private var añoPublicacion: Int,
    private var precio: Double
) {
    // Getter y Setter para la propiedad 'titulo'
    fun getTitulo(): String {
        return titulo
    }

    fun setTitulo(nuevoTitulo: String) {
        titulo = nuevoTitulo
    }

    // Getter y Setter para la propiedad 'autor'
    fun getAutor(): String {
        return autor
    }

    fun setAutor(nuevoAutor: String) {
        autor = nuevoAutor
    }

    // Getter y Setter para la propiedad 'añoPublicacion'
    fun getAñoPublicacion(): Int {
        return añoPublicacion
    }

    fun setAñoPublicacion(nuevoAñoPublicacion: Int) {
        añoPublicacion = nuevoAñoPublicacion
    }

    // Getter y Setter para la propiedad 'precio'
    fun getPrecio(): Double {
        return precio
    }

    fun setPrecio(nuevoPrecio: Double) {
        precio = nuevoPrecio
    }

    // Función para calcular el precio con un descuento del 10%
    open fun calcularPrecioDescuento(): Double {
        return precio * 0.90
    }

    override fun toString(): String {
        return "Título: $titulo\nAutor: $autor\nAño de Publicación: $añoPublicacion\nPrecio: $precio"
    }
}