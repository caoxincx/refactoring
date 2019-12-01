package charpter08_organizate_data.ver13_replace_type_code_with_classess.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/20
 * 功能描述:类型码作为类的参数而且不会影响主类行为
 * 修改日期:2019/11/20
 * 修改描述:
 */
public class BloodGroup {
    public static final BloodGroup O = new BloodGroup(0);
    public static final BloodGroup A = new BloodGroup(1);
    public static final BloodGroup B = new BloodGroup(2);
    public static final BloodGroup AB = new BloodGroup(3);

    private static final BloodGroup[] values = {O,A,B,AB};

    private final int code;

    private BloodGroup(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    private static BloodGroup code(int args) {
        return values[args];
    }
}
