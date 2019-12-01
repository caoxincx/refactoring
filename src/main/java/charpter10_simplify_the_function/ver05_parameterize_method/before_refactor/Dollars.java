package charpter10_simplify_the_function.ver05_parameterize_method.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/27
 * 功能描述:
 * 修改日期:2019/11/27
 * 修改描述:
 */
public class Dollars {
    public Dollars baseCharge() {
        double result = Math.min(lastUsage(), 100) * 0.03;
        if (lastUsage() > 100) {
            result += (Math.min(lastUsage(), 200) - 100) * 0.05;
        }
        if (lastUsage() > 200) {
            result += (lastUsage() - 200) * 0.07;
        }
        return new Dollars(result);
    }

    private int lastUsage() {
        return 0;
    }
    public Dollars(double result) {
    }
}
