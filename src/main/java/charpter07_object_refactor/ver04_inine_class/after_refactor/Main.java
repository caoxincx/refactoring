package charpter07_object_refactor.ver04_inine_class.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/13
 * 功能描述:
 * 修改日期:2019/11/13
 * 修改描述:
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        //person.getTelephoneNumber().setOfferNumber("xxxx");
        // 变成了
        person.setOfferNumber("xxxx");

        //person.getTelephoneNumber().setOfferAreaCode("xxx");
        // 变成了
        person.setOfferAreaCode("xxx");
    }
}
