package charpter11_handle_generation_relationship.ver07_extract_superclass.after_refactor2;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Employee extends Party {
    private int annualCost;
    private String id;

    protected int getAnnualCost() {
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
        super(name);
        this.annualCost = annualCost;
        this.id = id;
    }
}
