package uk.ac.rgu.cm2115;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.text.TextAlignment;
import uk.ac.rgu.cm2115.commands.Command;
import uk.ac.rgu.cm2115.devices.Device;

public class SmartHomeMainController extends Controller<Home>{
    

    @FXML
    private ListView<Device> lstDevices;

    @FXML
    private Label lblStatus;

    @FXML
    private Button btnCreateRoutine;

    @FXML
    private HBox hboxRoutines;

    @Override
    public void setModel(Home model) {
        this.model = model;

        ArrayList<Device> devices = model.getDevices();
        Set<String> labels = model.getCommandLabels();

        for(int i=0;i<devices.size();i++){
            if(devices.get(i) != null){
                this.lstDevices.getItems().add(devices.get(i));
            }
        }

        // code to test adding a new button below
        // Button testButton = new Button("Click to test");
        // testButton.setPrefWidth(100);
        // testButton.setTextAlignment(TextAlignment.CENTER);      

        // this.hboxRoutines.getChildren().add(testButton);


        Map<String, Command> commands = model.getCommands();

        for(String s: commands.keySet()){
            if(commands.get(s) != null){
                Button btn = new Button(s);
                Command command = commands.get(s);
                btn.setOnAction((event) -> {
                    command.execute();
                });
                this.hboxRoutines.getChildren().add(btn);

    
            }
        }
    }

    @FXML
    private void lstDevicesOnClick(){
        Device device = lstDevices.getSelectionModel().getSelectedItem();

        if(device != null){
            this.lblStatus.setText(device.getStatus());
        }
    }

    @FXML
    private void btnAddRoutineClick() throws IOException{
        MainApp.setScene("SmartHomeRoutine", this.model);
    }

    
    


}
