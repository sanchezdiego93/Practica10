package edu.pucmm.pwa.practica10.domains

class Tipo_Usuario {

    String nombre
    boolean esAdmin
    boolean esEditor

    static hasMany = [listaUsuarios: Usuario]

    static constraints = {
        nombre blank: false, unique: true
    }
}
