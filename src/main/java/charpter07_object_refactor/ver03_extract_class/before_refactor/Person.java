package charpter07_object_refactor.ver03_extract_class.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/13
 * 功能描述:
 * 修改日期:2019/11/13
 * 修改描述:
 */
public class Person {
    private String name;
    private String offerAreaCode;
    private String offerNumver;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfferAreaCode() {
        return offerAreaCode;
    }

    public void setOfferAreaCode(String offerAreaCode) {
        this.offerAreaCode = offerAreaCode;
    }

    public String getOfferNumver() {
        return offerNumver;
    }

    public void setOfferNumver(String offerNumver) {
        this.offerNumver = offerNumver;
    }
}
