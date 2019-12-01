package charpter08_organizate_data.ver16_replace_subclass_with_field.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/21
 * 功能描述:两个子类的唯一区别就是将getCode 返回不同的硬编码
 * 并且getCode是一个常亮函数
 * 修改日期:2019/11/21
 * 修改描述:
 */
public abstract class Person {
    abstract boolean isMale();

    abstract char getCode();
}
