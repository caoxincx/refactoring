package charpter10_simplify_the_function.ver09_introduce_parameter_object.before_refactor;

import java.util.Date;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Client {
    public static void main(String[] args) {
        Account account = new Account();
        Date startDate = new Date();
        Date endDate = new Date();
        double flowBetween = account.getFlowBetween(startDate, endDate);

    }
}
