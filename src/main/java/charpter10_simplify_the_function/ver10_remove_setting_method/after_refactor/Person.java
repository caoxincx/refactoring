package charpter10_simplify_the_function.ver10_remove_setting_method.after_refactor;

import charpter08_organizate_data.ver11_encapsulate_collection.collection_after_refactor.Course;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:封装集合
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class Person {
    List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
