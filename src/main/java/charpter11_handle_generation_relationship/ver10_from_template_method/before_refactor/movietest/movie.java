package charpter11_handle_generation_relationship.ver10_from_template_method.before_refactor.movietest;


/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/9
 * 功能描述:
 * 修改日期:2019/11/9
 * 修改描述:
 */
public abstract class movie {
    public abstract int getPriceCode();
    public abstract double getCharge(int dayRented);
    public int getFrequentRenterPoints(int dayRented ) {
        return  1;

    }
}
