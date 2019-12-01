package charpter08_organizate_data.ver02_replace_data_value_with_Object.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/15
 * 功能描述:
 * 修改日期:2019/11/15
 * 修改描述:
 */
public class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
