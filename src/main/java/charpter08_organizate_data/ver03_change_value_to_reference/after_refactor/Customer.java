package charpter08_organizate_data.ver03_change_value_to_reference.after_refactor;

import java.util.HashMap;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/15
 * 功能描述:使用工厂方法始终返回同一个对象
 * 修改日期:2019/11/15
 * 修改描述:
 */
public class Customer {

    private final String name;
    static{
        new Customer("caoxin1").store();
        new Customer("caoxin2").store();
        new Customer("caoxin3").store();
        new Customer("caoxin4").store();
    }

    private void store() {
        customerHashMap.put(getName(), this);
    }

    private static HashMap<String, Customer> customerHashMap = new HashMap<>();
    public static Customer create(String name) {
        return customerHashMap.get(name);
    }

    private Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
