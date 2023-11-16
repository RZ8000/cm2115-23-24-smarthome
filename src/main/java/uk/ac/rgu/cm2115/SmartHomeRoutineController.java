package uk.ac.rgu.cm2115;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;
<<<<<<< HEAD
=======
import uk.ac.rgu.cm2115.commands.Command;
>>>>>>> de014216fcd3c36e5d72e9479cfe688c23505302
import uk.ac.rgu.cm2115.commands.RoutineCommand;

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
        
        RoutineStrategy reverse = (commands) -> {
            for(int i=commands.length - 1; i>=0; i--){
                if(commands[i] != null){
                    commands[i].execute();
                }
            }
        };

<<<<<<< HEAD
        if (routineName != null && !routineName.equals("")) {
            RoutineCommand routineCommand = new RoutineCommand(reverse);
            for(String commandName : this.lstRoutine.getItems()){
                routineCommand.addCommand(this.model.getCommand(commandName));
            }
            this.model.addCommand(routineName, routineCommand);
=======
        RoutineStrategy reverse = (commands) -> {
            for(int i=commands.length - 1; i >= 0; i--){
                if(commands[i]  != null) {
                    commands[i].execute();
                }
            }
        };

        if (routineName != null && !routineName.equals("")) {
            RoutineCommand Routine1 = new RoutineCommand(reverse);
            for (String CommandName : this.lstRoutine.getItems()) {
                Routine1.addCommand(model.getCommand(CommandName));
            }
>>>>>>> de014216fcd3c36e5d72e9479cfe688c23505302

            model.addCommand(routineName, Routine1);
        }

        MainApp.setScene("SmartHomeMain");
    }
}
