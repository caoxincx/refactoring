package charpter11_handle_generation_relationship.ver06_extract_subclass.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class LaborItem extends JobItem {
    private Employee employee;
    public LaborItem(int quantity, Employee employee) {
        super(quantity);
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    //@Override
    protected int getUnitPrice() {
        return employee.getRate();
    }

    @Override
    protected boolean isLabor() {
        return true;
    }
}
