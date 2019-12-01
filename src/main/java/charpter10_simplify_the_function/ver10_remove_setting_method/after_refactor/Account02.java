package charpter10_simplify_the_function.ver10_remove_setting_method.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Account02 {
    private String id;


    public Account02(String id) {
        initializeId(id);
    }

    protected void initializeId(String arg) {
        this.id = "ZZ" + arg;
    }

}
