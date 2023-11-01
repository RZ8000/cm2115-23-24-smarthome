package uk.ac.rgu.cm2115;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;
import uk.ac.rgu.cm2115.commands.Command;

public class SmartHomeRoutineController extends Controller<Home> {

    @FXML
    private ListView<String> lstCommands;

    @FXML
    private ListView<String> lstRoutine;

    @Override
    public void setModel(Home model) {
        this.model = model;

        for (String label : this.model.getCommandLabels()) {
            if (label != null) {
                this.lstCommands.getItems().add(label);
            }
        }
    }

    @FXML
    private void btnAddToRoutineClick() {
        String commandLabel = this.lstCommands.getSelectionModel().getSelectedItem();

        if (commandLabel != null) {
            this.lstRoutine.getItems().add(commandLabel);
        } 
    }

    @FXML
    private void btnSaveRoutineClick() throws IOException {
        TextInputDialog name = new TextInputDialog();
        name.setContentText("Enter a name for the routine: ");

        name.showAndWait();

        String routineName = name.getEditor().getText();

        if (routineName != null && !routineName.equals("")) {
            Command command = () -> {
                for(String label : this.lstRoutine.getItems()){
                    Command c = this.model.getCommand(label);
                    if(c != null){
                        c.execute();
                    }
                }
            };

            this.model.addCommand(routineName, command);

            
        }

        MainApp.setScene("SmartHomeMain");
    }
}
