package charpter10_simplify_the_function.ver14_replace_error_code_with_exception.after_refactor;

import org.testng.Assert;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述: 检查的责任的被调用方
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Account03 {
    private int balance;

    int withDraw(int amount) {

        try {
            newWithDraw(amount);
            return 0;
        } catch (BalancedException e) {
            e.printStackTrace();
            return -1;
        }
    }

    void newWithDraw(int amount) throws BalancedException {
        if (amount > balance) throw new BalancedException();
        else balance -= amount;
    }

    public boolean canWithDraw(int accountTest) {
        return balance < accountTest;
    }
}
