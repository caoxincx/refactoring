package charpter10_simplify_the_function.ver12_replace_constructor_with_factory_method.after_refactor;


/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/27
 * 功能描述:
 * 如果某个参数有多种可能的值，而函数内又以条件表达式检查这些参数值
 * 并根据不同的参数值做出不同的行为，就应该使用本项重构
 *
 * 参数值对函数做出的影响，如果确实需要条件判断行为则使用 replace type with polymorphism
 * 修改日期:2019/11/27
 * 修改描述:
 */
public class Employee {
    public static final int ENGINNER = 0;
    public static final int SALEMAN = 1;
    public static final int MANAGER = 2;

    static Employee create(String name)  {
        try {
            return (Employee) Class.forName(name).newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("incorrect class name of employee");
        }
    }
}
