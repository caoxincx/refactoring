package charpter08_organizate_data.ver15_replace_type_code_with_state_strategy.before_refactor;


/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/21
 * 功能描述:
 * 修改日期:2019/11/21
 * 修改描述:
 */
public class Employee {
    private int type;
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;
    private int monthlySalary;
    private int commission;
    private int bonus;

    public Employee(int type) {
        this.type = type;
    }

    int payAmount() {
            switch (type) {
                case ENGINEER:
                    return monthlySalary;
                case SALESMAN:
                    return monthlySalary + commission;
                case MANAGER:
                    return monthlySalary + bonus;
                default:
                    throw new IllegalArgumentException();
            }

    }

}
