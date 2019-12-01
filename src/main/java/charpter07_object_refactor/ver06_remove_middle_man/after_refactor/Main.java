package charpter07_object_refactor.ver06_remove_middle_man.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/14
 * 功能描述:
 * 修改日期:2019/11/14
 * 修改描述:
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.getDepartment().getManager();
    }
}
