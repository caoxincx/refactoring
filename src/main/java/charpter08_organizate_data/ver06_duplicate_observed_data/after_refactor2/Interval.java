package charpter08_organizate_data.ver06_duplicate_observed_data.after_refactor2;

import java.util.Observable;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/19
 * 功能描述:
 * 修改日期:2019/11/19
 * 修改描述:
 */
public class Interval extends Observable {
    private String end = "0";
    private String start = "0";
    private String length = "0";


    public String getStart() {
        return start;
    }

    public String getLength() {
        return length;
    }

    public String getEnd() {
        return end;
    }

    public void setStart(String start) {
        this.start = start;
        setChanged();
        notifyObservers();
    }

    public void setLength(String length) {
        this.length = length;
        setChanged();
        notifyObservers();
    }

    public void setEnd(String end) {
        this.end = end;
        setChanged();
        notifyObservers();
    }
    public void calculateLength() {
        try {
            int start = Integer.parseInt(getStart());
            int end = Integer.parseInt(getEnd());
            int length = start - end;
            setLength(String.valueOf(length));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
    public void calculateEnd() {
        try {
            int start = Integer.parseInt(getStart());
            int length = Integer.parseInt(getLength());
            int end = start - length;
            setEnd(String.valueOf(end));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
