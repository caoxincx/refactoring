package charpter09_reduce_conditional_expression.ver05_replace_nested_conditional_with_guard_clauses.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/22
 * 功能描述:将条件反转
 * 修改日期:2019/11/22
 * 修改描述:
 */
public class After02 {
    private static final double ADJ_FACTOR = 0.0;
    private double capital;
    private double intRate;
    private double duration;
    private double income;

    public double getAdjustedCapital() {
        double result = 0.0;
        if (capital <= 0.0) return 0.0;
        if (intRate <= 0.0 || duration <= 0.0) return 0.0;
        return (income / duration) * ADJ_FACTOR;
    }
}
