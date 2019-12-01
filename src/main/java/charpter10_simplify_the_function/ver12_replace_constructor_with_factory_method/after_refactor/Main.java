package charpter10_simplify_the_function.ver12_replace_constructor_with_factory_method.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/27
 * 功能描述:
 * 修改日期:2019/11/27
 * 修改描述:
 */
public class Main {
    public static void main(String[] args) {
        // 原来的调用方式
        //Employee employee = Employee.create(2);
        // 选择的调用方式
        Employee enginner = Employee.create("Manager");
    }
}
