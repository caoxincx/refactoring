package charpter09_reduce_conditional_expression.ver07_introduce_null_object.after_refactor;

import java.util.Objects;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/23
 * 功能描述:
 * 修改日期:2019/11/23
 * 修改描述:
 */
public class Site {
    private Customer customer;

    public Customer getCustomer() {
        return Objects.isNull(customer) ? new NullCustomer() : customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


}
