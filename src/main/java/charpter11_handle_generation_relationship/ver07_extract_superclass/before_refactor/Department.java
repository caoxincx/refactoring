package charpter11_handle_generation_relationship.ver07_extract_superclass.before_refactor;

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
public class Department {
    private List<Employee> staffs = new ArrayList<>();

    public int getTotalAnnualCost() {
        List<Employee> staffs = getStaffs();
        return staffs.stream().filter(Objects::nonNull).map(i->i.getAnnualCost()).reduce(0,Integer::sum);
    }

    public int getHeadCount() {
        return staffs.size();
    }

    public void addStaff(Employee employee) {
        staffs.add(employee);
    }

    public List<Employee> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Employee> staffs) {
        this.staffs = staffs;
    }
}
