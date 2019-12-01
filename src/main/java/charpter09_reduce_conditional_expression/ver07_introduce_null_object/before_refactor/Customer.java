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
public class Customer {
    private String name;
    private BillngPlan billngPlan;
    private PaymentHistory paymentHistory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BillngPlan getBillngPlan() {
        return billngPlan;
    }

    public void setBillngPlan(BillngPlan billngPlan) {
        this.billngPlan = billngPlan;
    }

    public PaymentHistory getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(PaymentHistory paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    public static class BillngPlan {
        public static BillngPlan basic() {
            return null;
        }
    }

    public class PaymentHistory {
        int getWeeksDelinquentInLastYear() {
            return 0;
        }
    }
}
