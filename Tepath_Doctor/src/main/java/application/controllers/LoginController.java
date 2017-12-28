package application.controllers;

import java.util.ResourceBundle;

import javax.inject.Inject;

import org.controlsfx.control.action.ActionMap;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.state.StateManager;
import com.gluonhq.particle.view.ViewManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginController {

    @Inject ParticleApplication app;
    
    @Inject private ViewManager viewManager;

    @Inject private StateManager stateManager;
    
    private boolean first = true;
    
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
    
    @FXML
    void onActionLogin(ActionEvent event) {
    	if(benutzerText.getText().equals("hager") && passwortText.getText().equals("hager")) {
    		 btnAnmelden.setOnAction(e -> viewManager.switchView("patients"));	
    	} else if((!benutzerText.getText().equals("hager") && !benutzerText.getText().equals(null)) 
    			|| (!passwortText.getText().equals("hager") && !passwortText.getText().equals(null))) {
    		benutzerText.setText(null);
    		benutzerText.setPromptText("Benutzer evtl. falsch");
    		passwortText.setText(null);
    		passwortText.setPromptText("Passwort evtl. falsch");
    	} else {
    		benutzerText.setPromptText("Benutzer evtl. falsch");
    		passwortText.setPromptText("Passwort evtl. falsch");
    	}
    }
    
    
    public void initialize() {
        ActionMap.register(this);
//		 btnAnmelden.setOnAction(e -> viewManager.switchView("patients"));	
                
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