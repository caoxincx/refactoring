package charpter11_handle_generation_relationship.ver08_extract_interface.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/29
 * 功能描述:将相同的子集提炼到一个独立的函数中
 * 1.某个类在不同的环境下扮演不同的角色，使用接口是个好主意
 * 你可以针对每个角色以Extract Interface提炼出相应的接口
 * 2.你希望想要描述一个类的外部依赖接口，既这个类要求提供方提供的操作，只需要要求他们实现接口就行了
 * 修改日期:2019/11/29
 * 修改描述:
 */
public class TimeSheet {
    double charge(Employee employee, int days) {
        int base = employee.getRate() * days;
        if (employee.hasSpecialSkill()) {
            return base * 1.6;
        } else {
            return base;
        }
    }
}
