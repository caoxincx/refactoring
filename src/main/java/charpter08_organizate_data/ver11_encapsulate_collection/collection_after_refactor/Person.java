package charpter08_organizate_data.ver11_encapsulate_collection.collection_after_refactor;

import org.testng.Assert;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/20
 * 功能描述:
 * 修改日期:2019/11/20
 * 修改描述:
 */
public class Person {
    private Set<Course> courses = new HashSet<>();

    public Set<Course> getCourses() {
        return Collections.unmodifiableSet(courses);
    }

    public void initalizeCourses1(Set<Course> courses) {
        Assert.assertTrue(courses.isEmpty());
        for (Course cours : courses) {
            courses.add(cours);
        }
    }

    public void initalizeCourses2(Set<Course> courses) {
        courses.addAll(courses);
    }

    // 添加适合的删除和增加函数
    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public int getAdvancedCourse() {
        int count = 0;
        for (Course object : courses) {
            if (object.isAdvanced()) count++;
        }
        return count;
    }

    public int numbersCourse() {
        return courses.size();
    }
}
