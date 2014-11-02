package edu.pucmm.pwa.practica10.domains

class Carro_Compra {

    Date fecha_Compra

    static hasOne = [usuario: Usuario]

    static belongsTo = [Producto]
    static hasMany = [productosCarro: Producto]

    static constraints = {
        productosCarro null: false
    }
}
