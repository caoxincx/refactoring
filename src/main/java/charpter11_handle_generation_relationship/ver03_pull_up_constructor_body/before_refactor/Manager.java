package charpter11_handle_generation_relationship.ver03_pull_up_constructor_body.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Manager extends Employee {
    private int grade;
    public Manager(String id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}