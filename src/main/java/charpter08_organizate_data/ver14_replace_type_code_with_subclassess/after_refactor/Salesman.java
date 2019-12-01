package charpter08_organizate_data.ver14_replace_type_code_with_subclassess.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/21
 * 功能描述:
 * 修改日期:2019/11/21
 * 修改描述:
 */
public class Salesman extends Employee {
    public Salesman() {
        this.setType(Employee.SALESMAN);
    }

    @Override
    public int getType() {
        return Employee.SALESMAN;
    }

}
