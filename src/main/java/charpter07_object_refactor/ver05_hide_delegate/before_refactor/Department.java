package charpter07_object_refactor.ver05_hide_delegate.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/14
 * 功能描述:
 * 修改日期:2019/11/14
 * 修改描述:
 */
public class Department {
    private String chargeCode;
    private Person manager;

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public Person getManager() {
        return manager;
    }

    public void setManager(Person manager) {
        this.manager = manager;
    }
}
