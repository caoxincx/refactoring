package charpter11_handle_generation_relationship.ver08_extract_interface.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/29
 * 功能描述:
 * 修改日期:2019/11/29
 * 修改描述:
 */
public class Employee implements Billable{
    public int getRate() {
        return 0;
    }

    public boolean hasSpecialSkill() {
        return false;
    }
}
