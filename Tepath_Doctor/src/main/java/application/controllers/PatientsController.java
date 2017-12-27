package application.controllers;

import java.util.ResourceBundle;

import javax.inject.Inject;

import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class PatientsController {

    @Inject ParticleApplication app;
    
    @Inject private ViewManager viewManager;


    @FXML
    private AnchorPane patients;

    @FXML
    private Label PatientendatenL;

    @FXML
    private Label patientL;

    @FXML
    private ChoiceBox<Object> patientenwahl;

    @FXML
    private Label benutzerL;

    @FXML
    private TextField benutzerText;

    @FXML
    private Label passwortL;

    @FXML
    private TextField passwortText;

    @FXML
    private Label KontakteL;

    @FXML
    private Label hausarztL;

    @FXML
    private ChoiceBox<Object> hausarztwahl;

    @FXML
    private Label spitalL;

    @FXML
    private ChoiceBox<Object> spitalwahl;

    @FXML
    private Label spezialistL;

    @FXML
    private ChoiceBox<Object> spezialistwahl;

    @FXML
    private Label apothekeL;

    @FXML
    private ChoiceBox<Object> apothekenwahl;

    @FXML
    private Label rehaL;

    @FXML
    private ChoiceBox<Object> rehawahl;

    @FXML
    private Label AblaufL;

    @FXML
    private Label terminL;
    
    @FXML
    private ChoiceBox<Object> terminwahl;
    
    @FXML
    private Label datumL;

    @FXML
    private DatePicker datumwahl;

    @FXML
    private Label uhrzeitL;

    @FXML
    private ChoiceBox<Object> UhrzeitStunden;

    @FXML
    private Label zeitseperator;

    @FXML
    private ChoiceBox<Object> UhrzeitMinuten;

    @FXML
    private Label ortL;

    @FXML
    private ChoiceBox<Object> ortwahl;

    @FXML
    private Button addTermin;

    @FXML
    private Button speichern;

    @FXML
    private Button reset;

    @FXML
    void onActionAdd(ActionEvent event) {

    }

    @FXML
    void onActionReset(ActionEvent event) {
    	
    }

    @FXML
    void onActionSave(ActionEvent event) {

    }

    
    
    @FXML
    private ResourceBundle resources;
    
    private Action actionHome;
    
    public void initialize() {
        ActionMap.register(this);
        actionHome =  ActionMap.action("goHome");
        
        //choiceBox pateintenwahl Elemente hinzufügen
        ((ChoiceBox<Object>)patientenwahl).getItems().add("Elisabeth Brönimann");
        ((ChoiceBox<Object>)patientenwahl).getItems().add("Susanne Meier");
        ((ChoiceBox<Object>)patientenwahl).getItems().add("Margrit Bauer");
        
        //choiceBox hausarzt Elemente hinzufügen
        ((ChoiceBox<Object>)hausarztwahl).getItems().add("Dr. Wenger");
        ((ChoiceBox<Object>)hausarztwahl).getItems().add("Dr. Keller");
        
        //choiceBox spital Elemente hinzufügen
        ((ChoiceBox<Object>)spitalwahl).getItems().add("SZB - Spitalzentrum Biel");
        ((ChoiceBox<Object>)spitalwahl).getItems().add("USZ - Universitätsspital Zürich");
        ((ChoiceBox<Object>)spitalwahl).getItems().add("Inselspital Bern");
        
        //choiceBox apotheke Elemente hinzufügen
        ((ChoiceBox<Object>)apothekenwahl).getItems().add("Apotheke Sonnenberg");
        ((ChoiceBox<Object>)apothekenwahl).getItems().add("Apotheke Müller");
        ((ChoiceBox<Object>)apothekenwahl).getItems().add("Apotheke zum Kreuz");
        
        //choiceBox reha Elemenete hinzufügen
        ((ChoiceBox<Object>)rehawahl).getItems().add("Rehaklinik Linde");
        ((ChoiceBox<Object>)rehawahl).getItems().add("Reha Rheinfeld");
        ((ChoiceBox<Object>)rehawahl).getItems().add("Rehaklinik Hasliberg");
        
        //choiceBox spezialist Elemente hinzufügen
        ((ChoiceBox<Object>)spezialistwahl).getItems().add("Dr. Knochenbrecher");
        ((ChoiceBox<Object>)spezialistwahl).getItems().add("Dr. Müller");
        ((ChoiceBox<Object>)spezialistwahl).getItems().add("Dr. Profi");
        
        //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl).getItems().add("Hausarztbesuch");
        ((ChoiceBox<Object>)terminwahl).getItems().add("Spezialistenbesuch");
        ((ChoiceBox<Object>)terminwahl).getItems().add("Amulante Untersuchung Spital");
        ((ChoiceBox<Object>)terminwahl).getItems().add("Spitalaufnahme");
        ((ChoiceBox<Object>)terminwahl).getItems().add("Stationäte Untersuchung Spital");
        ((ChoiceBox<Object>)terminwahl).getItems().add("Röntgenaufnahme");
        ((ChoiceBox<Object>)terminwahl).getItems().add("Blutuntersuchung");
        ((ChoiceBox<Object>)terminwahl).getItems().add("OP-Vorbereitung");
        ((ChoiceBox<Object>)terminwahl).getItems().add("OP");
        ((ChoiceBox<Object>)terminwahl).getItems().add("OP-Nachbehandlung");
        ((ChoiceBox<Object>)terminwahl).getItems().add("Nachuntersuchung");
        ((ChoiceBox<Object>)terminwahl).getItems().add("Spitalaustritt");
        ((ChoiceBox<Object>)terminwahl).getItems().add("Rehaeintritt");
        ((ChoiceBox<Object>)terminwahl).getItems().add("Rehaustritt");
        ((ChoiceBox<Object>)terminwahl).getItems().add("Behandlungsende");
        
        //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
        //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
        //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
        
        
    }
    
    public void postInit() {
        app.getParticle().getToolBarActions().add(0, actionHome);
    }
    
    public void dispose() {
        app.getParticle().getToolBarActions().remove(actionHome);
    }
    
    @ActionProxy(text = "Abmelden")
    private void goHome() {
        viewManager.switchView("login");
    }
    
}
