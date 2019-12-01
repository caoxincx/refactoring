package charpter08_organizate_data.ver06_duplicate_observed_data.after_refactor2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;


public class Controller implements Initializable, Observer {

    private Interval subject;

    @FXML
    private TextField startField;
    @FXML
    private TextField endField;
    @FXML
    private TextField lengthField;

    public void initialize(URL location, ResourceBundle resources) {
        startField.setText("0");
        endField.setText("0");
        lengthField.setText("0");

        // 初始化
        subject = new Interval();
        subject.addObserver(this);
        update(subject,null);
    }
    @Override
    public void update(Observable o, Object arg) {
        endField.setText(subject.getEnd());
        startField.setText(subject.getStart());
        lengthField.setText(subject.getLength());
    }

    @FXML
    public void startFieldMoved(MouseEvent event){
        setStartField(startField.getText());
        try {
            Integer.parseInt(startField.getText());
        } catch (NumberFormatException e) {
            startField.setText("0");
        }
        subject.calculateLength();
    }
    @FXML
    public void endFieldMoved(MouseEvent event){
        setEndField(endField.getText());
        try {
            Integer.parseInt(endField.getText());
        } catch (NumberFormatException e) {
            endField.setText("0");
        }
        subject.calculateLength();
    }
    @FXML
    public void lengthFieldMoved(MouseEvent event){
        setLengthField(lengthField.getText());
        try {
            Integer.parseInt(lengthField.getText());
        } catch (NumberFormatException e) {
            lengthField.setText("0");
        }
        subject.calculateEnd();
    }


    public String getStartField() {
        return subject.getStart();
    }

    public void setStartField(String startField) {
        subject.setStart(startField);
    }

    public String getEndField() {
        return subject.getEnd();
    }

    public void setEndField(String arg) {
        subject.setEnd(arg);
    }

    public String getLengthField() {
        return subject.getLength();
    }

    public void setLengthField(String lengthField) {
        this.subject.setLength(lengthField);
    }

}
