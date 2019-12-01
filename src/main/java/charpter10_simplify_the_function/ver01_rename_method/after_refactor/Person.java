package charpter10_simplify_the_function.ver01_rename_method.after_refactor;

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
        return getOfficeTelephoneNumber();
    }

    // 新建函数
    public String getOfficeTelephoneNumber() {
        return ("(" + officeAreaCode + ")" + officeNumber);
    }
    // 找到就函数的所有调用者 然后替换为新函数，最后将就函数给删除
}
