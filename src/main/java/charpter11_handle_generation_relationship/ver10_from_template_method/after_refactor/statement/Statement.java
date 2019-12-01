package charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.statement;

import charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.Customer;
import charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.Rental;

import javax.swing.plaf.nimbus.State;
import java.util.Enumeration;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/29
 * 功能描述:
 * 修改日期:2019/11/29
 * 修改描述:
 */
public abstract class Statement {
    abstract String getHeader(Customer customer);

    abstract String getEnd(Customer customer, String result);

    abstract String getBody(Customer customer, Rental each);

    public static Statement  createTextStatement() {
        return new TextStatement();
    }
    public static Statement  createTextHtmlStatement() {
        return new HtmlStatement();
    }

    public String statement(Customer customer) {
        Enumeration rentals = customer.get_rentals().elements();
        String result = getHeader(customer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement(); // 取得一笔租借记。
            // determine amounts for each line
            // add frequent renter points （累计常客积点。
            // show figures for this rental（显示此笔租借记录）
            result += getBody(customer, each);

        }
        // add footer lines（结尾打印）
        result = getEnd(customer, result);
        return result;
    }
}
