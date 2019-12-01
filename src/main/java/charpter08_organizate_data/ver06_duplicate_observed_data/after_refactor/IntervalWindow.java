package charpter08_organizate_data.ver06_duplicate_observed_data.after_refactor;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/17
 * 功能描述:
 * 修改日期:2019/11/17
 * 修改描述:
 */

public class IntervalWindow extends Frame implements Observer {
    private TextField startField;
    private TextField endField;
    private TextField lengthField;

    private Interval subject;

    public IntervalWindow() throws HeadlessException {
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

    class SymFocus extends FocusAdapter {
        @Override
        public void focusLost(FocusEvent e) {
            Object source = e.getSource();
            if (source == getStartField()) {
                startFieldFocusLost(e);
            } else if (source == getEndField()) {
                endFieldFocusLost(e);
            } else if (source == getLengthField()) {
                lengthFieldFocusLost(e);
            }
        }

        private void lengthFieldFocusLost(FocusEvent e) {
            setLengthField(lengthField.getText());
            if (isNotInteger(getLengthField())) {
                setLengthField("0");
            }
            subject.calculateEnd();
        }
        private void endFieldFocusLost(FocusEvent e) {
            setEndField(endField.getText());
            if (isNotInteger(getEndField())) {
                setEndField("0");
            }
            subject.calculateLength();
        }

        private void startFieldFocusLost(FocusEvent e) {
            setStartField(startField.getText());
            if (isNotInteger(getStartField())) {
                setStartField("0");
            }
            subject.calculateLength();
        }
        private boolean isNotInteger(String text) {
            return false;
        }
    }

    public String getStartField() {
        return startField.getText();
    }

    public void setStartField(String startField) {
        this.startField.setText(startField);
    }

    public String getEndField() {
        return subject.getEnd();
    }

    public void setEndField(String endField) {
        this.subject.setEnd(endField);;
    }

    public String getLengthField() {
        return lengthField.getText();
    }

    public void setLengthField(String lengthField) {
        this.lengthField.setText(lengthField);
    }
}
