package charpter06_method_refactor.ver02_inline_method;

/**
 * 需求编号:2019D0519
 * 问题编号:Inline Method
 * 开发人员: caoxin
 * 创建日期:2019/11/10
 * 功能描述:内联函数
 * 修改日期:2019/11/10
 * 修改描述:
 */
public class Ver01 {
    // 作用 其实是去除间接层很多Extract Method的影响
    private int number;

    //============================源代码====================================
    int getRating(){
        return (MoreThanFiveLateDeliveries()) ? 2 : 1;
    }
    private boolean MoreThanFiveLateDeliveries() {
        return number > 5;
    }

    //============================重构后====================================

    int getRating2(){
        return number > 5 ? 2 : 1;
    }

}
