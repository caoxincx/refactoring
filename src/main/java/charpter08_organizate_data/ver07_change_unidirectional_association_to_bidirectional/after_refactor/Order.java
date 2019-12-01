package charpter08_organizate_data.ver07_change_unidirectional_association_to_bidirectional.after_refactor;

import java.util.Objects;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/20
 * 功能描述:不明白的话 画个图看一下从一个旧的customer引用变成一个新的就行了
 * 修改日期:2019/11/20
 * 修改描述:
 */
public class Order {
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if (Objects.nonNull(customer)) {
            customer.getOrders().remove(this);
            this.customer = customer;
        }
        if (Objects.nonNull(customer)) {
            customer.getOrders().add(this);
        }
    }

    private double getGrossPrice() {
        return 0;
    }
}
