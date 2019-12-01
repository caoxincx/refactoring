package charpter09_reduce_conditional_expression.ver02_consolidate_conditional_expression.before;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/22
 * 功能描述:
 * 修改日期:2019/11/22
 * 修改描述:
 */
public class Test01 {
    private int seniority;
    private int monthsDisabled;
    private boolean isPartTime;

    double disabilityAmount() {
        if (seniority < 2) return 0;
        if (monthsDisabled > 12) return 0;
        if (isPartTime) return 0;

        return 0;
    }
}
