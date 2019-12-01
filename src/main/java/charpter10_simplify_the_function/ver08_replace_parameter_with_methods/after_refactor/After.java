package charpter10_simplify_the_function.ver08_replace_parameter_with_methods.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/27
 * 功能描述:
 * 修改日期:2019/11/27
 * 修改描述:
 */
public class After {
    private double quantity;
    private double itemPrice;

    public double getPrice() {
        if (discountLevel() == 2) return getBasicPrice() * 0.1;
        else return getBasicPrice() * 0.05;
    }

    private double getBasicPrice() {
        return quantity * itemPrice;
    }
    private int discountLevel() {
        if (quantity > 100) return 2;
        else return 1;
    }
}
