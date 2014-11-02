package edu.pucmm.pwa.practica10.domains

class Usuario {

    String nombres
    String usuario
    String clave
    /*
    * Administrador: Tiene acceso a todas las funcionalidades del sistema
    * Editor: Tiene acceso limitado a la creacion y modificacion de productos
    * Cliente: Tiene acceso a comprar
    */
    static belongsTo = [Tipo_Usuario]
    static hasMany = [carritos: Carro_Compra, tipoUsuario: Tipo_Usuario]

    static constraints = {
        nombres blank: false
        usuario unique: true, blank: false
        clave blank: false
    }
}
