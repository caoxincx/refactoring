package charpter11_handle_generation_relationship.ver12_replace_delegation_with_inheritance;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/29
 * 功能描述:你在两个类之间使用委托关系，并经常为整个接口编写许多简单的委托函数
 * 1.你没有使用受托类的所有函数就不应该用delegate
 *  remove middleman ,也可以使用Extract superclassess 将两个接口的相同部分提炼到自己的类中
 *
 * 2.受托对象不知一个其他对象共享，受托对象是可变的这种情况下不能将委托关系替换成delegate？？？？
 * 修改日期:2019/11/29
 * 修改描述:
 */
public class Test {
}
