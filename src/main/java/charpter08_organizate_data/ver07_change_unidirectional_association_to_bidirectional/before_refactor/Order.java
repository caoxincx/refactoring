package charpter08_organizate_data.ver07_change_unidirectional_association_to_bidirectional.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/20
 * 功能描述:
 * 修改日期:2019/11/20
 * 修改描述:
 */
public class Order {
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
