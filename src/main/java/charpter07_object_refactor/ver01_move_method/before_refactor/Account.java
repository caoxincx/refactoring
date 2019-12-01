package charpter07_object_refactor.ver01_move_method.before_refactor;

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
        // 我要搬移的是这个函数，dayOverdraw这个字段会随着不同账户变化而变化，所以保留
        if (type.isPremium()) {
            double result = 10;
            if (dayOverdraw > 7) {
                result += (dayOverdraw - 7) * 0.85;
            }
            return result;
        }else {
            return dayOverdraw * 1.75;
        }
    }

    double bankCharge() {
        double result = 4.5;
        if (dayOverdraw > 0) {
            result += overdraftCharge();
        }
        return result;
    }
}
