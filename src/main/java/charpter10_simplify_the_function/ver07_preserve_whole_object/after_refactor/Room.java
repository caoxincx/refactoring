package charpter10_simplify_the_function.ver07_preserve_whole_object.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/27
 * 功能描述:将参数作为对象进行传递参数,不必拆开
 * 修改日期:2019/11/27
 * 修改描述:
 */
public class Room {
    private TempRange dayTempRange;

    boolean withinPlan(HeatingPlan plan) {
        return plan.withinRange(dayTempRange);
    }

    private TempRange daysTempRange() {
        return new TempRange();
    }
}
