package charpter11_handle_generation_relationship.ver12_replace_delegation_with_inheritance.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/29
 * 功能描述:
 * 修改日期:2019/11/29
 * 修改描述:
 */
public class Employee {
    Person person = new Person();

    public String getName() {
        return person.getName();
    }

    public void setName(String ars) {
        person.setName(ars);
    }

}
