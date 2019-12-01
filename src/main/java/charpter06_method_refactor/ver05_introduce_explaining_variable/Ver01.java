package charpter06_method_refactor.ver05_introduce_explaining_variable;

/**
 * 需求编号:2019D0519
 * 问题编号:introduce explaining variable
 * 开发人员: caoxin
 * 创建日期:2019/11/10
 * 功能描述:引入临时变量去解释
 * 修改日期:2019/11/10
 * 修改描述:
 */
public class Ver01 {
    private int quantity;
    private int itemPrice;
    // 重构前
    double price(){
        // price is base price - quantity discount + shipping
        return quantity * itemPrice -
                Math.max(0, quantity - 500) * itemPrice * 0.05 +
                Math.min(quantity * itemPrice * 0.1, 100);
    }

    // 使用introduce explaining variable重构后
    double price02() {
        final int basePrice = quantity * itemPrice;
        final double discount = Math.max(0, quantity - 500) * itemPrice * 0.05;
        final double shipping = Math.min(basePrice * 0.1, 100);
        return basePrice -discount + shipping;
    }
    // 使用Extract method 重构
    double price03(){
        return getBasePrice() - getDiscount() + getShipping();
    }

    private double getShipping() {
        return Math.min(getBasePrice() * 0.1, 100);
    }

    private double getDiscount() {
        return Math.max(0, quantity - 500) * itemPrice * 0.05;
    }

    private int getBasePrice() {
        return quantity * itemPrice;
    }

}
