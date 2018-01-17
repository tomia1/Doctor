package application.actions;

import com.gluonhq.particle.annotation.ParticleActions;
import com.gluonhq.particle.application.ParticleApplication;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.inject.Inject;
import org.controlsfx.control.action.ActionProxy;
/**
 * In dieser Klasse wird festgelegt, was bei den einzelnen Menüauwahl angezeigt wird.
 * Wir haben in der Menüauswahl About Informationen über die Applikation definiert. In der Menüauswahl
 * Kontank haben wir Möglichkeit zur Kontaktaufnahme festgelegt. Momentan sind es nichtexistierende Webseite 
 * Mailadresse der Produkthersteller. Das Exit(schliessen der Applikation) ist in dieser Klasse auch definiert.
 * @author Hager
 *
 */
@ParticleActions
public class MenuActions {

    @Inject ParticleApplication app;

    @ActionProxy(text="Exit", accelerator="alt+F4")
    private void exit() {
        app.exit();
    }
    
    @ActionProxy(text="About")
    private void about() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("Über Applikation");
        alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/tep.JPG").toExternalForm(), 48, 48, true, true)));
        alert.setContentText("Dies ist die Desktop Applikation für die App 'Tepath'. "
        		+ "Hier kann der Arzt die Daten in der Applikation verwalten. "
        		+ "Dies wären der Behandlungsablauf der betroffenen Patienten, sowie "
        		+ "die Kontaktinformationen der beteiligten Gesundheitsfachpersonen.");
        alert.showAndWait();
    }
    
    @ActionProxy(text="Kontakt")
    private void kontakt() {
    	Alert alert1 = new Alert(AlertType.INFORMATION);
    	alert1.setTitle("Kontakt");
    	alert1.setHeaderText("Kontaktieren Sie uns");
    	alert1.setGraphic(new ImageView(new Image(MenuActions.class.getResource("").toExternalForm(), 48, 48, true, true)));
    	alert1.setContentText("Wenn Sie Fragen haben, zögern Sie nicht uns zu kontaktieren.\n"
    			+ "Unter: www.tepath-verwaltung.ch\n"
    			+ "oder\n"
    			+ "Mail an: info@tepath.verwaltung.ch");
    	alert1.showAndWait();
    	
    }
 
        
}