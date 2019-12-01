package charpter09_reduce_conditional_expression.ver07_introduce_null_object.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/23
 * 功能描述:用以解决 null对象和返回默认值，初始化的对象
 * 修改日期:2019/11/23
 * 修改描述:
 */
public class Main {
    public static void main(String[] args) {
        Site site = new Site();
        Customer customer = site.getCustomer();
        Customer.BillngPlan billngPlan;

        //
        //if (customer.isNull()) {
        //    billngPlan = Customer.BillngPlan.basic();
        //} else {
        //    billngPlan = customer.getBillngPlan();
        //}
        customer.setBillngPlan(Customer.BillngPlan.basic());

        String customerName =  customer.getName();

        //int weeksDelinquent;
        //if (customer.isNull()) {
        //    weeksDelinquent = 0;
        //} else {
        //    weeksDelinquent = customer.getPaymentHistory().getWeeksDelinquentInLastYear();
        //}

        int weeksDelinquent = customer.getPaymentHistory().getWeeksDelinquentInLastYear();
    }
}
