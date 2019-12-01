package charpter11_handle_generation_relationship.ver06_extract_subclass.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class JobItem {
    private int unitPrice;
    private int quantity;
    private Employee employee;
    private boolean isLabor;

    public int getTotalPrice() {
        return getUnitPrice() * getQuantity();
    }

    public int getUnitPrice() {
        return isLabor()?getEmployee().getRate():unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Employee getEmployee() {
        return employee;
    }

    public boolean isLabor() {
        return isLabor;
    }

    public JobItem(int unitPrice, int quantity, Employee employee, boolean isLabor) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.employee = employee;
        this.isLabor = isLabor;
    }
}
