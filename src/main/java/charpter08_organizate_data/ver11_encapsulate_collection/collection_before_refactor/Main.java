package charpter08_organizate_data.ver11_encapsulate_collection.collection_before_refactor;

import java.util.HashSet;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/20
 * 功能描述:
 * 修改日期:2019/11/20
 * 修改描述:
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        HashSet<Course> objects = new HashSet<>();
        objects.add(new Course("A", true));
        objects.add(new Course("B", true));
        objects.add(new Course("C", true));
        objects.add(new Course("D", true));

        person.setCourses(objects);

        // 想了解高级课程
        int count = 0;
        for (Course object : objects) {
            if (object.isAdvanced()) count++;
        }
    }

}
