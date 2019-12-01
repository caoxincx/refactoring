package charpter10_simplify_the_function.ver09_introduce_parameter_object.after_refactor;

import java.util.Date;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Entry {
    private Date chargeDate;
    private double value;

    public Entry(Date chargeDate, double value) {
        this.chargeDate = chargeDate;
        this.value = value;
    }

    public Date getChargeDate() {
        return chargeDate;
    }

    public void setChargeDate(Date chargeDate) {
        this.chargeDate = chargeDate;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean includes(DateRange dateRange) {
        return this.getChargeDate().equals(dateRange.getStart()) || this.getChargeDate().equals(dateRange.getEnd()) || (this.getChargeDate().after(dateRange.getStart()) && this.getChargeDate().before(dateRange.getEnd()));
    }
}
