package charpter11_handle_generation_relationship.ver11_replace_inheritance_with_delegation.before_refactor;

import java.util.Vector;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/29
 * 功能描述:某个子类只使用超类接口中的一部分，或者根本不需要继承而来的数据
 * 修改日期:2019/11/29
 * 修改描述:
 */
public class MyStack extends Vector {
    public void push(Object object) {
        insertElementAt(object,0);
    }

    public Object pop() {
        Object o = firstElement();
        removeElementAt(0);
        return o;
    }
}
