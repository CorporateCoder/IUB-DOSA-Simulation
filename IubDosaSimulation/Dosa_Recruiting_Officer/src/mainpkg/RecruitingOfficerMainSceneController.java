/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ashfaque
 */
public class RecruitingOfficerMainSceneController implements Initializable {

    @FXML
    private Button newRecruits;
    @FXML
    private Button recruitsHistory;
    @FXML
    private Button waitingList;
    @FXML
    private Button notice;
    @FXML
    private Button policyStatement;
    @FXML
    private Button donationList;
    @FXML
    private Button donorHistory;
    @FXML
    private Button report;
    @FXML
    private Button logOut;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnNewRecruitsOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("NewRecruits.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
//        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnRecruitsHistoryOnClick(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("RecruitmentHistory.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnWaitingListOnClick(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("WaitingList.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnNoticeOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("PostNotice.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnPolicyStatementOnClick(ActionEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("PolicyStatement.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnDonationsOnClick(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Donation.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnReportOnClick(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Report.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnLogOutOnClick(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnDonorHistoryOnClick(ActionEvent event)throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("DonationHistory.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg2.setScene(scene2);
        stg2.show();
    }
    
}
