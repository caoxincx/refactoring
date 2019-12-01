package charpter10_simplify_the_function.ver04_separate_query_from_modifier.after_refactor;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/27
 * 功能描述:将查询函数和修改函数分离
 * 修改日期:2019/11/27
 * 修改描述:
 */
public class After {
    // 新疆查询函数
    String foundPeople(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }
            if (people[i].equals("John")) {
                return "Don";
            }
        }
        return "";
    }
    public void checkSecurity(String[] people) {
        foundMiscreant1(people);
        String foundPeople = foundPeople(people);
        someLaterCode(foundPeople);
    }
    void foundMiscreant(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                return;
            }
            if (people[i].equals("John")) {
                sendAlert();
                return;
            }
        }
    }
    void foundMiscreant1(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (foundPeople(people).equals("")) {
                sendAlert();
            }
        }
    }

    private void sendAlert() {
    }
    private void someLaterCode(String found) {
    }

    // 在并发的场景下
    // 将查询函数 和 修改函数 放在同一个函数中处理，并将该函数声明为synchronized
    // 最安全的做法是将 查询函数和修改函数 声明为private
}
