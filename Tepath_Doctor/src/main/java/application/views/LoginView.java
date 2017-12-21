package application.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import application.controllers.LoginController;

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
