package charpter08_organizate_data.ver15_replace_type_code_with_state_strategy.after_refactor;


/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/21
 * 功能描述:如何不能Replace type code with subclassess
 * 则使用Replace type code with state 或 strategy
 * strategy 如果后续需要用Replace conditional with polymrphism
 * state 搬移状态和相关数据则使用
 * 修改日期:2019/11/21
 * 修改描述:
 */
public class Employee {
    private int monthlySalary;
    private int commission;
    private int bonus;

    private EmployeeType employeeType;
    public Employee(int type) {
        employeeType = EmployeeType.newType(type);
    }

    public int getType() {
        return employeeType.getEmployeeTypeCode();
    }

    public void setType(int type) {
        employeeType = EmployeeType.newType(type);
    }

    int payAmount() {
        switch (getType()) {
            case EmployeeType.ENGINEER:
                return monthlySalary;
            case EmployeeType.SALESMAN:
                return monthlySalary + commission;
            case EmployeeType.MANAGER:
                return monthlySalary + bonus;
            default:
                throw new IllegalArgumentException();
        }
    }

}
