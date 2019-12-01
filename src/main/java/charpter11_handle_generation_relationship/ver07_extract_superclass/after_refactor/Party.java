package charpter11_handle_generation_relationship.ver07_extract_superclass.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:
 * 修改日期:2019/11/28
 * 修改描述:
 */
public abstract class Party {
    protected String name;
    public String getName() {
        return name;
    }

    protected Party(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract int getAnnualCost();
}
