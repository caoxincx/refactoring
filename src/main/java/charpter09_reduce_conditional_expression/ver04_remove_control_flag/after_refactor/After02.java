package charpter09_reduce_conditional_expression.ver04_remove_control_flag.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/22
 * 功能描述:
 * 修改日期:2019/11/22
 * 修改描述:
 */
public class After02 {
    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterDo(found);
    }

    private void someLaterDo(String found) {
    }

    private String foundMiscreant(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don") || people[i].equals("Josn")) {
                sendAlert();
                return  people[i];
            }
        }
        return "";
    }

    public boolean isDonOrJosn(String name) {
        return ("Don".equals(name) || "Josn".equals(name)) ? true : false;
    }
    private void sendAlert() {

    }
}
