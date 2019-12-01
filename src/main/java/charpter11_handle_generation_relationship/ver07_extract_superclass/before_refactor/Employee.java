package charpter11_handle_generation_relationship.ver07_extract_superclass.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Employee {
    private String name;
    private int annualCost;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnnualCost() {
        return annualCost;
    }

    public void setAnnualCost(int annualCost) {
        this.annualCost = annualCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Employee(String name, int annualCost, String id) {
        this.name = name;
        this.annualCost = annualCost;
        this.id = id;
    }
}
