package calc_package;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Control {

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button radical;

    @FXML
    private Button one;

    @FXML
    private Button sound;

    @FXML
    private TextField display;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button plus;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button division;

    @FXML
    private Button doubleZero;

    @FXML
    private Button four;

    @FXML
    private Button equals;

    @FXML
    private Button multiplication;

    @FXML
    private Button power;

    @FXML
    private Button five;



    @FXML
    void eeff00(ActionEvent event) {
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        }
        if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        }
        if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        }
        if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        }
        if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        }
        if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        }
        if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        }
        if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        }
        if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        }
        if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        }
        if (event.getSource() == doubleZero) {
            display.setText(display.getText() + "00");
        }
        if (event.getSource() == clear) {
            display.setText("");
        }
    }


}

