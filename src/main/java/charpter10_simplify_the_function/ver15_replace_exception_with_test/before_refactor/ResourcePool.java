package charpter10_simplify_the_function.ver15_replace_exception_with_test.before_refactor;

import java.util.Stack;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/28
 * 功能描述:
 * 修改日期:2019/11/28
 * 修改描述:
 */
public class ResourcePool {
    private Stack available;
    private Stack allocated;

    Resource getResource() {
        Resource resource;
        try {
            resource = (Resource) available.pop();
            allocated.push(resource);
            return resource;
        } catch (Exception e) {
            e.printStackTrace();
            resource = new Resource();
            return resource;
        }
    }

    public Stack getAvailable() {
        return available;
    }

    public void setAvailable(Stack available) {
        this.available = available;
    }

    public Stack getAllocated() {
        return allocated;
    }

    public void setAllocated(Stack allocated) {
        this.allocated = allocated;
    }
}
