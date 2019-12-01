package charpter09_reduce_conditional_expression.ver07_introduce_null_object.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/23
 * 功能描述:
 * 修改日期:2019/11/23
 * 修改描述:
 */
public class Main {
    public static void main(String[] args) {
        Site site = new Site();
        Customer customer = site.getCustomer();
        Customer.BillngPlan billngPlan;


        if (customer == null) {
            billngPlan = Customer.BillngPlan.basic();
        } else {
            billngPlan = customer.getBillngPlan();
        }

        String customerName = null;
        if (customer == null) {
            customerName = "caoxin";
        } else {
            customerName = customer.getName();
        }


        int weeksDelinquent;
        if (customer == null) {
            weeksDelinquent = 0;
        } else {
            weeksDelinquent = customer.getPaymentHistory().getWeeksDelinquentInLastYear();
        }
    }
}
