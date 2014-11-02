package edu.pucmm.pwa.practica10.controller

class AppController {

    def index() {
        println("Redireccionando a Vaadin..")
        redirect(uri: "/vd");
    }
}
