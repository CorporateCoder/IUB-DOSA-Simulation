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
public class EventManagerMainSceneController implements Initializable {

    @FXML
    private Button upcomingEvents;
    @FXML
    private Button eventHistory;
    @FXML
    private Button notice;
    @FXML
    private Button report;
    @FXML
    private Button scheduleMeetings;
    @FXML
    private Button logistics;
    @FXML
    private Button workingStudents;
    @FXML
    private Button workerHistory;
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
    private void btnUpcomingEventsOnClick(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("UpcomingEvents.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
//        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnEventHistoryOnClick(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("EventHistory.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
//        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnNoticeOnClick(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Notice.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
//        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnReportOnClick(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Report.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
//        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnScheduleMeetingsOnClick(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Meetings.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
//        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnLogisticsOnClick(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Logistics.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
//        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnWorkingStudentsOnClick(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("WorkingStudents.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
//        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnworkerHistoryOnClick(ActionEvent event) throws IOException{
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("WorkerHistory.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
//        
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void btnLogOutOnClick(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
//        
        stg2.setScene(scene2);
        stg2.show();
    }
    
}
