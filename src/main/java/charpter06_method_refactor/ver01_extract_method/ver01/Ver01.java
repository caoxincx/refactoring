package charpter06_method_refactor.ver01_extract_method.ver01;

import java.util.Arrays;
import java.util.List;

/**
 * 需求编号:2019D0519
 * 问题编号:Extract Method
 * 这段代码放入一个函数中，并让这段代码解释函数的用途
 * 开发人员: caoxin
 * 创建日期:2019/11/10
 * 功能描述:
 * 修改日期:2019/11/10
 * 修改描述:
 */
public class Ver01 {
    // 当一段函数过长的时候
    // 当一段代码需要注释才清楚它在干什么的时候

    /**
     * 好处
     * 1.复用力度更大
     * 2.高层函数读起来就像读解释
     * 3.覆写该函数更加容易
     */

    // 关键点在 ： 函数本身和函数名的语义

    // 局部变量被赋值在提炼函数之前未被修改
    public static void printOwning(){
        int outing = getOuting();
        printOuting(outing);
    }
    // 局部变量被赋值在提炼函数之前被修改
    public static void printOwning2(int preValue){
        int outing = getOuting2(preValue * 2);
        printOuting(outing);
    }

    private static int getOuting() {
        List<Integer> integers = Arrays.asList(1, 3, 35, 5, 23);
        int result = 0;
        for (Integer integer : integers) {
            result += integer;
        }
        return result;
    }

    private static int getOuting2(int initialValue) {
        List<Integer> integers = Arrays.asList(1, 3, 35, 5, 23);
        int result = initialValue;
        for (Integer integer : integers) {
            result += integer;
        }
        return result;
    }

    private static void printOuting(int outing) {
        System.out.println(outing);
    }
}
