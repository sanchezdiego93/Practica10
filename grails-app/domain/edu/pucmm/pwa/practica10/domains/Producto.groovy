package edu.pucmm.pwa.practica10.domains

class Producto {
    String nombre
    String descripcion
    double precio
    int cantidadDisponible
    List<String> fotos

    static hasMany = [carroCompra: Carro_Compra]

    static constraints = {
        nombre blank: false
        descripcion blank: true
        precio null: false
        cantidadDisponible null: false, min: 0
        fotos null: true
    }
}
