package charpter08_organizate_data.ver13_replace_type_code_with_classess.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/20
 * 功能描述: 使用类代替类型码
 * 修改日期:2019/11/20
 * 修改描述:
 */
public class Person {
    //public static final int O = BloodGroup.O.getCode();
    //public static final int A =  BloodGroup.A.getCode();
    //public static final int B =  BloodGroup.B.getCode();
    //public static final int AB = BloodGroup.AB.getCode();

    private BloodGroup bloodGroup;

    public Person(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
