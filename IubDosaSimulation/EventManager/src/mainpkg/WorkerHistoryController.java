/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ashfaque
 */
public class WorkerHistoryController implements Initializable {

    @FXML
    private Button showWorkerHistory;
    @FXML
    private TextArea outputTextArea;
    @FXML
    private Button back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnshowWorkerHistoryOnClick(ActionEvent event) {
         //outputTextArea.setText("");
        outputTextArea.clear();
        File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
        try {
            f = new File("WorkingStudents.txt");
            sc = new Scanner(f);
            if(f.exists()){
                outputTextArea.appendText("Content of Working Students:\n");
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    outputTextArea.appendText(
                            "Name="+tokens[0]
                            +", ID="+tokens[1]
                            +", Department="+tokens[2]+"\n"                    
                    );
                }
            }
            else 
                outputTextArea.setText("oops! Emp.txt does not exist...");
        } 
        catch (IOException ex) {
            Logger.getLogger(LogisticsController.class.getName()).log(Level.SEVERE, null, ex);
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
   