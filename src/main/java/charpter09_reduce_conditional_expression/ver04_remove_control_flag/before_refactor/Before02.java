package charpter09_reduce_conditional_expression.ver04_remove_control_flag.before_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/22
 * 功能描述:
 * 修改日期:2019/11/22
 * 修改描述:
 */
public class Before02 {
    void checkSecurity(String[] people) {
        String found = "";
        for (int i = 0; i < people.length; i++) {
            if (found.equals("")) {
                if (people[i].equals("Don")) {
                    sendAlert();
                    found = "Don";
                }

                if (people[i].equals("Josn")) {
                    sendAlert();
                    found = "Josn";
                }

            }
        }
    }

    private void sendAlert() {

    }
}
