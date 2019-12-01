package charpter10_simplify_the_function.ver07_preserve_whole_object.before_refactor;

import charpter08_organizate_data.ver01_self_encapsulate_field.after_refactor.SelfEncapsulateField;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/27
 * 功能描述:
 * 修改日期:2019/11/27
 * 修改描述:
 */
public class Room {
    private DayTempRange dayTempRange;

    boolean withinPlan(HeatingPlan plan) {
        int low = dayTempRange.getLow();
        int hight = dayTempRange.getHight();
        return plan.withinRange(low, hight);
    }
}
