package charpter10_simplify_the_function.ver01_rename_method.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/27
 * 功能描述:
 * 修改日期:2019/11/27
 * 修改描述:
 */
public class Person {
    private String officeAreaCode;
    private String officeNumber;

    public String getTelephoneNumber() {
        return ("(" + officeAreaCode + ")" + officeNumber);
    }
}
