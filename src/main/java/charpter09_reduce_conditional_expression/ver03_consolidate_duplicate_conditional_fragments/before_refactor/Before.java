package charpter09_reduce_conditional_expression.ver03_consolidate_duplicate_conditional_fragments.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/22
 * 功能描述:
 * 修改日期:2019/11/22
 * 修改描述:
 */
public class Before {
    private double total;
    private double price;

    public void before() {
        if (isSpecialDeal()) {
            total = price * 0.5;
            send();
        } else {
            total = price * 0.8;
            send();
        }
    }

    private void send() {
    }

    private boolean isSpecialDeal() {
        return false;
    }

}
