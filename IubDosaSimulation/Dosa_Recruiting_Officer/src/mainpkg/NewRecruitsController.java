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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ashfaque
 */
public class NewRecruitsController implements Initializable {

    @FXML
    private TextField nameTxt;
    @FXML
    private TextField idTxt;
    @FXML
    private TextField departmentTxt;
    @FXML
    private Button backToMainMenu;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;
    @FXML
    private RadioButton othersRadioButton;
    @FXML
    private Button addNewStudent;
    private ToggleGroup tg, tg2;
    private Object firstNameTextField;
    @FXML
    private TextArea outputTextArea;
    @FXML
    private Button addToWaitingList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tg = new ToggleGroup();
        maleRadioButton.setToggleGroup(tg);
        femaleRadioButton.setToggleGroup(tg);
        othersRadioButton.setToggleGroup(tg);
        
        maleRadioButton.setSelected(true);
    }    

    @FXML
    private void btnbackToMainMenuOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("RecruitingOfficerMainScene.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void radioButtonOnClick(ActionEvent event) {
    }

    @FXML
    public void btnAddNewStudentOnClick(ActionEvent event) {
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

            f = new File("EmpText.txt");      
            //fc = new FileChooser();
            //f = fc.showSaveDialog(null);
            //fw = new FileWriter(f);
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	nameTxt.getText()+","
                +idTxt.getText()+","	
                +departmentTxt.getText()+"\n"		
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
    private void readTextFileButtonOnClick(ActionEvent event) {
         //outputTextArea.setText("");
        outputTextArea.clear();
        File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
        try {
            f = new File("EmpText.txt");
            sc = new Scanner(f);
            if(f.exists()){
                outputTextArea.appendText("Content of Emp.txt:\n");
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
            Logger.getLogger(NewRecruitsController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
        }        
    }

    @FXML
    private void btnAddToWaitingListOnClick(ActionEvent event) {
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

            f = new File("WaitingList.txt");      
            //fc = new FileChooser();
            //f = fc.showSaveDialog(null);
            //fw = new FileWriter(f);
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	nameTxt.getText()+","
                +idTxt.getText()+","	
                +departmentTxt.getText()+"\n"		
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
    }
    

    
    
    

