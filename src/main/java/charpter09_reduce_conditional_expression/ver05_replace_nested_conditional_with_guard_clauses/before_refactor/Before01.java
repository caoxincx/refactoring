package charpter09_reduce_conditional_expression.ver05_replace_nested_conditional_with_guard_clauses.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/22
 * 功能描述:if else 分支
 * 1.所有分支都属于正常行为
 * 2.只有一种是正常行为，其他都是不常见的情况
 *
 * 如果两条分支都是正常的行为，就应该使用形如if...else
 * 如果某个条件极其罕见，就应该单独检查条件，并在条件为真的时候立即返回
 * 这样单独检查常常被称为 卫语句
 * 修改日期:2019/11/22
 * 修改描述:
 */
public class Before01 {
    private boolean isDead;
    private boolean isSeparated;
    private boolean isRetired;

    double getPayAmount() {
        double result;
        if (isDead) {
            result = deadAmount();
        } else {
            if (isSeparated) {
                result = separatedAmount();
            } else {
                if (isRetired) {
                    result = retiredAmount();
                } else {
                    result = normalPayAmount();
                }
            }
        }
        return result;
    }

    private double normalPayAmount() {
        return 0;
    }

    private double retiredAmount() {
        return 0;
    }

    private double separatedAmount() {
        return 0;
    }

    private double deadAmount() {
        return 0;
    }
}
