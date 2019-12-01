package charpter07_object_refactor.ver04_inine_class.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:使用TelephoneNumber代表
 * 开发人员: caoxin
 * 创建日期:2019/11/13
 * 功能描述:
 * 修改日期:2019/11/13
 * 修改描述:
 */
public class Person {
    private String name;
    private TelephoneNumber telephoneNumber = new TelephoneNumber();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber.getTelephoneNumber();
    }
}
