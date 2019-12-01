package charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.statement;

import charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.Customer;
import charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.Rental;

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
public class HtmlStatement extends Statement {

    protected String getEnd(Customer customer, String result) {
        result += "Amount owed is " + customer.getTotalPriceCode() + "\n";
        result += "You earned " + customer.getTotalFrequentRenterPoints()
                + " frequent renter points";
        return result;
    }

    protected String getBody(Customer customer, Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t"
                + customer.amounFor(each) + "\n";
    }

    protected String getHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

}
