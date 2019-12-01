package charpter09_reduce_conditional_expression.ver02_consolidate_conditional_expression.after;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/22
 * 功能描述:逻辑或 合并
 * 修改日期:2019/11/22
 * 修改描述:
 */
public class Test01 {
    private int seniority;
    private int monthsDisabled;
    private boolean isPartTime;

    double disabilityAmount() {
        if (isNotEligableForDisability()) return 0;
        return 0;
    }
    public boolean isNotEligableForDisability() {
        if (seniority < 2 || monthsDisabled > 12 || isPartTime) return true;
        else return false;
    }
}
