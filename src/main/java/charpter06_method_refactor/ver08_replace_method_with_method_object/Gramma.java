package charpter06_method_refactor.ver08_replace_method_with_method_object;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/10
 * 功能描述:
 * 修改日期:2019/11/10
 * 修改描述:
 */
public class Gramma {
    private final Account account;
    private int inputValue;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    public Gramma(Account account, int inputValue, int quantity, int yearToDate) {
        this.account = account;
        this.inputValue = inputValue;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    int compute() {
        getImportantValue1();
        getImportantValue2();
        importantThing();
        getImportantValue3();
        return  importantValue3 - 2 * importantValue1;
    }

    private void getImportantValue3() {
        importantValue3 =  importantValue2 * 7;
    }

    private void getImportantValue2() {
        importantValue2 =  (inputValue * yearToDate) + 100;
    }

    private void getImportantValue1() {
        importantValue1 =  (inputValue * quantity) + account.delta();
    }

    private void importantThing() {
        if (yearToDate - importantValue1 > 100) {
            importantValue2 -= 20;
        }
    }
}
