package charpter10_simplify_the_function.ver12_replace_constructor_with_factory_method.after_refactor.person;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:只有少数子类
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Person {
    static Man getMan() {
        return new Man();
    }

    static Male getMale() {
        return new Male();
    }
}
