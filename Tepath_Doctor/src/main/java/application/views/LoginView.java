package application.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import application.controllers.LoginController;
/**
 * In dieser Klasse wird festgelegt woher die Kontroller Klasse ihre Informationen bekommt.
 * Hier wird die FXML-Datei festgelegt in der die Loginseite erstellt wurde.
 * Die FXML-Date für das Login heisst "login.fxml".
 * @author Hager
 *
 */
@ParticleView(name = "login", isDefault = true)
public class LoginView extends FXMLView {
    
    public LoginView() {
        super(LoginView.class.getResource("login.fxml"));
    }
    
    @Override
    public void start() {
        ((LoginController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((LoginController) getController()).dispose();
    }
    
}
