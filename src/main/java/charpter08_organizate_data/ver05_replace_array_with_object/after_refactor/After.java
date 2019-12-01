package charpter08_organizate_data.ver05_replace_array_with_object.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/17
 * 功能描述:使用对象代替数组
 * 修改日期:2019/11/17
 * 修改描述:
 */
public class After {
    public Performance row;
    void setRows() {
        row.setName("linrdfasf");
        row.setWins("15");

        String name = row.getName();
        int wins = Integer.parseInt(row.getWins());
    }
}
