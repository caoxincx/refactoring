package charpter08_organizate_data.ver16_replace_subclass_with_field.before_refactor;

import charpter08_organizate_data.ver05_replace_array_with_object.after_refactor.Performance;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/21
 * 功能描述:
 * 修改日期:2019/11/21
 * 修改描述:
 */
public class Male extends Person {
    @Override
    boolean isMale() {
        return true;
    }

    @Override
    char getCode() {
        return 'M';
    }
}
