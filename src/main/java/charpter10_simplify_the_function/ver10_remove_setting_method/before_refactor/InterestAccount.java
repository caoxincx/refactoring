package charpter10_simplify_the_function.ver10_remove_setting_method.before_refactor;

import charpter10_simplify_the_function.ver10_remove_setting_method.after_refactor.Account02;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class InterestAccount extends Account02 {
    private double interestRate;
    public InterestAccount(String id,double rate) {
        super(id);
        this.interestRate = rate;
    }
}
