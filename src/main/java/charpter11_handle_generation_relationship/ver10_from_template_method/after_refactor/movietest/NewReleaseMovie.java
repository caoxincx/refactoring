package charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.movietest;

import charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.Movie;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/9
 * 功能描述:
 * 修改日期:2019/11/9
 * 修改描述:
 */
public class NewReleaseMovie extends movie {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
    public double getCharge(int dayRented ) {
        return dayRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int dayRented) {
        return dayRented > 2 ? 2: 1;
    }
}
