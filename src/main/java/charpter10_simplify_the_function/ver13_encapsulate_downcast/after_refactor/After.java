package charpter10_simplify_the_function.ver13_encapsulate_downcast.after_refactor;

import charpter10_simplify_the_function.ver12_replace_constructor_with_factory_method.after_refactor.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:这个应该不会出现了 因为有了泛型的存在
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class After {
    List<Object> list = new ArrayList<>();

    Person lastReading() {
        return (Person) list.get(0);
    }
}
