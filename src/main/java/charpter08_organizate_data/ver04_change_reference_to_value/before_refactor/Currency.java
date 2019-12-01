package charpter08_organizate_data.ver04_change_reference_to_value.before_refactor;

import org.omg.CORBA.Current;

import java.util.HashMap;
import java.util.List;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/16
 * 功能描述:
 * 修改日期:2019/11/16
 * 修改描述:
 */
public class Currency {
    private static HashMap<String, Currency> currencyHashMap = new HashMap<>();
    static {
        Currency.store("ABC");
        Currency.store("BCD");
        Currency.store("CDF");
    }

    private Currency(String code) {
        this.code = code;
    }

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private static void store(String code) {
        currencyHashMap.put(code, new Currency(code));
    }

    public static Currency get(String code) {
        return currencyHashMap.get(code);
    }
}
