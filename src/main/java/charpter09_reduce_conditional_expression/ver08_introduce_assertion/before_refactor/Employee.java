package charpter09_reduce_conditional_expression.ver08_introduce_assertion.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/23
 * 功能描述:用以 标志程序可能出错的地方，在泳怡返回为真或假的时候使用
 * 修改日期:2019/11/23
 * 修改描述:
 */
public class Employee {
    public static final double NULL_EXPENSE = -1.0;
    private double expenseLimit = NULL_EXPENSE;
    private Project primaryProject;

    double getExpenseLimit() {
        return (expenseLimit != NULL_EXPENSE) ? expenseLimit : primaryProject.getMemberExpenseLimit();
    }
}
