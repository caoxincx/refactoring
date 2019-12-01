package charpter07_object_refactor.ver01_move_method;

/**
 * 需求编号:2019D0519
 * 问题编号:Move Method
 * 开发人员: caoxin
 * 创建日期:2019/11/10
 * 功能描述:移动对象中的方法
 * 修改日期:2019/11/10
 * 修改描述:
 */
public class Ver01 {
    // 作用
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
