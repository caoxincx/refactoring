package charpter08_organizate_data.ver14_replace_type_code_with_subclassess.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/21
 * 功能描述:1.将类型码替换为子类
 * 1.类型码值在对象创建后发生了改变
 * 2.由于某些原因宿主类已经有了子类
 * 修改日期:2019/11/21
 * 修改描述:
 */
public class Employee {
    private int type;
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    public Employee(int type) {
        this.type = type;
    }

    public Employee() {
    }

    // 自我封装
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    // 以工程替换构造函数
    public static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return new Enginner();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException();
        }
    }
}
