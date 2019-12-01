package charpter01.ver05.movietest;

import charpter01.ver05.Movie;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/9
 * 功能描述:
 * 修改日期:2019/11/9
 * 修改描述:
 */
public class RegularMovie extends movie {
    public int getPriceCode() {
        return Movie.REGULAR;
    }
    public double getCharge(int dayRented ) {
        if (dayRented > 3)
            return  (dayRented - 3) * 1.5;
        else
            return 1.5;
    }

}
