package application.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import application.controllers.PatientsController;

/**
 * In dieser Klasse wird festgelegt auf welcher FXML-Datei die Kontroller Klasse
 * zugreift. Die Seite mit der Verwaltung der Daten für den Patienten greift auf
 * die FXML-Datei "patients.fxml" zu. Darin ist die Patientenseite erstellt
 * worden.
 * 
 * @author Hager
 *
 */
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