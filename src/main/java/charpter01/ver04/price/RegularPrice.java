package charpter01.ver04.price;

import charpter01.ver04.Movie;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/11/8
 * 功能描述:
 * 修改日期:2019/11/8
 * 修改描述:
 */
public class RegularPrice extends Price {
    public int getPriceCode() {
        return Movie.REGULAR;
    }
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += ((daysRented - 2) * 1.5);
        return result;
    }
}
