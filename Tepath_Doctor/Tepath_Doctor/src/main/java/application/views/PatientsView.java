package application.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import application.controllers.PatientsController;

@ParticleView(name = "patients", isDefault = false)
public class PatientsView extends FXMLView {
    
    public PatientsView() {
        super(PatientsView.class.getResource("patients.fxml"));
    }
    
    @Override
    public void start() {
        ((PatientsController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((PatientsController) getController()).dispose();
    }
    
}