package app.Ventanas

import com.vaadin.annotations.Theme
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Button
import com.vaadin.ui.Component
import com.vaadin.ui.HorizontalLayout
import com.vaadin.ui.Label
import com.vaadin.ui.PasswordField
import com.vaadin.ui.TextField
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import com.vaadin.ui.Window

/**
 * Created by Jordani on 11/2/2014.
 */
@Theme("valo")
class Login extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {

        VerticalLayout mainLayout
        HorizontalLayout hlCamposUsuarios, h1Botones

        Label lLogin
        TextField txtUsuario
        PasswordField pwfClave

        Button btnLogin, btnCancelar

        mainLayout = new VerticalLayout()
        mainLayout.setSpacing(true)
        mainLayout.setMargin(true)
        mainLayout.addStyleName("")

        addStyleName("Login Carrito")

        lLogin = new Label("Login")
        lLogin.setSizeFull()
        lLogin.addStyleName("h2")

        hlCamposUsuarios = new HorizontalLayout()
        hlCamposUsuarios.setSizeFull()
        hlCamposUsuarios.setSpacing()

        txtUsuario = new TextField("Usuario: ")
        txtUsuario.focus()
        pwfClave = new PasswordField("Contraseña: ")

        setContent(mainLayout)

        hlCamposUsuarios.addComponent(txtUsuario)
        hlCamposUsuarios.addComponent(pwfClave)

        mainLayout.addComponent(hlCamposUsuarios)
    }
}
