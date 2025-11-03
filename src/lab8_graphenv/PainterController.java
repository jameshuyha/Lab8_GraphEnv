package lab8_graphenv;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 * FXML Controller class
 *
 * @author 6324151
 */
public class PainterController implements Initializable {

    // instance variables that refer to GUI components
    @FXML
    private RadioButton blackRadioButton;
    @FXML
    private RadioButton redRadioButton;
    @FXML
    private RadioButton greenRadioButton;
    @FXML
    private RadioButton blueRadioButton;
    @FXML
    private RadioButton smallRadioButton;
    @FXML
    private RadioButton mediumRadioButton;
    @FXML
    private RadioButton largeRadioButton;
    @FXML
    private Pane drawingAreaPane;
    @FXML
    private Button undoButton;
    @FXML
    private Button clearButton;
    @FXML
    private ToggleGroup colorToggleGroup;
    @FXML
    private ToggleGroup sizeToggleGroup;

    // instance variables for managing Painter state
    private PenSize radius = PenSize.MEDIUM; // radius of circle
    private Paint brushColor = Color.BLACK; // drawing color

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // user data on a control can be any Object
        blackRadioButton.setUserData(Color.BLACK);
        redRadioButton.setUserData(Color.RED);
        greenRadioButton.setUserData(Color.GREEN);
        blueRadioButton.setUserData(Color.BLUE);
        smallRadioButton.setUserData(PenSize.SMALL);
        mediumRadioButton.setUserData(PenSize.MEDIUM);
        largeRadioButton.setUserData(PenSize.LARGE);
    }

    @FXML
    private void colorRadioButtonSelected(ActionEvent event) {
        
    }

    @FXML
    private void sizeRadioButtonSelected(ActionEvent event) {
    }

    @FXML
    private void undoButtonPressed(ActionEvent event) {
    }

    @FXML
    private void clearButtonPressed(ActionEvent event) {
    }

    @FXML
    private void drawingAreaMouseDragged(MouseEvent event) {
        
    }

    private enum PenSize {
        SMALL(2),
        MEDIUM(4),
        LARGE(6);

        private final int radius;

        private PenSize(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }
    };
}
