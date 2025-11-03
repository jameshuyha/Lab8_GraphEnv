package lab8_graphenv;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Git Repository: https://github.com/jameshuyha/Lab8_GraphEnv.git
 * @author Huy James Vien Ha (6324151)
 */
public class Lab8_GraphEnv extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(Lab8_GraphEnv.class, args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Painter.fxml"));
        
        stage.setTitle("Painter");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
