package charpter08_organizate_data.ver10_encapsulate_field.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/20
 * 功能描述: 贫血模型 哑巴类 可以使用move Method将功能属于该类的方法 move到这里
 * 修改日期:2019/11/20
 * 修改描述:
 */
public class Test {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
