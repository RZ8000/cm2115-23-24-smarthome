package uk.ac.rgu.cm2115;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import uk.ac.rgu.cm2115.devices.Device;
import uk.ac.rgu.cm2115.devices.Light;
import uk.ac.rgu.cm2115.devices.SmartPlug;
import uk.ac.rgu.cm2115.devices.Thermostat;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * JavaFX App
 */
public class MainApp extends Application{

    private static Scene scene = null;
    private static final Map<String, Object> models = new HashMap<>();

    public static void main(String[] args) {

        Device[] devices = new Device[5];
        
        devices[0] = new Light("Living room");
        devices[1] = new SmartPlug("Kettle");
        devices[2] = new Thermostat("House");
        devices[3] = new SmartPlug("Laptop");
        devices[4] = new Light("Kitchen");

        for(int i=0;i<devices.length;i++){
            // check here the methods available to device[i]
        }

        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {

        Home home = new Home();
        home.addDevice(new Light("Living room"));
        home.addDevice(new SmartPlug("Kettle"));
        home.addDevice(new Thermostat("Whole house"));

        MainApp.setScene("SmartHomeMain", home);

        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * Method to set the scene, with a given domain model
     * @param <T>
     * @param fxml
     * @param model
     * @throws IOException
     */    
    public static <T> void setScene(String fxml, T model) throws IOException {

        if(scene == null){
            scene = new Scene(loadFXML(fxml), 640, 480);
        }

        /* Strip off .fxml if it's been passed in the filename */
        if (fxml.endsWith(".fxml")) {
            fxml = fxml.replace(".fxml", "");
        }

        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource(fxml + ".fxml"));
        Parent root = loader.load();

        @SuppressWarnings("unchecked")
        Controller<T> controller = (Controller<T>) loader.getController();
        controller.setModel(model);

        scene.setRoot(root);
    }

    /**
     * Method to set the scene. This can only be called if a domain model
     * has previously been used with this scene - otherwise an IOException is thrown
     * @param fxml
     * @throws IOException
     */
    public static void setScene(String fxml) throws IOException{
        /* Strip off .fxml if it's been passed in the filename */
        if(fxml.endsWith(".fxml")){
            fxml = fxml.replace(".fxml","");
        }

        Object model = MainApp.models.get(fxml);

        if(model == null){
            throw new IOException("Scene cannot be used for the first time without a domain model");
        }

        MainApp.setScene(fxml, model);
    }
}
