package calc_package;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;




public class Controller {

        Float data = 0f;
        int operation = -1; // id of the operation (I mean the addition, subtraction etc)

        private static MediaPlayer mediaPlayer; // I needed to initialize it here, because Garbage Collector will stop the music
        // after 2-5 seconds :)

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
        void playMusic(String filepath){

            Media media = new Media(filepath);

            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setVolume(0.7);
            mediaPlayer.play();


        }

        //a method which allows you to stop playing the music
        @FXML
        public void stopMusic(MouseEvent mouseEvent) {
            if (mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
                if (mouseEvent.getClickCount() == 2) {
                        mediaPlayer.stop();
                }
            }
        }
        @FXML
        void press(ActionEvent event) {

            //"one" button
            if (event.getSource() == one) {
                display.setText(display.getText() + "1");
            }
            //"two" button
            else if (event.getSource() == two) {
                display.setText(display.getText() + "2");
            }
            //"three" button
            else if (event.getSource() == three) {
                display.setText(display.getText() + "3");
            }
            //"four" button
            else if (event.getSource() == four) {
                display.setText(display.getText() + "4");
            }
            //"five" button
            else if (event.getSource() == five) {
                display.setText(display.getText() + "5");
            }
            //"six" button
            else if (event.getSource() == six) {
                display.setText(display.getText() + "6");
            }
            //"seven" button
            else if (event.getSource() == seven) {
                display.setText(display.getText() + "7");
            }
            //"eight" button
            else if (event.getSource() == eight) {
                display.setText(display.getText() + "8");
            }
            //"nine" button
            else if (event.getSource() == nine) {
                display.setText(display.getText() + "9");
            }
            //"zero" button
            else if (event.getSource() == zero) {
                display.setText(display.getText() + "0");
            }
            //"double zero" button
            else if (event.getSource() == doubleZero) {
                display.setText(display.getText() + "00");
            }
            //"clear" button
            else if (event.getSource() == clear) {
                display.setText("");
            }
            //"addition" button
            else if(event.getSource()== plus){
                data = Float.parseFloat(display.getText());
                operation = 1;
                display.setText("");
            }
            //"subtraction" button
            else if(event.getSource()== minus){
                data = Float.parseFloat(display.getText());
                operation = 2;
                display.setText("");
            }
            //"multiplication" button
            else if(event.getSource()== multiplication){
                data = Float.parseFloat(display.getText());
                operation = 3;
                display.setText("");
            }
            //"division" button
            else if(event.getSource()== division){
                data = Float.parseFloat(display.getText());
                operation = 4;
                display.setText("");
            }
            //"power" button
            else if(event.getSource()== power){
                data = Float.parseFloat(display.getText());
                operation = 5;
            }
            //"sqrt" button
            else if(event.getSource()== radical){
                data = Float.parseFloat(display.getText());
                operation = 6;
            }
            else if(event.getSource()== sound) {
                display.setText("");
                display.setPromptText("Do you like it?");
                playMusic("file:///C:/Users/HP/Desktop/music.mp3");
                //should be a path to the music, I've put the random music from my computer 
            }
            //"equals" button
            else if(event.getSource()== equals){
                Float secondOperation = Float.parseFloat(display.getText());
                switch (operation){
                    case 1:
                        double score = data + secondOperation;
                        display.setText(String.valueOf(score));
                        break;
                    case 2:
                        score = data - secondOperation;
                        display.setText(String.valueOf(score));
                        break;
                    case 3:
                        score = data * secondOperation;
                        display.setText(String.valueOf(score));
                        break;
                    case 4:
                        try {
                            score = data / secondOperation;
                            display.setText(String.valueOf(score));
                            if(secondOperation==0){
                                display.setText("can not be divided by zero");
                            }
                        }catch (Exception e){
                            display.setText("can not be divided by zero");
                        }
                        break;
                    case 5:
                        score = Math.pow(data,2) ;
                        display.setText(String.valueOf(score));
                        break;

                    case 6:
                        score = Math.sqrt(data) ;
                        display.setText(String.valueOf(score));
                        break;










                }
            }
        }



}

