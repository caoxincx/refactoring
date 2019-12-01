package charpter07_object_refactor.ver05_hide_delegate.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:将委托隐藏
 * 开发人员: caoxin
 * 创建日期:2019/11/14
 * 功能描述:
 * 修改日期:2019/11/14
 * 修改描述:
 */
public class Person {
    private Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person getManager() {
        return department.getManager();
    }

}
