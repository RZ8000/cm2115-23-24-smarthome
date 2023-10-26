package uk.ac.rgu.cm2115;

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

        Device[] devices = model.getDevices();
        String[] labels = model.getCommandLabels();

        for(int i=0;i<devices.length;i++){
            if(devices[i] != null){
                this.lstDevices.getItems().add(devices[i]);
            }
        }

        // code to test adding a new button below
        // Button testButton = new Button("Click to test");
        // testButton.setPrefWidth(100);
        // testButton.setTextAlignment(TextAlignment.CENTER);      

        // this.hboxRoutines.getChildren().add(testButton);

        Command[] commands = model.getCommands();

        for(int i=0;i<commands.length;i++){
            if(commands[i] != null){
                Button btn = new Button(labels[i]);
                this.hboxRoutines.getChildren().add(btn);

                Command command = commands[i];
                btn.setOnAction((event) -> {
                    command.execute();
                });
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

    
    


}
