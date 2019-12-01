package charpter10_simplify_the_function.ver06_replace_parameter_with_explicit_method.before_refactor;


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
    public static final int ENGINNER = 0;
    public static final int SALEMAN = 1;
    public static final int MANAGER = 2;

    static Employee create(int type) {
        switch (type) {
            case ENGINNER:
                return new Enginner();
            case SALEMAN:
                return new Saleman();
            case MANAGER:
                return new Manager();
             default:
                 return null;
        }
    }
}
