package charpter06_method_refactor.ver03_inline_temp;

/**
 * 需求编号:2019D0519
 * 问题编号:Inline Temp
 * 开发人员: caoxin
 * 创建日期:2019/11/10
 * 功能描述:内联变量
 * 修改日期:2019/11/10
 * 修改描述:
 */
public class Ver01 {
    // 作用 在使用Replace temp with query的时候常出现
    private int number;

    //============================源代码====================================
    public boolean isBiggerThan(){
        int basePrice = 0;//anOrder.basePrice;
        return basePrice > 5000;
    }

    //============================重构后====================================

    public boolean isBiggerThan2(){
        return  false;//anOrder.basePrice > 5000;
    }

}
