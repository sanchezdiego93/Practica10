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
    String tipoUsuario

    static hasMany = [carritos: Carro_Compra]

    static constraints = {
        nombres blank: false
        usuario unique: true, blank: false
        clave blank: false
    }
}
