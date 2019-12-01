package charpter08_organizate_data.ver08_change_bidirectional_association_to_unidirectional.after_refactor;

import java.util.HashSet;
import java.util.Set;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/20
 * 将双向关联改成单向关联
 * <p>
 * 修改日期:2019/11/20
 * 修改描述:
 */
public class Customer {
    private Set<Order> orders = new HashSet<>();

    public Set<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        order.setCustomer(this);
    }

    public int getDiscount() {
        return 0;
    }
    double getPriceFor(Order order) {
        return order.getDiscountedPrice(this);
    }
}
