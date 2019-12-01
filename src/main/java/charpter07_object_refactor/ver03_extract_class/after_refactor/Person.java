package charpter07_object_refactor.ver03_extract_class.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:使用TelephoneNumber代表
 * 开发人员: caoxin
 * 创建日期:2019/11/13
 * 功能描述:
 * 修改日期:2019/11/13
 * 修改描述:
 */
public class Person {
    private String name;
    private TelephoneNumber telephoneNumber = new TelephoneNumber();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber.getTelephoneNumber();
    }

    public void getOfficeNumber() {
        telephoneNumber.getOfferNumber();
    }
    // 这里有一个问题？是否要对用户公开这个类
    /**
     * 1.允许任何用户修改这个类（TelephoneNumber的任何部分）
     * TelephoneNumber成为引用对象，Person应该是TelephoneNumber的访问点。
     * 2.任何人不能通过Person修改TelephoneNumber，需要设置为final并初始化。
     * 3.先复制一个TelephoneNumber对象并将该对象传递给用户，但是这样子做有可能让用户误以为你已经修改了这个类。
     */
}
