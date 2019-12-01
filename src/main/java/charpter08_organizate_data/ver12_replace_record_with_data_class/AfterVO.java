package charpter08_organizate_data.ver12_replace_record_with_data_class;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/20
 * 功能描述:以数据类取代记录，可能像将数据库中的数据查询出来一样VO  哑巴类
 * 修改日期:2019/11/20
 * 修改描述:
 */
public class AfterVO {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
