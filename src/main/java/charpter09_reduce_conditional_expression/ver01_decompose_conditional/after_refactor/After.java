package charpter09_reduce_conditional_expression.ver01_decompose_conditional.after_refactor;

import java.util.Date;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/22
 * 功能描述:分解条件表达式
 * 修改日期:2019/11/22
 * 修改描述:
 */
public class After {
    public static final Date SUMMER_START = new Date("summerstart");
    public static final Date SUMMER_END = new Date("summerend");
    private Date date;
    private double quantity;
    private double winterRate;
    private double winterServiceCharge;
    private double summerRate;


    public double amountFor() {
        if (notSummer())
            return  winterCharge();
         else
             return summerCharge();
    }

    private double winterCharge() {
        double charge;
        charge = quantity * winterRate * winterServiceCharge;
        return charge;
    }

    private double summerCharge() {
        double charge;
        charge = quantity * summerRate;
        return charge;
    }

    private boolean notSummer() {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
