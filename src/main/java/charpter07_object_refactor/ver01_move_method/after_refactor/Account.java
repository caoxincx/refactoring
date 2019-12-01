package charpter07_object_refactor.ver01_move_method.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/12
 * 功能描述:
 * 修改日期:2019/11/12
 * 修改描述:
 */
public class Account {
    private AccountType type;
    private int dayOverdraw;
    double overdraftCharge(){
        return type.overdraftCharge(dayOverdraw);
    }

    double bankCharge() {
        double result = 4.5;
        if (dayOverdraw > 0) {
            result += type.overdraftCharge(dayOverdraw);
        }
        return result;
    }
}
