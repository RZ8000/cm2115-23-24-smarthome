package uk.ac.rgu.cm2115;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.text.TextAlignment;
import uk.ac.rgu.cm2115.commands.Command;
import uk.ac.rgu.cm2115.devices.Device;
import uk.ac.rgu.cm2115.devices.Thermostat;
import uk.ac.rgu.cm2115.devices.diagnostics.DeviceDiagnosticsVisitor;
import uk.ac.rgu.cm2115.devices.factories.AbstractDeviceFactory;
import uk.ac.rgu.cm2115.devices.factories.AmazonDeviceFactory;
import uk.ac.rgu.cm2115.devices.factories.AppleDeviceFactory;
import uk.ac.rgu.cm2115.devices.factories.DeviceType;

public class SmartHomeMainController extends Controller<Home> {

    @FXML
    private ListView<Device> lstDevices;

    @FXML
    private Label lblStatus;

    @FXML
    private Button btnCreateRoutine;

    @FXML
    private HBox hboxRoutines;

    @FXML
    private Button btnDiagnostics;

    @FXML
    private ComboBox<AbstractDeviceFactory> comboFactory;

    @FXML
    private ComboBox<DeviceType> comboDeviceType;

    @Override
    public void setModel(Home model) {
        this.model = model;

        Device[] devices = model.getDevices();

        for (int i = 0; i < devices.length; i++) {
            if (devices[i] != null) {
                this.lstDevices.getItems().add(devices[i]);
            }
        }

        // code to test adding a new button below
        // Button testButton = new Button("Click to test");
        // testButton.setPrefWidth(100);
        // testButton.setTextAlignment(TextAlignment.CENTER);

        // this.hboxRoutines.getChildren().add(testButton);

        String[] labels = model.getCommandLabels();
        Command[] commands = model.getCommands();

        for (int i = 0; i < commands.length; i++) {
            if (commands[i] != null) {
                Button btn = new Button(labels[i]);
                btn.setWrapText(true);
                Command command = commands[i];
                btn.setOnAction((event) -> {
                    command.execute();
                });
                this.hboxRoutines.getChildren().add(btn);
            }
        }

        this.comboFactory.getItems().add(new AppleDeviceFactory());
        this.comboFactory.getItems().add(new AmazonDeviceFactory());

        this.comboDeviceType.getItems().addAll(DeviceType.LIGHT, 
                                            DeviceType.SMART_PLUG, 
                                            DeviceType.SMART_SPEAKER, 
                                            DeviceType.THERMOSTAT);
    }

    @FXML
    private void lstDevicesOnClick() {
        Device device = lstDevices.getSelectionModel().getSelectedItem();

        if (device != null) {
            this.lblStatus.setText(device.getStatus());
        }
    }

    @FXML
    private void btnAddRoutineClick() throws IOException {
        MainApp.setScene("SmartHomeRoutine", this.model);
    }

    @FXML
    private void btnDiagnosticsOnClick() {
        Device device = this.lstDevices.getSelectionModel().getSelectedItem();

        if (device != null) {
            DeviceDiagnosticsVisitor visitor = new DeviceDiagnosticsVisitor();
            device.accept(visitor);
        }
    }

    @FXML
    private void btnAddDeviceOnClick() throws IOException{
        AbstractDeviceFactory factory = this.comboFactory.getSelectionModel().getSelectedItem();
        DeviceType type = this.comboDeviceType.getSelectionModel().getSelectedItem();

        if (factory != null && type != null) {
            Device device = null;

            TextInputDialog name = new TextInputDialog();
            name.setContentText("Enter a name for the device: ");

            name.showAndWait();

            String deviceName = name.getEditor().getText();

            if(deviceName == null || deviceName.equals("")){
                deviceName = "New device";
            }

            switch (type) {
                case LIGHT:
                    device = factory.createLight(deviceName);
                    break;
                case SMART_PLUG:
                    device = factory.createSmartPlug(deviceName);
                    break;
                case THERMOSTAT:
                    device = factory.createThermostat(deviceName);
                    break;
                case SMART_SPEAKER:
                    device = factory.createSmartSpeaker(deviceName);
                    break;
            }

            if (device != null) {
                this.model.addDevice(device);
                MainApp.setScene("SmartHomeMain");
            }
        }
    }

}
