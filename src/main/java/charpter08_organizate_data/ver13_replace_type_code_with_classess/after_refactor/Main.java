package charpter08_organizate_data.ver13_replace_type_code_with_classess.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/20
 * 功能描述:
 * 修改日期:2019/11/20
 * 修改描述:
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person(BloodGroup.A);
        int code = person.getBloodGroup().getCode();
    }
}
