package charpter10_simplify_the_function.ver14_replace_error_code_with_exception.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:使用非受控异常：应该由调用者进行检查unchecked
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Client01 {
    public static void main(String[] args) {
        Account01 account = new Account01();
        int accountTest = 10;
        if (!account.canWithDraw(accountTest)) {
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
