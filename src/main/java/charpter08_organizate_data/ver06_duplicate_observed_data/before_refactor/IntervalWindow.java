package charpter08_organizate_data.ver06_duplicate_observed_data.before_refactor;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/17
 * 功能描述:
 * 修改日期:2019/11/17
 * 修改描述:
 */

public class IntervalWindow extends Frame {
    private TextField startField;
    private TextField endField;
    private TextField lengthField;

    class SymFocus extends FocusAdapter {
        @Override
        public void focusLost(FocusEvent e) {
            Object source = e.getSource();
            if (source == startField) {
                startFieldFocusLost(e);
            } else if (source == endField) {
                endFieldFocusLost(e);
            } else if (source == lengthField) {
                lengthFieldFocusLost(e);
            }
        }

        private void lengthFieldFocusLost(FocusEvent e) {
            if (isNotInteger(lengthField.getText())) {
                startField.setText("0");
            }
            calculateEnd();
        }
        private void endFieldFocusLost(FocusEvent e) {
            if (isNotInteger(endField.getText())) {
                startField.setText("0");
            }
            calculateLength();
        }

        private void startFieldFocusLost(FocusEvent e) {
            if (isNotInteger(startField.getText())) {
                startField.setText("0");
            }
            calculateLength();
        }

        private void calculateLength() {
            try {
                int start = Integer.parseInt(startField.getText());
                int end = Integer.parseInt(endField.getText());
                int length = start - end;
                lengthField.setText(String.valueOf(length));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

        }
        private void calculateEnd() {
            try {
                int start = Integer.parseInt(startField.getText());
                int length = Integer.parseInt(lengthField.getText());
                int end = start - length;
                endField.setText(String.valueOf(end));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        private boolean isNotInteger(String text) {
            return false;
        }
    }
}
