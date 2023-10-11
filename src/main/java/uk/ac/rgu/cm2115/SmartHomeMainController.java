package uk.ac.rgu.cm2115;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
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

        for(int i=0;i<devices.length;i++){
            if(devices[i] != null){
                this.lstDevices.getItems().add(devices[i]);
            }
        }
    }

    @FXML
    private void lstDevicesOnClick(){
        Device device = lstDevices.getSelectionModel().getSelectedItem();

        if(device != null){
            this.lblStatus.setText(device.toString());
        }
    }

    
    


}
