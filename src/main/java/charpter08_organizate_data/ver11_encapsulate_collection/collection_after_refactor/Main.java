package charpter08_organizate_data.ver11_encapsulate_collection.collection_after_refactor;

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
        HashSet<Course> courses = new HashSet<>();
        courses.add(new Course("xxxx", false));
        courses.add(new Course("xxxx", true));
        person.initalizeCourses1(courses);


        // refactor成
        person.addCourse(new Course("xxxx", false));
        person.addCourse(new Course("xxxx", true));
    }
}
