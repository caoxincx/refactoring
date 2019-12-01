package charpter07_object_refactor.ver08_introduce_local_extension.after_refactor.ver01_subclassing;

import java.util.Date;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/14
 * 功能描述:
 * 修改日期:2019/11/14
 * 修改描述:
 */
public class MfDate extends Date {
    public MfDate(String dateString) {
        super(dateString);
    }

    public MfDate(Date date) {
        super(date.getTime());
    }
    // 在上一节中将 foreign函数使用 move method
    public Date getNextDay(Date date) {
        return new Date(date.getYear(), date.getMonth(), date.getDay() + 1);
    }
}
