package charpter09_reduce_conditional_expression.ver04_remove_control_flag.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/22
 * 功能描述:以break取代简单的控制标记
 * 修改日期:2019/11/22
 * 修改描述:
 */
public class After01 {
    void checkSecurity(String[] people) {
        // 找出控制标志以break结束
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                break;
            }

            if (people[i].equals("Josn")) {
                sendAlert();
                break;
            }

        }
    }

    private void sendAlert() {

    }
}
