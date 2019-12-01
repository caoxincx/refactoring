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
public class AccountType {
    boolean isPremium() {
        return false;
    }
    double overdraftCharge(int dayOverdraw){
        if (isPremium()) {
            double result = 10;
            if (dayOverdraw > 7) {
                result += (dayOverdraw - 7) * 0.85;
            }
            return result;
        }else {
            return dayOverdraw * 1.75;
        }
    }
}
