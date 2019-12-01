package charpter06_method_refactor.ver06_split_temporary_variable;

/**
 * 需求编号:2019D0519
 * 问题编号:split temporary variable
 * 开发人员: caoxin
 * 创建日期:2019/11/10
 * 功能描述:分解临时变量
 * 修改日期:2019/11/10
 * 修改描述:
 */
public class Ver01 {
    private int primaryForce;
    private int secondaryForce;
    private int mass;
    private int delay;

    // 重构前
    double getDistanceTravelled(int time){
        double result;
        double acc = primaryForce / mass;
        int primaryTime = Math.min(time, delay);
        result = 0.5 * acc * primaryTime * primaryTime;
        int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            double pirmaryVel = acc * delay;
            acc = (primaryForce + secondaryForce) / mass;
            result += pirmaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
        }
        return result;
    }
    // 重构后 这里重构的关键是 acc 这个变量被使用了两次
    double getDistanceTravelled02(int time){
        double result;
        final double primaryAcc = primaryForce / mass;
        int primaryTime = Math.min(time, delay);
        result = 0.5 * primaryAcc * primaryTime * primaryTime;
        int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            double pirmaryVel = primaryAcc * delay;
            final  double secondaryAcc = (primaryForce + secondaryForce) / mass;
            result += pirmaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
        }
        return result;
    }

    double getDistanceTravelled03(int time){
        double result = getPrimaryResult(time);
        if (getSecondaryTime(time) > 0) result += getSecondaryResult(time);
        return result;
    }

    private double getSecondaryResult(int time) {
        return getPirmaryVel(getPrimaryAcc()) * getSecondaryTime(time) + 0.5 * getSecondaryAcc() * getSecondaryTime(time) * getSecondaryTime(time);
    }

    private int getSecondaryAcc() {
        return (primaryForce + secondaryForce) / mass;
    }

    private double getPirmaryVel(double primaryAcc) {
        return primaryAcc * delay;
    }

    private int getSecondaryTime(int time) {
        return time - delay;
    }

    private double getPrimaryResult(int time) {
        return 0.5 * getPrimaryAcc() * getPrimaryTime(time) * getPrimaryTime(time);
    }

    private int getPrimaryTime(int time) {
        return Math.min(time, delay);
    }

    private int getPrimaryAcc() {
        return primaryForce / mass;
    }

}
