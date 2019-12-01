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
public abstract class JobItem {
    private int quantity;
    protected int getTotalPrice() {
        return quantity;
    }

    public int getQuantity() {
        return quantity;
    }


    protected boolean isLabor() {
        return false;
    }

    protected JobItem(int quantity) {
        this.quantity = quantity;
    }
}
