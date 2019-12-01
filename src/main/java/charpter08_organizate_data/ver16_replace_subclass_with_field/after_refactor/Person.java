package charpter08_organizate_data.ver16_replace_subclass_with_field.after_refactor;

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
public class Person {
    // 创建工厂
    static Person createMale() {
        return new Male(true,'M');
    }
    static Person createMan() {
        return new Man(false,'F');
    }
    // 针对每一个常亮在超类声明字段
    private final boolean isMale;
    private final char code;


    protected Person(boolean isMale, char code) {
        this.isMale = isMale;
        this.code = code;
    }

    boolean isMale(){
        return isMale;
    }

    char getCode() {
        return code;
    }
}
