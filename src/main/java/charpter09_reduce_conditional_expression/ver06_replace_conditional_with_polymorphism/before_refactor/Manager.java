package charpter09_reduce_conditional_expression.ver06_replace_conditional_with_polymorphism.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/21
 * 功能描述:
 * 修改日期:2019/11/21
 * 修改描述:
 */
public class Manager extends EmployeeType {
    @Override
    int getEmployeeTypeCode() {
        return MANAGER;
    }
}
