package charpter08_organizate_data.ver04_change_reference_to_value.after_refactor;

import java.util.HashMap;
import java.util.Objects;

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


    public Currency(String code) {
        this.code = code;
    }

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Currency)) return false;
        Currency currency = (Currency) o;
        return Objects.equals(code, currency.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
