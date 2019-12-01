package charpter06_method_refactor.ver08_replace_method_with_method_object;

/**
 * 需求编号:2019D0519
 * 问题编号:replace method with method Object
 * 开发人员: caoxin
 * 创建日期:2019/11/10
 * 功能描述:移除对参数的赋值
 * 修改日期:2019/11/10
 * 修改描述:
 */
public class Ver01 {
    // 重构前
    int gamma(int inputValue, int quantity, int yearToDate) {
        int importantValue1 = (inputValue * quantity) + delta();
        int importantValue2 = (inputValue * yearToDate) + 100;
        if (yearToDate - importantValue1 > 100) {
            importantValue2 -= 20;
        }
        int importantValue3 = importantValue2 * 7;
        return importantValue3 - 2 * importantValue1;
    }

    private int delta() {
        return 0;
    }

    // 重构第一步 生命一个类用于需要计算的字段
    int gamma02(int inputValue, int quantity, int yearToDate) {
        return new Gramma(new Account(),inputValue,quantity,yearToDate).compute();
    }
}
