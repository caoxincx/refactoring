package charpter07_object_refactor.ver02_move_field.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:将字段 interestRate 移动到类AccountType中
 * 开发人员: caoxin
 * 创建日期:2019/11/13
 * 功能描述:
 * 修改日期:2019/11/13
 * 修改描述:
 */
public class Account {
    private AccountType type;
    double interestForAmountDays(double amount, int days) {
        return type.getInterestRate() * amount * days / 365;
    }
}
