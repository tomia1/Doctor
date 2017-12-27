package application;

import com.gluonhq.particle.application.ParticleApplication;
import javafx.scene.Scene;
import static org.controlsfx.control.action.ActionMap.actions;

public class MyApplication extends ParticleApplication {

    public MyApplication() {
        super("Tepath verwaltung");
    }

    @Override
    public void postInit(Scene scene) {
        scene.getStylesheets().add(MyApplication.class.getResource("style.css").toExternalForm());

        setTitle("Tepath verwaltung");

        getParticle().buildMenu("File -> [exit]");
        
        getParticle().getToolBarActions().addAll(actions("---", "about", "kontakt"));
    }
}