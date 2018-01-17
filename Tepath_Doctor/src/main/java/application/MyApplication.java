package application;

import static org.controlsfx.control.action.ActionMap.actions;

import com.gluonhq.particle.application.ParticleApplication;

import javafx.scene.Scene;
/**
 * Die Klasse MyApplikation stellt den Grundgerüst der Applikation dar. Darin werden auch die Menüinhalte 
 * festgelegt. Als Auswahlmöglichkeiten haben wir File, About und Kontakt definiert. Bei File wird weiter die Auswahl 
 * "exit" eingeblendet. Damit schliesst man die Applikation. Welche Informationen in der Auswahl about und kontakt
 * erscheinen sind in der Klasse MenuActions definiert.
 * @author Hager
 *
 */
public class MyApplication extends ParticleApplication {

    public MyApplication() {
        super("Tepath verwaltung");
    }

    @Override
    public void postInit(Scene scene) {
        scene.getStylesheets().add(MyApplication.class.getResource("style.css").toExternalForm());
        setTitle("Tepath verwaltung");

        getParticle().buildMenu("File -> [exit]");
        
        getParticle().getToolBarActions().addAll(actions("about", "kontakt"));
    }
}