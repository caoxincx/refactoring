package charpter08_organizate_data.ver01_self_encapsulate_field.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/15
 * 功能描述:
 * 修改日期:2019/11/15
 * 修改描述:
 */
public class SelfEncapsulateField {
    private int low;
    private int high;

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }

}
