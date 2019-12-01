package charpter09_reduce_conditional_expression.ver02_consolidate_conditional_expression.after;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/22
 * 功能描述:逻辑与 合并
 * 修改日期:2019/11/22
 * 修改描述:
 */
public class Test02 {
    public int testBefore() {
        //if (onVacation() && lengthOfService() > 10) {
        //    return 1;
        //} else {
        //    return 0;
        //}

        // 直接变成
        //if (onVacation() && lengthOfService() > 10) return 1;
        //else return 0;

        // 最后变成
        return onVacation() && lengthOfService() > 10 ? 1 : 0;
    }

    private int lengthOfService() {
        return 90;
    }

    private boolean onVacation() {
        return false;
    }


}
