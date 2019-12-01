package charpter08_organizate_data.ver05_replace_array_with_object.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/17
 * 功能描述:
 * 修改日期:2019/11/17
 * 修改描述:
 */
public class Performance {
    public String[] data = new String[3];

    public String getName() {
        return data[0];
    }

    public void setName(String name) {
        this.data[0] = name;
    }

    public String getWins() {
        return this.data[1];
    }

    public void setWins(String wins) {
        this.data[1] = wins;
    }
}
