package charpter08_organizate_data.ver02_replace_data_value_with_Object.before_refactor;

import java.util.List;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/15
 * 功能描述:
 * 修改日期:2019/11/15
 * 修改描述:
 */
public class Order {
    private String customer;
    // 后续操作 如果需要为Customer 添加信用等属性如何左 看一下个重构
    public static int numberOfOrdersFor(List<Order> orders,String customer) {
        int result = 0;
        for (Order order : orders) {
            if (customer.equals(order.getCustomer())) {
                result++;
            }
        }
        return result;
    }
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
