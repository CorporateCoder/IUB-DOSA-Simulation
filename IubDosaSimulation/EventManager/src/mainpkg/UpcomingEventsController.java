/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ashfaque
 */
public class UpcomingEventsController implements Initializable {

    @FXML
    private TextField eventName;
    @FXML
    private TextField eventDate;
    @FXML
    private Button addToList;
    @FXML
    private TextArea outputTextArea;
    @FXML
    private Button showEventList;
    @FXML
    private Button back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
    }    

    @FXML
    private void btnAddToListOnClick(ActionEvent event) {
        addToList.setText("Added");
        
         File f = null;
        FileWriter fw = null;
        FileChooser fc = null;
        //fw = new FileWriter("abc.txt");
        try {
            //int x = 1234567;
            //float ff = 3.5f;
            //String str = "Hello World";
            //FileWriter fw2 = new FileWriter("test.txt");
            //fw2.write("x=" + x + ",f=" + ff + ",str=" + str);
            //fw2.close();

            f = new File("Event.txt");      
            //fc = new FileChooser();
            //f = fc.showSaveDialog(null);
            //fw = new FileWriter(f);
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	eventName.getText()+","	
                +eventDate.getText()+"\n"		
            );         
            
            eventName.clear();
            eventDate.clear();
            
        } catch (IOException ex) {
            Logger.getLogger(UpcomingEventsController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(UpcomingEventsController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//end of controller method

    @FXML
    private void btnShowEventListOnClick(ActionEvent event) {
         //outputTextArea.setText("");
        outputTextArea.clear();
        File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
        try {
            f = new File("Event.txt");
            sc = new Scanner(f);
            if(f.exists()){
                outputTextArea.appendText("Content of Event:\n");
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    outputTextArea.appendText(
                            "Name="+tokens[0]
                            +", Date="+tokens[1]+"\n"                    
                    );
                }
            }
            else 
                outputTextArea.setText("oops! Emp.txt does not exist...");
        } 
        catch (IOException ex) {
            Logger.getLogger(UpcomingEventsController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
        }        
    }

    @FXML
    private void btnBackOnClick(ActionEvent event) throws IOException{
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("EventManagerMainScene.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    }
        
    
        
                

