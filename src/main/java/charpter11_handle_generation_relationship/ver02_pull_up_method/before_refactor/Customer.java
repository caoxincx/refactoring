package charpter11_handle_generation_relationship.ver02_pull_up_method.before_refactor;

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
public abstract class Customer {
    protected Date lastBillDate;

    protected abstract double chargeFor(Date lastBillDate, Date date);
}
