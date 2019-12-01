package charpter10_simplify_the_function.ver05_parameterize_method.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/27
 * 功能描述:
 * 修改日期:2019/11/27
 * 修改描述:
 */
public class Employee {
    private double salary;
    void tenPercentRaise() {
        salary *= 1.1;
    }

    void fivePercentRaise() {
        salary *= 1.05;
    }
}
