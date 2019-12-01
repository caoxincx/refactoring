package charpter07_object_refactor.ver03_extract_class.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/13
 * 功能描述:
 * 修改日期:2019/11/13
 * 修改描述:
 */
public class TelephoneNumber {
    private String offerAreaCode;
    private String offerNumber;

    public String getOfferAreaCode() {
        return offerAreaCode;
    }

    public void setOfferAreaCode(String offerAreaCode) {
        this.offerAreaCode = offerAreaCode;
    }

    public String getOfferNumber() {
        return offerNumber;
    }

    public void setOfferNumber(String offerNumber) {
        this.offerNumber = offerNumber;
    }

    public String getTelephoneNumber() {
        return offerAreaCode + offerNumber;
    }
}
