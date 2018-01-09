package application.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.inject.Inject;

import org.controlsfx.control.action.ActionMap;

import application.MyConn;
import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.state.StateManager;
import com.gluonhq.particle.view.ViewManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * Die Klasse LoginController beinhaltet das Login für den Arzt. Einfach gestaltet mit einer kurzen Begruessung
 * und einem Login mit Benutzername, Passwort und Login-Button.
 * Die Klasse LoginController ist die Controller-Klasse für die FXML-Datei login.fxml.
 * @author Hager
 *
 */
public class LoginController {

    @Inject ParticleApplication app;
    
    @Inject private ViewManager viewManager;

    @Inject private StateManager stateManager;
    
    private boolean first = true;
    
    /**
     * Hier sind die Ferlder für die FXML-Datei definiert.
     */
    @FXML
    private AnchorPane login;
    
    @FXML
    private ResourceBundle resources;
    
    @FXML
    private Label welcomeLabel;
    
    @FXML
    private Label infoLabel;
    
    @FXML
    private Label benutzerLabel;
    
    @FXML
    private TextField benutzerText;
    
    @FXML
    private Label passLabel;
    
    @FXML
    private TextField passwortText;
    
    @FXML
    private Button btnAnmelden;
    
    public java.sql.Connection con;
    
    /**
     * Damit der Arzt auf die Patientenverwaltung zugreifen kann, muss er sich zuerst einloggen.
     * Wenn das Feld fuer Benutzername/Passwort leer oder nicht das richtige enthaelt wird im Feld Benutzername
     * "Benutzername evtl. Falsch" und im Feld Passwort "Passwort evtl. falsch" angezeigt
     * @param event login
     */
    @FXML
    void onActionLogin(ActionEvent event) {
    	
    	MyConn co = new MyConn();
    	con=co.getconn();
    	String query ="Select * from login_Doctor where UsernameD=? and PasswordD=?";
    	try {
    		PreparedStatement pst=con.prepareStatement(query);
    		pst.setString(1, benutzerText.getText());
    		pst.setString(2, passwortText.getText());
    		ResultSet rs=pst.executeQuery();
    		String _user="";
    		String _pass="";
    		while (rs.next()){
    			_user=rs.getString("UsernameD");
    			_pass=rs.getString("PasswordD");
    			}
    		if (_user.equals(benutzerText.getText()) && _pass.equals(passwortText.getText())) {
	         	btnAnmelden.setOnAction(e -> viewManager.switchView("patients")); 			
    		}
    		else if(!_user.equals(benutzerText.getText()) && !_user.equals(passwortText.getText())
    				|| !_user.equals(benutzerText.getText()) || !_user.equals(passwortText.getText())){
    			benutzerText.setText(null);
        		benutzerText.setPromptText("Benutzer evtl. falsch");
        		passwortText.setText(null);
        		passwortText.setPromptText("Passwort evtl. falsch");	
    		}else {
    			benutzerText.setPromptText("Benutzer evtl. falsch");
        		passwortText.setPromptText("Passwort evtl. falsch");
    		}
    	}
    	catch (SQLException e1) {
    		e1.printStackTrace();
    	
    	}
    	
    };
    

    	
    	
//    	if(benutzerText.getText().equals("hager") && passwortText.getText().equals("hager")) {
//    		 btnAnmelden.setOnAction(e -> viewManager.switchView("patients"));	
//    	} else if((!benutzerText.getText().equals("hager") || !benutzerText.getText().equals(null)) 
//    			|| (!passwortText.getText().equals("hager") || !passwortText.getText().equals(null))
//    			||(!benutzerText.getText().equals("hager") && !benutzerText.getText().equals(null)) 
//    			|| (!passwortText.getText().equals("hager") && !passwortText.getText().equals(null))) {
//    		benutzerText.setText(null);
//    		benutzerText.setPromptText("Benutzer evtl. falsch");
//    		passwortText.setText(null);
//    		passwortText.setPromptText("Passwort evtl. falsch");
//    	} else {
//    		benutzerText.setPromptText("Benutzer evtl. falsch");
//    		passwortText.setPromptText("Passwort evtl. falsch");
//    	}
//    }
    
    
    public void initialize() {
        ActionMap.register(this);
                
    }
    
    public void postInit() {
        if (first) {
            stateManager.setPersistenceMode(StateManager.PersistenceMode.USER);
            addUser(stateManager.getProperty("UserName").orElse("").toString());
            first = false;
        }
    }
    
    public void dispose() {
    }
    
    public void addUser(String userName) {
        welcomeLabel.getText();
        stateManager.setProperty("UserName", userName);
    }
    
}