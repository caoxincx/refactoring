package charpter10_simplify_the_function.ver09_introduce_parameter_object.after_refactor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:使用范围结构使用对象替代
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Account {
    private List<Entry> entries = new ArrayList<>();

    double getFlowBetween(DateRange dateRange) {
        double result = 0;
        for (Entry entry : entries) {
            if (entry.includes(dateRange)) {
                result += entry.getValue();
            }
        }
        return result;
    }
}
