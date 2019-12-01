package charpter10_simplify_the_function.ver08_replace_parameter_with_methods.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/27
 * 功能描述:
 * 修改日期:2019/11/27
 * 修改描述:
 */
public class Before {
    private double quantity;
    private double itemPrice;

    public double getPrice() {
        double basicPrice = quantity * itemPrice;
        int discountLevel;
        if (quantity > 100) {
            discountLevel = 2;
        } else {
            discountLevel = 1;
        }
       return discountedPrice(basicPrice, discountLevel);
    }

    private double discountedPrice(double basicPrice, int discountLevel) {
        if (discountLevel == 2) return basicPrice * 0.1;
        else return basicPrice * 0.05;
    }
}
