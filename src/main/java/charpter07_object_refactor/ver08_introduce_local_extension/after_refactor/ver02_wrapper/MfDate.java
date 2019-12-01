package charpter07_object_refactor.ver08_introduce_local_extension.after_refactor.ver02_wrapper;

import java.util.Date;
import java.util.Objects;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/14
 * 功能描述:
 * 修改日期:2019/11/14
 * 修改描述:
 */
public class MfDate {
    private Date date;

    public MfDate(Date date) {
        this.date = date;
    }

    public MfDate(String dateString) {
        date = new Date(dateString);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MfDate)) return false;
        MfDate mfDate = (MfDate) o;
        return Objects.equals(date, mfDate.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }
    // 将foreign method 搬移
    // 在上一节中将 foreign函数使用 move method
    public Date getNextDay(Date date) {
        return new Date(date.getYear(), date.getMonth(), date.getDay() + 1);
    }

    // 在处理一些函数的时，不得不想用户暴露包装
}
