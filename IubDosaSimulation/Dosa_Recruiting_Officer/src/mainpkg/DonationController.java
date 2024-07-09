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
import java.util.ResourceBundle;
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
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ashfaque
 */
public class DonationController implements Initializable {

    @FXML
    private TextField nameTxt;
    @FXML
    private TextField contactTxt;
    @FXML
    private TextField donationTxt;
    @FXML
    private TextArea outputTextArea;
    @FXML
    private Button addToDataBase;
    @FXML
    private Button backToMainMenu;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnAddToDataBaseOnCLick(ActionEvent event) {
         addToDataBase.setText("Added");
        
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

            f = new File("Donation.txt");      
            //fc = new FileChooser();
            //f = fc.showSaveDialog(null);
            //fw = new FileWriter(f);
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	nameTxt.getText()+","
                +contactTxt.getText()+","	
                +donationTxt.getText()+"\n"		
            );           
            
        } catch (IOException ex) {
            Logger.getLogger(NewRecruitsController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(NewRecruitsController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//end of controller method

    @FXML
    private void btnBackToMainMenuOnClick(ActionEvent event) throws IOException{
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("RecruitingOfficerMainScene.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
 }

    
    
    

