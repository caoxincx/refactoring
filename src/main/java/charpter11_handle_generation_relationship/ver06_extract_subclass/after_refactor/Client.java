package charpter11_handle_generation_relationship.ver06_extract_subclass.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Client {
    public static void main(String[] args) {
        // 原来
        //JobItem jobItem = new JobItem(5, 5, new Employee(5), true);
        //JobItem jobItem = new JobItem(5, 5, new Employee(5), true);
        // 改为
        //JobItem jobItem = new JobItem(5);
        // 改为
        //LaborItem laborItem = new LaborItem(5, 5, new Employee(5), true);
        // 改为
        LaborItem laborItem = new LaborItem(5, new Employee(5));

    }
}
