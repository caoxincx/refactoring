package charpter08_organizate_data.ver05_replace_array_with_object.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/17
 * 功能描述:
 * 修改日期:2019/11/17
 * 修改描述:
 */
public class Before {
    private String[] row = new String[3];

    void setRows() {
        row[0] = "Liverpool";
        row[1] = "15";

        String name = row[0];
        int wins = Integer.parseInt(row[1]);
    }
}
