package charpter07_object_refactor.ver07_introduce_foreign_method.after_refactor;

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
public class ServiceImp {
    void service() {
        Date preivousDate = new Date();
        // 这个函数本来属于Date
        Date nextDate = getNextDay(preivousDate) ;
    }
    // foreign method 应该在服务类中实现
    private Date getNextDay(Date date) {
        return new Date(date.getYear(), date.getMonth(), date.getDay() + 1);
    }
}
