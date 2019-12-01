package charpter08_organizate_data.ver08_change_bidirectional_association_to_unidirectional.before_refactor;

import java.util.HashSet;
import java.util.Set;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/20
 * 功能描述:如何寻找关联关系
 * 1.如果是1对多，一个客户拥有多个订单，则由拥有单一引用的地方控制关联关系
 * 2.如果某个对象是组成另一个对象的组件，则由非组件对象控制关联关系
 * 3.如果两者都是引用对象并且是多对多，随便在一个对象中控制
 * <p>
 * 非关联关系控制角色添加辅助函数
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
        return order.getDiscountedPrice();
    }
}
