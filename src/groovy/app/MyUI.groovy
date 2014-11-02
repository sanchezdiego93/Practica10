package app

import com.vaadin.annotations.Theme
import com.vaadin.grails.Grails
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Alignment
import com.vaadin.ui.Button
import com.vaadin.ui.Component
import com.vaadin.ui.FormLayout
import com.vaadin.ui.HorizontalLayout
import com.vaadin.ui.Label
import com.vaadin.ui.Panel
import com.vaadin.ui.PasswordField
import com.vaadin.ui.TextField
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout

import javax.swing.text.rtf.Constants

/**
 * Created by Jordani on 11/2/2014.
 */
@Theme("valo")
class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout layout = new VerticalLayout();
        HorizontalLayout hlBotones = new HorizontalLayout();

        Button btnLogin = new Button("Login");
        Button btnCancelar = new Button("Cancelar");
        TextField txtUsuario = new TextField("Usuario: ");
        TextField txtClave = new TextField("Clave");

        txtUsuario.setRequired(true);
        txtClave.setRequired(true);

        final Panel loginPanel = new Panel("Login Carrito");
        layout.addComponent(loginPanel);
        layout.setSizeFull();
        layout.setComponentAlignment(loginPanel, Alignment.MIDDLE_CENTER);
        loginPanel.setWidth("300px");

        final FormLayout loginForm = new FormLayout();
        loginForm.setMargin(true);
        loginForm.setSpacing(true);
        loginForm.setStyleName("loginForm");
        loginForm.addComponent(txtUsuario);
        loginForm.addComponent(txtClave);

        hlBotones.addComponent(btnLogin);
        hlBotones.setSizeFull()
        hlBotones.setSpacing(true)
        hlBotones.addComponent(btnCancelar);

        loginForm.addComponent(hlBotones);

        loginPanel.setContent(loginForm);

        setContent(layout);
    }
}
