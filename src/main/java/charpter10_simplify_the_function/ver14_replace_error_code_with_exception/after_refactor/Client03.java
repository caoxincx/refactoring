package charpter10_simplify_the_function.ver14_replace_error_code_with_exception.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:使用调用者进行检查的时候，不能一次处理这么多调用方的异常时，新增函数处理。
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Client03 {
    public static void main(String[] args) {
        Account03 account = new Account03();
        int accountTest = 10;
        if (account.withDraw(accountTest) == -1) {
            handleOverDraw();
        } else {
            doTheUsalThing();
        }

    }

    private static void doTheUsalThing() {
    }

    private static void handleOverDraw() {
    }
}
