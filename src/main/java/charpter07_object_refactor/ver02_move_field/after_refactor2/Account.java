package charpter07_object_refactor.ver02_move_field.after_refactor2;



/**
 * 需求编号:2019D0519
 * 问题编号:将字段 interestRate 移动到类AccountType中
 *          当字段已经被很多函数引用的时候，首先实现自我封装
 * 开发人员: caoxin
 * 创建日期:2019/11/13
 * 功能描述:
 * 修改日期:2019/11/13
 * 修改描述:
 */
public class Account {
    private AccountType type;

    double interestForAmountDays(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }

    public double getInterestRate() {
        return type.getInterestRate();
    }

    public void setInterestRate(double interestRate) {
        type.setInterestRate(interestRate);
    }
}

