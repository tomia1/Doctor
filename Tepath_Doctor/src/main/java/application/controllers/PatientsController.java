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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;


/**
 * Die Klasse PatientController beinhaltet alle Informationen die vom Arzt erfasst und gespeichert werden.
 * Der Arzt Verwaltet hier die Termine der Patienten, die Aerzte und Institutionen die der Patient besucht
 * und die Login Daten für den Patienten. Auf dieser Oberflaeche werden alle Daten eingetragen, welche der 
 * Patient anschliessend auf seiner Mobilen App zu sehen bekommt.
 * Die PatientController ist die Controller-Klasse für die FXML-Datei patient.fxml. 
 * @author Hager
 *
 */

public class PatientsController {

    @Inject ParticleApplication app;
    
    @Inject private ViewManager viewManager;

/**
 * Hier werden die Felder definiert welche in der FXML-Datei erstellt wurden.
 */
    
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
    private Button speichernDaten;

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
    private Button speichernKontakte;

    @FXML
    private Label AblaufL;

    @FXML
    private Label terminL;
    
    @FXML
    private Label terminL1;
    
    @FXML
    private Label terminL2;
    
    @FXML
    private Label terminL3;
    
    @FXML
    private Label terminL4;
    
    @FXML
    private Label terminL5;
    
    @FXML
    private Label terminL6;
    
    @FXML
    private Label terminL7;
    
    @FXML
    private Label terminL8;
    
    @FXML
    private Label terminL9;
    
    @FXML
    private Label terminL10;
    
    @FXML
    private Label terminL11;
    
    @FXML
    private Label terminL12;
    
    @FXML
    private Label terminL13;
    
    @FXML
    private Label terminL14;
    
    @FXML
    private ChoiceBox<Object> terminwahl;
    
    @FXML
    private ChoiceBox<Object> terminwahl1;
    
    @FXML
    private ChoiceBox<Object> terminwahl2;
    
    @FXML
    private ChoiceBox<Object> terminwahl3;
    
    @FXML
    private ChoiceBox<Object> terminwahl4;
    
    @FXML
    private ChoiceBox<Object> terminwahl5;
    
    @FXML
    private ChoiceBox<Object> terminwahl6;
    
    @FXML
    private ChoiceBox<Object> terminwahl7;
    
    @FXML
    private ChoiceBox<Object> terminwahl8;
    
    @FXML
    private ChoiceBox<Object> terminwahl9;
    
    @FXML
    private ChoiceBox<Object> terminwahl10;
    
    @FXML
    private ChoiceBox<Object> terminwahl11;
    
    @FXML
    private ChoiceBox<Object> terminwahl12;
    
    @FXML
    private ChoiceBox<Object> terminwahl13;
    
    @FXML
    private ChoiceBox<Object> terminwahl14;
    
    @FXML
    private Label datumL;
    
    @FXML
    private Label datumL1;
    
    @FXML
    private Label datumL2;
    
    @FXML
    private Label datumL3;
    
    @FXML
    private Label datumL4;
    
    @FXML
    private Label datumL5;
    
    @FXML
    private Label datumL6;
    
    @FXML
    private Label datumL7;
    
    @FXML
    private Label datumL8;
    
    @FXML
    private Label datumL9;
    
    @FXML
    private Label datumL10;
    
    @FXML
    private Label datumL11;
    
    @FXML
    private Label datumL12;
    
    @FXML
    private Label datumL13;
    
    @FXML
    private Label datumL14;

    @FXML
    private DatePicker datumwahl;
    
    @FXML
    private DatePicker datumwahl1;
    
    @FXML
    private DatePicker datumwahl2;
    
    @FXML
    private DatePicker datumwahl3;
    
    @FXML
    private DatePicker datumwahl4;
    
    @FXML
    private DatePicker datumwahl5;
    
    @FXML
    private DatePicker datumwahl6;
    
    @FXML
    private DatePicker datumwahl7;
    
    @FXML
    private DatePicker datumwahl8;
    
    @FXML
    private DatePicker datumwahl9;
    
    @FXML
    private DatePicker datumwahl10;
    
    @FXML
    private DatePicker datumwahl11;
    
    @FXML
    private DatePicker datumwahl12;
    
    @FXML
    private DatePicker datumwahl13;
    
    @FXML
    private DatePicker datumwahl14;

    @FXML
    private Label uhrzeitL;
    
    @FXML
    private Label uhrzeitL1;
    
    @FXML
    private Label uhrzeitL2;
    
    @FXML
    private Label uhrzeitL3;
    
    @FXML
    private Label uhrzeitL4;
    
    @FXML
    private Label uhrzeitL5;
    
    @FXML
    private Label uhrzeitL6;
    
    @FXML
    private Label uhrzeitL7;
    
    @FXML
    private Label uhrzeitL8;
    
    @FXML
    private Label uhrzeitL9;
    
    @FXML
    private Label uhrzeitL10;
    
    @FXML
    private Label uhrzeitL11;
    
    @FXML
    private Label uhrzeitL12;
    
    @FXML
    private Label uhrzeitL13;
    
    @FXML
    private Label uhrzeitL14;

    @FXML
    private ChoiceBox<Object> UhrzeitStunden;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStunden1;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStunden2;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStunden3;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStunden4;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStunden5;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStunden6;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStunden7;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStunden8;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStunden9;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStunden10;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStunden11;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStunden12;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStunden13;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStunden14;

    @FXML
    private Label zeitseperator;
    
    @FXML
    private Label zeitseperator1;
    
    @FXML
    private Label zeitseperator2;
    
    @FXML
    private Label zeitseperator3;
    
    @FXML
    private Label zeitseperator4;
    
    @FXML
    private Label zeitseperator5;
    
    @FXML
    private Label zeitseperator6;
    
    @FXML
    private Label zeitseperator7;
    
    @FXML
    private Label zeitseperator8;
    
    @FXML
    private Label zeitseperator9;
    
    @FXML
    private Label zeitseperator10;
    
    @FXML
    private Label zeitseperator11;
    
    @FXML
    private Label zeitseperator12;
    
    @FXML
    private Label zeitseperator13;
    
    @FXML
    private Label zeitseperator14;

    @FXML
    private ChoiceBox<Object> UhrzeitMinuten;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinuten1;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinuten2;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinuten3;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinuten4;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinuten5;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinuten6;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinuten7;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinuten8;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinuten9;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinuten10;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinuten11;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinuten12;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinuten13;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinuten14;

    @FXML
    private Label ortL;
    
    @FXML
    private Label ortL1;
    
    @FXML
    private Label ortL2;
    
    @FXML
    private Label ortL3;
    
    @FXML
    private Label ortL4;
    
    @FXML
    private Label ortL5;
    
    @FXML
    private Label ortL6;
    
    @FXML
    private Label ortL7;
    
    @FXML
    private Label ortL8;
    
    @FXML
    private Label ortL9;
    
    @FXML
    private Label ortL10;
    
    @FXML
    private Label ortL11;
    
    @FXML
    private Label ortL12;
    
    @FXML
    private Label ortL13;
    
    @FXML
    private Label ortL14;

    @FXML
    private ChoiceBox<Object> ortwahl;
    
    @FXML
    private ChoiceBox<Object> ortwahl1;
    
    @FXML
    private ChoiceBox<Object> ortwahl2;
    
    @FXML
    private ChoiceBox<Object> ortwahl3;
    
    @FXML
    private ChoiceBox<Object> ortwahl4;
    
    @FXML
    private ChoiceBox<Object> ortwahl5;
    
    @FXML
    private ChoiceBox<Object> ortwahl6;
    
    @FXML
    private ChoiceBox<Object> ortwahl7;
    
    @FXML
    private ChoiceBox<Object> ortwahl8;
    
    @FXML
    private ChoiceBox<Object> ortwahl9;
    
    @FXML
    private ChoiceBox<Object> ortwahl10;
    
    @FXML
    private ChoiceBox<Object> ortwahl11;
    
    @FXML
    private ChoiceBox<Object> ortwahl12;
    
    @FXML
    private ChoiceBox<Object> ortwahl13;
    
    @FXML
    private ChoiceBox<Object> ortwahl14;
    
    @FXML
    private ComboBox<Object> statusBox;
    
    @FXML
    private ComboBox<Object> statusBox1;
    
    @FXML
    private ComboBox<Object> statusBox2;
    
    @FXML
    private ComboBox<Object> statusBox3;
    
    @FXML
    private ComboBox<Object> statusBox4;
    
    @FXML
    private ComboBox<Object> statusBox5;
    
    @FXML
    private ComboBox<Object> statusBox6;
    
    @FXML
    private ComboBox<Object> statusBox7;
    
    @FXML
    private ComboBox<Object> statusBox8;
    
    @FXML
    private ComboBox<Object> statusBox9;
    
    @FXML
    private ComboBox<Object> statusBox10;
    
    @FXML
    private ComboBox<Object> statusBox11;
    
    @FXML
    private ComboBox<Object> statusBox12;
    
    @FXML
    private ComboBox<Object> statusBox13;
    
    @FXML
    private ComboBox<Object> statusBox14;

    @FXML
    private Button speichern;

    @FXML
    private Button change;
    
    @FXML
    private HBox terminBox1;
    
    @FXML
    private HBox terminBox11;
    
    @FXML
    private HBox terminBox12;
    @FXML
    private HBox terminBox13;
    
    @FXML
    private HBox terminBox14;
    
    @FXML
    private HBox terminBox15;
    
    @FXML
    private HBox terminBox16;
    
    @FXML
    private HBox terminBox17;
    
    @FXML
    private HBox terminBox18;
    
    @FXML
    private HBox terminBox19;
    
    @FXML
    private HBox terminBox110;
    
    @FXML
    private HBox terminBox111;
    
    @FXML
    private HBox terminBox112;
    
    @FXML
    private HBox terminBox113;
    
    @FXML
    private HBox terminBox114;
    
    @FXML
    private HBox terminBox2;
    
    @FXML
    private HBox terminBox21;
    
    @FXML
    private HBox terminBox22;
    
    @FXML
    private HBox terminBox23;
    
    @FXML
    private HBox terminBox24;
    
    @FXML
    private HBox terminBox25;
    
    @FXML
    private HBox terminBox26;
    
    @FXML
    private HBox terminBox27;
    
    @FXML
    private HBox terminBox28;
    
    @FXML
    private HBox terminBox29;
    
    @FXML
    private HBox terminBox210;
    
    @FXML
    private HBox terminBox211;
    
    @FXML
    private HBox terminBox212;
    
    @FXML
    private HBox terminBox213;
    
    @FXML
    private HBox terminBox214;
    
    @FXML
    private HBox terminBox3;
    
    
    @FXML
    void onActionSaveDaten(ActionEvent event) {
    	speichernDaten.onActionProperty();
    }
    
    @FXML
    void onActionSaveKontakte(ActionEvent event) {
    	speichernKontakte.onActionProperty();
    }
    
    //Die Felder werden aktiviert wenn sie bearbeitet werden sollen
    @FXML
    void onActionChange(ActionEvent event) {
    	change.setOnAction(e -> patientenwahl.setDisable(false));
    	change.setOnAction(e -> hausarztwahl.setDisable(false));
    	change.setOnAction(e -> spitalwahl.setDisable(false));
    	change.setOnAction(e -> rehawahl.setDisable(false));
    	change.setOnAction(e -> apothekenwahl.setDisable(false));
    	change.setOnAction(e -> spezialistwahl.setDisable(false));
    	change.setOnAction(e -> terminwahl.setDisable(false));
    	change.setOnAction(e -> UhrzeitStunden.setDisable(false));
    	change.setOnAction(e -> UhrzeitMinuten.setDisable(false));
    	change.setOnAction(e -> ortwahl.setDisable(false));
    	change.setOnAction(e -> datumwahl.setDisable(false));
    }

    
/**Die Felder werder bei speicherung der Informationen deaktiviert und koennen nicht bearbeitet werden.
 * Die Informationen die hier eingegeben worden sind sollen unter dem Patienten abgespeichert werden.
 * @param event speichern der Informationen
 */
    
    @FXML
    void onActionSave(ActionEvent event) {
    	speichern.setOnAction(e -> patientenwahl.setDisable(true));
    	speichern.setOnAction(e -> hausarztwahl.setDisable(true));
    	speichern.setOnAction(e -> spitalwahl.setDisable(true));
    	speichern.setOnAction(e -> rehawahl.setDisable(true));
    	speichern.setOnAction(e -> apothekenwahl.setDisable(true));
    	speichern.setOnAction(e -> spezialistwahl.setDisable(true));
    	speichern.setOnAction(e -> terminwahl.setDisable(true));
    	speichern.setOnAction(e -> UhrzeitStunden.setDisable(true));
    	speichern.setOnAction(e -> UhrzeitMinuten.setDisable(true));
    	speichern.setOnAction(e -> ortwahl.setDisable(true));
    	speichern.setOnAction(e -> datumwahl.setDisable(true));
    }

    @FXML
    private ResourceBundle resources;
    
    private Action actionHome;
    
    public void initialize() {
        ActionMap.register(this);
        actionHome =  ActionMap.action("goHome");
        
        /**
         * Die einzelnen ChoiceBoxen werden hier mit Informationen/Auswahlmoeglichkeiten befüllt.
         */
        
        //choiceBox pateintenwahl Elemente hinzufügen
        ((ChoiceBox<Object>)patientenwahl).getItems().addAll("", "Elisabeth Brönimann",
        		"Susanne Meier", "Margrit Bauer");
       
        //choiceBox hausarzt Elemente hinzufügen
        ((ChoiceBox<Object>)hausarztwahl).getItems().addAll("", "Dr. Wenger", "Dr. Keller");
        
        //choiceBox spital Elemente hinzufügen
        ((ChoiceBox<Object>)spitalwahl).getItems().addAll("", "SZB - Spitalzentrum Biel", 
        		"USZ - Universitätsspital Zürich", "Inselspital Bern");
        
        //choiceBox apotheke Elemente hinzufügen
        ((ChoiceBox<Object>)apothekenwahl).getItems().addAll("", "Apotheke Sonnenberg",
        		"Apotheke Müller", "Apotheke zum Kreuz");
        
        //choiceBox reha Elemenete hinzufügen
        ((ChoiceBox<Object>)rehawahl).getItems().addAll("", "Rehaklinik Linde", 
        		"Reha Rheinfeld", "Rehaklinik Hasliberg");
        
        //choiceBox spezialist Elemente hinzufügen
        ((ChoiceBox<Object>)spezialistwahl).getItems().addAll("", "Dr. Knochenbrecher",
        		"Dr. Müller", "Dr. Profi");
        
        /**
         * Bei den Terminen sind mehrere Termine möglich. Hierfür wurde in der FXML-Datei ein "Accordion" erstellt.
         * Die einzelnen Termine können so ein-/ausgeblendet werden. Bei den Terminen muss festgelegt werden: Terminart, 
         * Terminort, Datum des Termins, Zeit des Termins und Status des Termins. 
         * Jeder einzelne Termin ist einzeln aufklappbar.
         */
        
        //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
      //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl1).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
      //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl2).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
      //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl3).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
      //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl4).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
      //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl5).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
      //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl6).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
      //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl7).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
      //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl8).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
      //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl9).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
      //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl10).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
      //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl11).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
      //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl12).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
      //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl13).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
      //choiceBox termine Elemente hinzufügen
        ((ChoiceBox<Object>)terminwahl14).getItems().addAll("Hausarztbesuch", "Spezialistenbesuch",
        		"Amulante Untersuchung Spital", "Spitalaufnahme", "Stationäte Untersuchung Spital", 
        		"Röntgenaufnahme", "Blutuntersuchung", "OP-Vorbereitung", "OP", 
        		"OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt", 
        		"Rehaustritt", "Behandlungsende");
        
        //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
      //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden1).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
      //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden2).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
      //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden3).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
      //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden4).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
      //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden5).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
      //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden6).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
      //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden7).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
      //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden8).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
      //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden9).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
      //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden10).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
      //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden11).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
      //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden12).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
      //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden13).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
      //choiceBox Uhrzeit Stunden Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitStunden14).getItems().addAll("01", "02", "03", "04",
        		"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", 
        		"17", "18", "19", "20", "21", "22", "23", "24");
        
        //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
      //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten1).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
      //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten2).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
      //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten3).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
      //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten4).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
      //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten5).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
      //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten6).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
      //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten7).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
      //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten8).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
      //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten9).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
      //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten10).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
      //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten11).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
      //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten12).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
      //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten13).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
      //choiceBox Uhrzeit Minuten Elemente hinzufügen
        ((ChoiceBox<Object>)UhrzeitMinuten14).getItems().addAll("05", "10", "15", "20", "25",
        		"30", "35", "40", "45", "50", "55", "00");
        
        //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");  
        
      //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl1).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
      //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl2).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
      //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl3).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
      //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl4).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
      //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl5).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
      //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl6).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
      //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl7).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
      //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl8).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
      //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl9).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
      //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl10).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
      //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl11).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
      //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl12).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
      //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl13).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
      //choiceBox Ort Elemente hinzufügen
        ((ChoiceBox<Object>)ortwahl14).getItems().addAll("Hausarzt Praxis", "Spezialist Praxis", 
        		"Spital Empfang", "Stationszimmer", "Radiologieabteilung", "Orthopädieabteilung", 
        		"OP-Abteilung", "Reha Empfang");
        
        
        /**Beim Status wird neben dem Text noch eine Farbe definiert und die Termine unterscheiden zu koennen
         * nach offene Termine, erledigte Termine oder verschobene Termine. 
         */
        Image fertig = new Image("fertig.png");
        ImageView imgViewFertig = new ImageView();
        imgViewFertig.setImage(fertig);
        imgViewFertig.setFitWidth(10);
        imgViewFertig.setFitHeight(10);
        Label fertigText = new Label("Erledigt");
        fertigText.setGraphic(imgViewFertig);
        fertigText.setTextFill(Color.BLACK);
        
        Image offen = new Image("offen.png");
        ImageView imgViewOffen = new ImageView();
        imgViewOffen.setImage(offen);
        imgViewOffen.setFitWidth(10);
        imgViewOffen.setFitHeight(10);
        Label offenText = new Label("Offen");
        offenText.setGraphic(imgViewOffen);
        offenText.setTextFill(Color.BLACK);
        
        Image verschoben = new Image("verschoben.png");
        ImageView imgViewVerschoben = new ImageView();
        imgViewVerschoben.setImage(verschoben);
        imgViewVerschoben.setFitWidth(10);
        imgViewVerschoben.setFitHeight(10);
        Label verschobenText = new Label("Verschoben");
        verschobenText.setGraphic(imgViewVerschoben);
        verschobenText.setTextFill(Color.BLACK);
        
        //hinzufuegen des Status mit Farbbild
		statusBox.getItems().addAll(fertigText, offenText, verschobenText);
		statusBox1.getItems().addAll(fertigText, offenText, verschobenText);
		statusBox2.getItems().addAll(fertigText, offenText, verschobenText);
		statusBox3.getItems().addAll(fertigText, offenText, verschobenText);
		statusBox4.getItems().addAll(fertigText, offenText, verschobenText);
		statusBox5.getItems().addAll(fertigText, offenText, verschobenText);
		statusBox6.getItems().addAll(fertigText, offenText, verschobenText);
		statusBox7.getItems().addAll(fertigText, offenText, verschobenText);
		statusBox8.getItems().addAll(fertigText, offenText, verschobenText);
		statusBox9.getItems().addAll(fertigText, offenText, verschobenText);
		statusBox10.getItems().addAll(fertigText, offenText, verschobenText);
		statusBox11.getItems().addAll(fertigText, offenText, verschobenText);
		statusBox12.getItems().addAll(fertigText, offenText, verschobenText);
		statusBox13.getItems().addAll(fertigText, offenText, verschobenText);
		statusBox14.getItems().addAll(fertigText, offenText, verschobenText);
    }
    
    public void postInit() {
        app.getParticle().getToolBarActions().add(0, actionHome);
    }
    
    public void dispose() {
        app.getParticle().getToolBarActions().remove(actionHome);
    }
    
    /**
     * Hier ist der Button zum Abmelden und zurueck zur Login Seite zu gehen.
     */
    @ActionProxy(text = "Abmelden")
    private void goHome() {
        viewManager.switchView("login");
    }
    
}
