package application.controllers;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

/**
 * Die Klasse PatientController beinhaltet alle Informationen die vom Arzt
 * erfasst und gespeichert werden. Der Arzt Verwaltet hier die Termine der
 * Patienten, die Aerzte und Institutionen die der Patient besucht und die Login
 * Daten für den Patienten. Auf dieser Oberflaeche werden alle Daten
 * eingetragen, welche der Patient anschliessend auf seiner Mobilen App zu sehen
 * bekommt. Die PatientController ist die Controller-Klasse für die FXML-Datei
 * patient.fxml.
 * 
 * @author Hager
 *
 */

public class PatientsController {

	@Inject
	ParticleApplication app;

	@Inject
	private ViewManager viewManager;

	/**
	 * Hier werden die Felder definiert welche in der FXML-Datei erstellt
	 * wurden.
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
	private Label IDText;

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
	private HBox terminBox1;

	@FXML
	private Label terminL;

	@FXML
	private ChoiceBox<Object> terminwahl;

	@FXML
	private Label datumL;

	@FXML
	private DatePicker datumwahl;

	@FXML
	private HBox terminBox2;

	@FXML
	private Label uhrzeitL;

	@FXML
	private ChoiceBox<Object> UhrzeitStunden;

	@FXML
	private Label zeitseperator;

	@FXML
	private ChoiceBox<Object> UhrzeitMinuten;

	@FXML
	private Label uhrzeitL15;

	@FXML
	private ChoiceBox<Object> statusBox;

	@FXML
	private Button speichern;

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

	public java.sql.Date datenow;
	public int TerminIDs;

	@FXML
	void Daaaatee(ActionEvent event) {
	}

	/**
	 * Mit dieser soll das Verschieben der Termine möglich sein. Zuerst muss der
	 * Termin aus den bestehenden in der Datenbank ausgewählt werden. Die
	 * restlichen Felder füllen sich automatisch bei Terminauswahl mit den
	 * entsprechenden Informationen des gewählten Termins. Diese können dann
	 * verändert werden und mit dem speichern ändern sich die Informationen zu
	 * diesem Termin. Das heisst das Datum, den Zustand und die Zeit.
	 * 
	 * @param event
	 *            abspeichern der neuen Informationen/Termin verschieben
	 */
	@FXML
	void onActionTerminVerschieben(ActionEvent event) {
		Object term = terminwahlV.getSelectionModel().getSelectedItem();
		String terminA = term.toString();
		try {
			MyConn co = new MyConn();
			con = co.getconn();
			Statement Stmt = con.createStatement();
			String query = "select Datum, Zustand from Termine WHERE Name='" + terminA + "'";
			ResultSet rs = Stmt.executeQuery(query);
			Date datum = rs.getDate("Datum");
			String zustand = "";
			while (rs.next()) {
				statusBoxV.getSelectionModel().select(zustand);
				datumwahlV.setValue(datum.toLocalDate());
			}

			con.close();
		} catch (Exception exc) {
			exc.getMessage();
		}
	}

	/**
	 * Hier können die Benutzerdaten des Patienten gesehen und verändert werden.
	 * Der Patient kann aus den bestehenden Patienten gewählt werden. Dabei
	 * füllen sich die Felder mit Benutzername und Passwort automatisch. Die
	 * Felder können bearbeitet werden und beim abspeichern verändert werden.
	 * 
	 * @param event
	 *            verändern von Benutzername und Passwort eines bestimmten
	 *            Patienten
	 */
	@FXML
	void onActionSaveDaten(ActionEvent event) {

		MyConn co = new MyConn();
		con = co.getconn();
		String query3 = "update Patienten set Username=?, Password=? where ID_Patient=?";
		String user = "";
		String pswd = "";
		String ID = "";
		try {

			user = benutzerText.getText();
			pswd = passwortText.getText();
			ID = IDText.getText();
			PreparedStatement pst = con.prepareStatement(query3);
			pst.setString(1, user);
			pst.setString(2, pswd);
			pst.setString(3, ID);
			pst.executeUpdate();
			benutzerText.setText(null);
			passwortText.setText(null);
			benutzerText.setPromptText("gespeichert");
			passwortText.setPromptText("gespeichert");
		} catch (Exception exc) {
			exc.getMessage();
		}
		patientenwahl.getSelectionModel().getSelectedItem();
	}

	/**
	 * Hier können die Kontaktdaten der Behandlende wie Hausarzt, Spezialist,
	 * Spital, Apotheke und Reha verändert werden. Nachdem der Patient gewählt
	 * wird und die Behandelde gewählt werden, werden die Informationen der
	 * Behandelnde dieses Patienten überschrieben.
	 * 
	 * @param event
	 *            überschreiben der Kontaktinformationen der Behandelnde
	 */
	@FXML
	void onActionSaveKontakte(ActionEvent event) {

		String HA = "";
		String SPI = "";
		String SPE = "";
		String APO = "";
		String REHA = "";
		String IDPA = "";

		MyConn co = new MyConn();
		con = co.getconn();
		String query3 = "update Patienten set Hausarzt=?, Spital=?, Apotheke=?, Reha=?, Spezialist=? WHERE ID_Patient=?";
		try {
			HA = HA_ID;
			SPI = SPI_ID;
			APO = APO_ID;
			SPE = SPE_ID;
			REHA = REHA_ID;
			IDPA = PAT_ID;

			PreparedStatement pst = con.prepareStatement(query3);
			pst.setString(1, HA);
			pst.setString(2, SPI);
			pst.setString(3, APO);
			pst.setString(4, REHA);
			pst.setString(5, SPE);
			pst.setString(6, IDPA);
			pst.executeUpdate();

		} catch (Exception exc) {
			exc.getMessage();
		}
	}

	/**
	 * Der Patient muss zuerst gewählt werden. Beim abspeichern wird hier ein
	 * neuer Termin zu diesem Patienten erstellt. Es kann aus bestehenden
	 * Terminbezeichnungen, Datum, Uhrzeit und Status gewählt werden.
	 * 
	 * @param event
	 *            erstellung eines Termins zu einem bestimmten Patienten
	 */

	@FXML
	void onActionSave(ActionEvent event) {
		java.sql.Date gettedDatePickerDate = java.sql.Date.valueOf(datumwahl.getValue());
		datenow = gettedDatePickerDate;

		String newT = "";
		String newStat = "";
		int IDT;
		String IDPA = "";
		Date newDate;

		MyConn co = new MyConn();
		con = co.getconn();

		String query = " insert into Termine (ID_Termin, Name, Datum, Patient, Zustand)" + " values (?, ?, ?, ?, ?)";
		try {
			newT = newAppo;
			newDate = datenow;
			newStat = newStatus;
			IDT = TerminIDs + 1;
			IDPA = PAT_ID;

			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, IDT);
			pst.setString(2, newT);
			pst.setDate(3, newDate);
			pst.setString(4, IDPA);
			pst.setString(5, newStat);
			pst.executeUpdate();

		} catch (Exception exc) {
			exc.getMessage();
		}
	}

	@FXML
	private ResourceBundle resources;

	private Action actionHome;

	private Connection con;

	/**
	 * Um die Namen der P und der Institutionen aus der Datenbank zu holen und
	 * in die ChoiceBoxen als Auswahlmoeglichkeiten hineinzufuegen, muessen eine
	 * Observable Liste erstellt werden und die Daten dort abgelegt werden.
	 */

	@SuppressWarnings("rawtypes")
	@FXML
	ObservableList GetName() throws SQLException {
		ObservableList<String> op = FXCollections.observableArrayList();
		MyConn co = new MyConn();
		con = co.getconn();
		Statement st = con.createStatement();
		String query1 = "Select Vorname, Nachname from Patienten";
		ResultSet rs = st.executeQuery(query1);
		String full = "";
		String vor = "";
		String nach = "";
		while (rs.next()) {
			vor = rs.getString("Vorname");
			nach = rs.getString("Nachname");
			full = vor + " " + nach;
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
		con = co.getconn();
		Statement st2 = con.createStatement();
		String query2 = "Select Name from Hausarzt";
		ResultSet rs2 = st2.executeQuery(query2);
		while (rs2.next()) {
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
		con = co.getconn();
		Statement st3 = con.createStatement();
		String query3 = "Select Name from Spezialist";
		ResultSet rs3 = st3.executeQuery(query3);
		while (rs3.next()) {
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
		con = co.getconn();
		Statement st4 = con.createStatement();
		String query4 = "Select Name from Reha";
		ResultSet rs4 = st4.executeQuery(query4);
		while (rs4.next()) {
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
		con = co.getconn();
		Statement st5 = con.createStatement();
		String query5 = "Select Name from Spital";
		ResultSet rs5 = st5.executeQuery(query5);
		while (rs5.next()) {
			listSpital.add(rs5.getString("Name"));
		}
		con.close();
		return listSpital;
	}

	@SuppressWarnings("rawtypes")
	@FXML
	ObservableList Zustand() throws SQLException {
		ObservableList<String> listZustand = FXCollections.observableArrayList();
		MyConn co = new MyConn();
		con = co.getconn();
		Statement st5 = con.createStatement();
		String query5 = "Select Zustand from Termine";
		ResultSet rs5 = st5.executeQuery(query5);
		while (rs5.next()) {
			listZustand.add(rs5.getString("Zustand"));
		}
		con.close();
		return listZustand;
	}

	@SuppressWarnings("rawtypes")
	@FXML
	ObservableList Apotheke() throws SQLException {
		ObservableList<String> listApotheke = FXCollections.observableArrayList();
		MyConn co = new MyConn();
		con = co.getconn();
		Statement st6 = con.createStatement();
		String query6 = "Select Name from Apothek";
		ResultSet rs6 = st6.executeQuery(query6);
		while (rs6.next()) {
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
		while (rs7.next()) {
			listTermine.add(rs7.getString("Name"));
		}
		con.close();
		return listTermine;
	}

	public String HA_ID = "";
	public String SPI_ID = "";
	public String APO_ID = "";
	public String SPE_ID = "";
	public String REHA_ID = "";
	public String PAT_ID = "";
	public String newAppo = "";
	public String newStatus = "";

	@SuppressWarnings("unchecked")
	public void initialize() throws SQLException {
		/**
		 * Bestehende Termine werden von der Datenbank geholt und als
		 * Auswahlmöglichkeit aufgelistet.
		 */
		// new
		terminwahl.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
				newAppo = (String) terminwahl.getItems().get((Integer) number2);
				int count = 0;
				MyConn co = new MyConn();
				con = co.getconn();
				String query = "Select COUNT(*) AS total From Termine";
				try {
					PreparedStatement pst = con.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					while (rs.next()) {
						count = rs.getInt("total");
						TerminIDs = count;
					}
				} catch (SQLException e1) {
					e1.printStackTrace();

				}
			}

		});
		/**
		 * Die Auswahl der Reha wird bei dem ausgewählten Patienten in der
		 * abgespeichert.
		 */

		// new
		rehawahl.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
				MyConn co = new MyConn();
				con = co.getconn();
				String query1 = "Select * from Reha where Name=?";

				String _name = "";
				String IDDB_REHA = "";
				try {

					_name = (String) rehawahl.getItems().get((Integer) number2);
					PreparedStatement pst = con.prepareStatement(query1);
					pst.setString(1, _name);
					ResultSet rs = pst.executeQuery();

					while (rs.next()) {
						IDDB_REHA = rs.getString("ID_Reha");
						REHA_ID = IDDB_REHA;
					}

				} catch (SQLException e1) {
					e1.printStackTrace();

				}
			}
		});
		/**
		 * Der ausgewählte Spezialist wird beim ausgewählten Patienten in der
		 * Datenbank gespeichert.
		 */
		// new
		spezialistwahl.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
				MyConn co = new MyConn();
				con = co.getconn();
				String query1 = "Select * from Spezialist where Name=?";

				String _name = "";
				String IDDB_SPE = "";
				try {

					_name = (String) spezialistwahl.getItems().get((Integer) number2);
					PreparedStatement pst = con.prepareStatement(query1);
					pst.setString(1, _name);
					ResultSet rs = pst.executeQuery();

					while (rs.next()) {
						IDDB_SPE = rs.getString("ID_Spezialist");
						SPE_ID = IDDB_SPE;
					}

				} catch (SQLException e1) {
					e1.printStackTrace();

				}
			}
		});
		/**
		 * Die ausgewählte Apotheke wird beim ausgewählten Patienten in der
		 * Datenbank gespeichert.
		 */
		// new
		apothekenwahl.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
				MyConn co = new MyConn();
				con = co.getconn();
				String query1 = "Select * from Apothek where Name=?";

				String _name = "";
				String IDDB_APO = "";
				try {

					_name = (String) apothekenwahl.getItems().get((Integer) number2);
					PreparedStatement pst = con.prepareStatement(query1);
					pst.setString(1, _name);
					ResultSet rs = pst.executeQuery();

					while (rs.next()) {
						IDDB_APO = rs.getString("ID_Apotheke");
						APO_ID = IDDB_APO;
					}

				} catch (SQLException e1) {
					e1.printStackTrace();

				}
			}
		});
		/**
		 * Das ausgewählte Spital wird beim ausgewählten Patienten in der
		 * Datnebank gespeichert.
		 */
		// new
		spitalwahl.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
				MyConn co = new MyConn();
				con = co.getconn();
				String query1 = "Select * from Spital where Name=?";

				String _name = "";
				String IDDB_SPI = "";
				try {

					_name = (String) spitalwahl.getItems().get((Integer) number2);
					PreparedStatement pst = con.prepareStatement(query1);
					pst.setString(1, _name);
					ResultSet rs = pst.executeQuery();

					while (rs.next()) {
						IDDB_SPI = rs.getString("ID_Spital");
						SPI_ID = IDDB_SPI;
					}

				} catch (SQLException e1) {
					e1.printStackTrace();

				}
			}
		});
		/**
		 * Der ausgewählte Hausrzt wird beim ausgewählten Patienten in der
		 * Datenbank gespeichert.
		 */
		// new
		hausarztwahl.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
				MyConn co = new MyConn();
				con = co.getconn();
				String query1 = "Select * from Hausarzt where Name=?";

				String _name = "";
				String IDDB_HA = "";
				try {

					_name = (String) hausarztwahl.getItems().get((Integer) number2);
					PreparedStatement pst = con.prepareStatement(query1);
					pst.setString(1, _name);
					ResultSet rs = pst.executeQuery();

					while (rs.next()) {
						IDDB_HA = rs.getString("ID_Hausarzt");
						HA_ID = IDDB_HA;

					}

				} catch (SQLException e1) {
					e1.printStackTrace();

				}
			}
		});

		// new
		patientenwahl.setItems(GetName());

		patientenwahl.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
				MyConn co = new MyConn();
				con = co.getconn();
				String query1 = "Select * from Patienten where Vorname=?";

				String _vorname = "";
				String IDDB = "";
				String usernDB = "";
				String pwDB = "";

				try {
					_vorname = (String) patientenwahl.getItems().get((Integer) number2);
					String[] splitStr = _vorname.split("\\s+");
					PreparedStatement pst = con.prepareStatement(query1);
					pst.setString(1, splitStr[0]);
					ResultSet rs = pst.executeQuery();

					while (rs.next()) {
						IDDB = rs.getString("ID_Patient");
						usernDB = rs.getString("Username");
						pwDB = rs.getString("Password");
						IDText.setText(IDDB);
						PAT_ID = IDDB;
						benutzerText.setText(usernDB);
						passwortText.setText(pwDB);

					}

				} catch (SQLException e1) {
					e1.printStackTrace();

				}

			}
		});

		ActionMap.register(this);
		actionHome = ActionMap.action("goHome");

		/**
		 * Die Listen die vorher erstellt wurden, werden hier den Choiceboxen
		 * hinzugefuegt.
		 */

		hausarztwahl.setItems(Hausarzt());

		apothekenwahl.setItems(Apotheke());

		spitalwahl.setItems(Spital());

		rehawahl.setItems(Reha());

		spezialistwahl.setItems(Spezialist());

		terminwahlV.setItems(Termine());

		/**
		 * Hier werden die Auswahlmöglichkeiten bei der Terminerstellung
		 * definiert.
		 */

		// choiceBox termine Elemente hinzufügen
		terminwahl.getItems().addAll("Hausarztbesuch", "Spezialistenbesuch", "Amulante Untersuchung Spital",
				"Spitalaufnahme", "Stationäte Untersuchung Spital", "Röntgenaufnahme", "Blutuntersuchung",
				"OP-Vorbereitung", "OP", "OP-Nachbehandlung", "Nachuntersuchung", "Spitalaustritt", "Rehaeintritt",
				"Rehaustritt", "Behandlungsende");

		// choiceBox Uhrzeit Stunden Elemente hinzufügen
		UhrzeitStunden.getItems().addAll("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");

		// choiceBox Uhrzeit Minuten Elemente hinzufügen
		UhrzeitMinuten.getItems().addAll("05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "00");

		// choiceBox status Elemente hinzufügen
		statusBox.getItems().addAll("erledigt", "offen", "verschoben");

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
