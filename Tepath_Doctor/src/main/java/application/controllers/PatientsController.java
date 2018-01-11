package application.controllers;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import javax.inject.Inject;

import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;

import application.MyConn;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private Label IDText;

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
    private Label terminVerschiebenL;
    
    @FXML
    private Label terminLV;
    
    @FXML
    private ChoiceBox<Object> terminwahlV;
    
    @FXML
    private Label datumLV;
    
    @FXML
    private DatePicker datumwahlV;
    
    @FXML
    private Label uhrzeitLV;
    
    @FXML
    private ChoiceBox<Object> UhrzeitStundenV;
    
    @FXML
    private Label zeitseperatorV;
    
    @FXML
    private ChoiceBox<Object> UhrzeitMinutenV;
    
    @FXML
    private ComboBox<Object> statusBoxV;
    
    @FXML
    private Button speichernTerminVerschieben;
    
    
    
    @FXML
    void onActionTerminVerschieben(ActionEvent event){
    	Object term = terminwahlV.getSelectionModel().getSelectedItem();
    	String terminA = term.toString();
    	try {
    		MyConn co = new MyConn();
    		con = co.getconn();
    		Statement Stmt = con.createStatement();
    		String query = "select Datum, Zustand from Termine WHERE Name='"+terminA+"'";
    		ResultSet rs = Stmt.executeQuery(query);
    		//ResultSet rsName = Stmt.executeQuery("Select Name FROM Termine");
//    		ResultSet rsDatum = Stmt.executeQuery("select Datum FROM Termine");
    		//String name = "";
    		Date datum = rs.getDate("Datum");
    		//String date = datum.toString();
    		String zustand = "";
    		while(rs.next()){
    			statusBoxV.getSelectionModel().select(zustand);
    			datumwahlV.setValue(datum.toLocalDate());
    		}

    		con.close();
    	}
    	catch(Exception exc){
			exc.getMessage();
    }
    }
    
    @FXML
    void onActionSaveDaten(ActionEvent event) {
    	
    	MyConn co = new MyConn();
    	con=co.getconn();
    	String query3 ="update Patienten set Username=?, Password=? where ID_Patient=?";
//    	String query2 ="select * Patienten";
//    	
//    		String _user="";
//			String _pass="";
			String user = "";
			String pswd = "";
			String ID = "";
			
    	
    	try{
    		
    		user = benutzerText.getText();
			pswd = passwortText.getText();
			ID = IDText.getText();
			PreparedStatement pst = con.prepareStatement(query3);
		pst.setString(1, user);
        pst.setString(2,pswd);
        pst.setString(3,ID);
        pst.executeUpdate();
		benutzerText.setText(null);
		passwortText.setText(null);
		benutzerText.setPromptText("gespeichert");
		passwortText.setPromptText("gespeichert");
//			PreparedStatement ps = con.prepareStatement(query2);
//			ResultSet rs=pst.executeQuery();
			
//			while (rs.next()){
//				_user=rs.getString("Username");
//				_pass=rs.getString("Password");
//								
//			}
//			if (user.equals(null) || pswd.equals(null)) {
//				benutzerText.setText(null);
//				passwortText.setText(null);
//				benutzerText.setPromptText("Benutzer oder Passwort nicht angegeben!");
//				
//			}
//			else if(user.equals(_user) ) {
//				benutzerText.setText(null);
//				passwortText.setText(null);
//				benutzerText.setPromptText("Benutzername existiert bereits");
//				
//			}
//			else {}
		}
		catch(Exception exc){
			exc.getMessage();
		}
    	patientenwahl.getSelectionModel().getSelectedItem();
    }
    
    @FXML
    void onActionSaveKontakte(ActionEvent event) {
    	
    	String HA="";
    	String SPI="";
    	String SPE="";
    	String APO="";
    	String REHA="";
    	String IDPA="";
    	
    	    MyConn co = new MyConn();
        	con=co.getconn();
//        	String query3 ="update Patienten set Username=?, Password=? where ID_Patient=?";
        	String query3 ="update Patienten set Hausarzt=?, Spital=?, Apotheke=?, Reha=?, Spezialist=? WHERE ID_Patient=?";
    	try {        		
    		HA= HA_ID;
    		SPI=SPI_ID;
    		APO=APO_ID;
    		SPE=SPE_ID;
    		REHA=REHA_ID;
    		IDPA=PAT_ID;
    		System.out.println("HA = "+HA);
    		System.out.println("HA_ID= " +HA_ID);
    		System.out.println("PAT_ID = " + PAT_ID);
    		System.out.println("IDPA = " + IDPA);
    		PreparedStatement pst = con.prepareStatement(query3);
    		pst.setString(1, HA);
            pst.setString(2,SPI);
            pst.setString(3,APO);
            pst.setString(4, REHA);
            pst.setString(5, SPE);
            pst.setString(6, IDPA);
            pst.executeUpdate();
    	
    	}
    	catch(Exception exc) {
    		exc.getMessage();
    	}
    	}

  

    
/**Die Felder werder bei speicherung der Informationen deaktiviert und koennen nicht bearbeitet werden.
 * Die Informationen die hier eingegeben worden sind sollen unter dem Patienten abgespeichert werden.
 * @param event speichern der Informationen
 */
    
    @FXML
    void onActionSave(ActionEvent event) {
    	

    }

    @FXML
    private ResourceBundle resources;
    
    private Action actionHome;

	private Connection con;
	
	/**
	 * Um die Namen der Aerzte und der Institutionen aus der Datenbank zu holen und in die ChoiceBoxen als Auswahlmoeglichkeiten
	 * hineinzufuegen, muessen eine Observable Liste erstellt werden und die Daten dort abgelegt werden. 
	 */
	
	@SuppressWarnings("rawtypes")
	@FXML
    ObservableList GetName() throws SQLException {
    	ObservableList<String> op = FXCollections.observableArrayList();
    MyConn co = new MyConn();
	con=co.getconn();
	Statement st = con.createStatement();
	String query1 = "Select Vorname, Nachname from Patienten";
	ResultSet rs = st.executeQuery(query1);
	String full = "";
	String vor = "";
	String nach = "";
	while(rs.next()){
		vor = rs.getString("Vorname");
		nach = rs.getString("Nachname");
		full = vor +" "+ nach;
		op.add(full);
	}
	con.close();
	return op;
    }
	
	@SuppressWarnings("rawtypes")
	@FXML
	ObservableList Hausarzt() throws SQLException {
		ObservableList<String> listHausarzt = FXCollections.observableArrayList();
		MyConn co = new MyConn();
		con=co.getconn();
		Statement st2 = con.createStatement();
		String query2 = "Select Name from Hausarzt";
		ResultSet rs2 = st2.executeQuery(query2);
		while(rs2.next()){
			listHausarzt.add(rs2.getString("Name"));
		}
		con.close();
		return listHausarzt;
	    }
	
	@SuppressWarnings("rawtypes")
	@FXML
	ObservableList Spezialist() throws SQLException {
		ObservableList<String> listSpezialist = FXCollections.observableArrayList();
		MyConn co = new MyConn();
		con=co.getconn();
		Statement st3 = con.createStatement();
		String query3 = "Select Name from Spezialist";
		ResultSet rs3 = st3.executeQuery(query3);
		while(rs3.next()){
			listSpezialist.add(rs3.getString("Name"));
		}
		con.close();
		return listSpezialist;
	}
	
	@SuppressWarnings("rawtypes")
	@FXML
	ObservableList Reha() throws SQLException {
		ObservableList<String> listReha = FXCollections.observableArrayList();
		MyConn co = new MyConn();
		con=co.getconn();
		Statement st4 = con.createStatement();
		String query4 = "Select Name from Reha";
		ResultSet rs4 = st4.executeQuery(query4);
		while(rs4.next()){
			listReha.add(rs4.getString("Name"));
		}
		con.close();
		return listReha;
	}
	
	@SuppressWarnings("rawtypes")
	@FXML
	ObservableList Spital() throws SQLException {
		ObservableList<String> listSpital = FXCollections.observableArrayList();
		MyConn co = new MyConn();
		con=co.getconn();
		Statement st5 = con.createStatement();
		String query5 = "Select Name from Spital";
		ResultSet rs5 = st5.executeQuery(query5);
		while(rs5.next()){
			listSpital.add(rs5.getString("Name"));
		}
		con.close();
		return listSpital;
	}
    
	@SuppressWarnings("rawtypes")
	@FXML
	ObservableList Apotheke() throws SQLException {
		ObservableList<String> listApotheke = FXCollections.observableArrayList();
		MyConn co = new MyConn();
		con=co.getconn();
		Statement st6 = con.createStatement();
		String query6 = "Select Name from Apothek";
		ResultSet rs6 = st6.executeQuery(query6);
		while(rs6.next()){
			listApotheke.add(rs6.getString("Name"));
		}
		con.close();
		return listApotheke;
	}
	
	@SuppressWarnings("rawtypes")
	@FXML
	ObservableList Termine() throws SQLException {
		ObservableList<String> listTermine = FXCollections.observableArrayList();
		MyConn co = new MyConn();
		con = co.getconn();
		Statement st7 = con.createStatement();
		String query7 = "Select Name from Termine";
		ResultSet rs7 = st7.executeQuery(query7);
		while(rs7.next()){
			listTermine.add(rs7.getString("Name"));
		}
		con.close();
		return listTermine;
	}
	
	
	
	public String HA_ID ="";
	public String SPI_ID="";
	public String APO_ID="";
	public String SPE_ID="";
	public String REHA_ID="";
	public String PAT_ID="";
	public String newAppo="";
	public String newStatus="";
	
	
    @SuppressWarnings("unchecked")
	public void initialize() throws SQLException{
    	
    	statusBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
            	newStatus=(String) statusBox.getItems().get((Integer) number2);
            	System.out.println("staus= " + newStatus);
            	
            }
            
          });
    	
    	
    	//new
    	terminwahl.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
            	newAppo=(String) terminwahl.getItems().get((Integer) number2);
            }
            
          });
            	
     
    	
    	//new
     	rehawahl.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {        		
            	MyConn co = new MyConn();
            	con=co.getconn();
            	String query1 ="Select * from Reha where Name=?";
            	
            	String _name ="";
            	String IDDB_REHA ="";            	
            	try{
    	
            		_name = (String) rehawahl.getItems().get((Integer) number2);
                		PreparedStatement pst=con.prepareStatement(query1);
                		pst.setString(1,_name);
                		ResultSet rs=pst.executeQuery();
                		
                		while (rs.next()){
                			IDDB_REHA=rs.getString("ID_Reha");		
                			REHA_ID=IDDB_REHA;
                		}
                		
                		
                	}
                	catch (SQLException e1) {
                		e1.printStackTrace();
                	
                	}
            }
          });
    	//new
     	spezialistwahl.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
            	MyConn co = new MyConn();
            	con=co.getconn();
            	String query1 ="Select * from Spezialist where Name=?";
        		
            	String _name ="";
            	String IDDB_SPE ="";            	
            	try{
    	
            		_name = (String) spezialistwahl.getItems().get((Integer) number2);
                		PreparedStatement pst=con.prepareStatement(query1);
                		pst.setString(1,_name);
                		ResultSet rs=pst.executeQuery();
                		
                		while (rs.next()){
                			IDDB_SPE=rs.getString("ID_Spezialist");		
                			SPE_ID=IDDB_SPE;
                		}
                		
                		
                	}
                	catch (SQLException e1) {
                		e1.printStackTrace();
                	
                	}
            }
          });
    	
    	//new
     	apothekenwahl.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
            	MyConn co = new MyConn();
            	con=co.getconn();
            	String query1 ="Select * from Apothek where Name=?";
        		
            	String _name ="";
            	String IDDB_APO ="";            	
            	try{
    	
            		_name = (String) apothekenwahl.getItems().get((Integer) number2);
                		PreparedStatement pst=con.prepareStatement(query1);
                		pst.setString(1,_name);
                		ResultSet rs=pst.executeQuery();
                		
                		while (rs.next()){
                			IDDB_APO=rs.getString("ID_Apotheke");		
                			APO_ID=IDDB_APO;
                		}
                		
                		
                	}
                	catch (SQLException e1) {
                		e1.printStackTrace();
                	
                	}
            }
          });
    	
    	//new
    	spitalwahl.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
            	MyConn co = new MyConn();
            	con=co.getconn();
            	String query1 ="Select * from Spital where Name=?";
        		
            	String _name ="";
            	String IDDB_SPI ="";            	
            	try{
    	
            		_name = (String) spitalwahl.getItems().get((Integer) number2);
                		PreparedStatement pst=con.prepareStatement(query1);
                		pst.setString(1,_name);
                		ResultSet rs=pst.executeQuery();
                		
                		while (rs.next()){
                			IDDB_SPI=rs.getString("ID_Spital");		
                			SPI_ID=IDDB_SPI;
                		}
                		
                		
                	}
                	catch (SQLException e1) {
                		e1.printStackTrace();
                	
                	}
            }
          });
    	
    	//new
    	hausarztwahl.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
            	MyConn co = new MyConn();
            	con=co.getconn();
            	String query1 ="Select * from Hausarzt where Name=?";
        		
            	String _name ="";
            	String IDDB_HA ="";            	
            	try{
    	
            		_name = (String) hausarztwahl.getItems().get((Integer) number2);
                		PreparedStatement pst=con.prepareStatement(query1);
                		pst.setString(1,_name);
                		ResultSet rs=pst.executeQuery();
                		
                		while (rs.next()){
                			IDDB_HA=rs.getString("ID_Hausarzt");		
                			HA_ID=IDDB_HA;
                			
                		}
                		
                		
                	}
                	catch (SQLException e1) {
                		e1.printStackTrace();
                	
                	}
            }
          });
            		
    	//new
    	patientenwahl.setItems(GetName());
    	
        patientenwahl.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
            	MyConn co = new MyConn();
            	con=co.getconn();
            	String query1 ="Select * from Patienten where Vorname=?";
        		
            	String _vorname ="";
            	String IDDB ="";
            	String usernDB="";
            	String pwDB="";
            	
            	try{
            	_vorname = (String) patientenwahl.getItems().get((Integer) number2);
            	String[] splitStr = _vorname.split("\\s+");
            		PreparedStatement pst=con.prepareStatement(query1);
            		pst.setString(1,splitStr[0]);
            		ResultSet rs=pst.executeQuery();
            		
            		while (rs.next()){
            			IDDB=rs.getString("ID_Patient");
            			usernDB=rs.getString("Username");
            			pwDB=rs.getString("Password");		
            			IDText.setText(IDDB);
            			PAT_ID = IDDB;
            			benutzerText.setText(usernDB);
            			passwortText.setText(pwDB);
            			
            		}
            		
            		
            	}
            	catch (SQLException e1) {
            		e1.printStackTrace();
            	
            	}

            }
          });
    	

        ActionMap.register(this);
        actionHome =  ActionMap.action("goHome");
        
        /**
         * Die Listen die vorher erstellt wurden, werden hier den Choiceboxen hinzugefuegt.
         */

        
    	hausarztwahl.setItems(Hausarzt());
    		
    	apothekenwahl.setItems(Apotheke());
    	
    	spitalwahl.setItems(Spital());
    	
    	rehawahl.setItems(Reha());
    	
    	spezialistwahl.setItems(Spezialist());
    	
    	terminwahlV.setItems(Termine());
    		
        
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
