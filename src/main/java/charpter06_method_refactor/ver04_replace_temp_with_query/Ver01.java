package charpter06_method_refactor.ver04_replace_temp_with_query;

/**
 * 需求编号:2019D0519
 * 问题编号:Replace temp with query
 * 开发人员: caoxin
 * 创建日期:2019/11/10
 * 功能描述:把临时变量使用查询去替换
 * 修改日期:2019/11/10
 * 修改描述:
 */
public class Ver01 {
   private int quantity;
   private int itemPrice;

    double getPrice01(){
       // 重构前
        int basePrice = quantity * itemPrice;
        double discountFactor = 0;
        if (basePrice > 1000) {
            discountFactor = 0.95;
        } else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
    //====================重构后=======================
   double getPrice02(){
       return getBasePrice() * getDiscountFactor();
   }
    private double getDiscountFactor() {
        if (getBasePrice() > 1000) return 0.95;
        else return  0.98;
    }

    private int getBasePrice() {
        return quantity * itemPrice;
    }


}
