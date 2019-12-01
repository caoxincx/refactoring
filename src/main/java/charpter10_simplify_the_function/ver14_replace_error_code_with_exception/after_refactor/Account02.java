package charpter10_simplify_the_function.ver14_replace_error_code_with_exception.after_refactor;

import org.testng.Assert;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Account02 {
    private int balance;

    //int withDraw(int amount) {
    //    if (amount > balance) {
    //        return -1;
    //    } else {
    //        balance -= amount;
    //        return 0;
    //    }
    //}

    void withDraw (int  amount) throws BalancedException {
        if (amount > balance) {
            throw new BalancedException();
        }
        balance -= amount;
    }


    public boolean canWithDraw(int accountTest) {
        return balance < accountTest;
    }
}
