package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


import java.awt.*;
import java.time.LocalDate;


public class Controller {
    @FXML
    private Button create_btn;
    @FXML
    private Button view_btn;
    @FXML
    private Button exit_btn;
    @FXML
    private Label dateL ;
        @FXML
        private void initialize() {
            LocalDate a = LocalDate.now();
            dateL.setText(a.getYear()+"/"+a.getMonth()+"/"+a.getDayOfMonth());


        }
    }

