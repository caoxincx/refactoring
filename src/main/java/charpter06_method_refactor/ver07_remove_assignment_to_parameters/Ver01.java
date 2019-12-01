package charpter06_method_refactor.ver07_remove_assignment_to_parameters;

import java.util.Date;

/**
 * 需求编号:2019D0519
 * 问题编号:remove assignment to parameters
 * 开发人员: caoxin
 * 创建日期:2019/11/10
 * 功能描述:移除对参数的赋值
 * 修改日期:2019/11/10
 * 修改描述:
 */
public class Ver01 {
    // 重构前
    int discount(int inputValue, int quantity, int yearToDate) {
        if (inputValue > 50) inputValue -= 2;
        if (quantity > 100) inputValue -= 1;
        if (yearToDate > 10000)  inputValue -= 4;
        return inputValue;
    }
    // 重构后
    int discount01(int inputValue, int quantity, int yearToDate) {
        int result = inputValue;
        if (result > 50) result -= 2;
        if (quantity > 100) result -= 1;
        if (yearToDate > 10000)  result -= 4;
        return result;
    }

    // 对象传递
    public static void main(String[] args) {
        Date d1 = new Date("1 Apr 98");
        nextDateUpdate(d1);
        System.out.println(d1);

        Date d2 = new Date("1 Apr 98");
        nextReplaceDate(d2);
        System.out.println(d2);
    }

    /**
     * java 本质上引用还是按值传递的，因此我可以修改参数对象内部状态
     * 但是如果对参数对象重新赋值是没有意义的。
     * @param d1
     */
    private static void nextReplaceDate(Date d1) {
        d1 = new Date(d1.getYear(), d1.getMonth(), d1.getDay() + 1);
        System.out.println(d1);
    }

    public static void nextDateUpdate(Date date) {
        date.setDate(date.getDay() + 1);
        System.out.println(date);
    }


}
