package charpter10_simplify_the_function.ver14_replace_error_code_with_exception.before_refactor;

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
        int accountTest = 10;
        if (account.withDraw(accountTest) == -1) {
            handleOverDraw();
        } else {
            account.withDraw(accountTest);
            doTheUsalThing();
        }
    }

    private static void doTheUsalThing() {
    }

    private static void handleOverDraw() {
    }
}
