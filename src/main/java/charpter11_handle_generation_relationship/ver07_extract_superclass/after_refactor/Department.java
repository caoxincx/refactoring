package charpter11_handle_generation_relationship.ver07_extract_superclass.after_refactor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Department extends Party{
    private List<Employee> staffs = new ArrayList<>();

    protected Department(String name) {
        super(name);
    }

    protected int getAnnualCost() {
        return staffs.stream().filter(Objects::nonNull).map(i->i.getAnnualCost()).reduce(0,Integer::sum);
    }
}
