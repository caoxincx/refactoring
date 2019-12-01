package charpter01.ver04;

import charpter01.ver04.price.ChildrensPrice;
import charpter01.ver04.price.NewReleasePrice;
import charpter01.ver04.price.Price;
import charpter01.ver04.price.RegularPrice;

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String _title;
	private int _priceCode;
	private Price price;

	//public movietest(String title, int priceCode) {
	//	_title = title;
	//	_priceCode = priceCode;
	//}

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}
	public int getPriceCode() {
		return price.getPriceCode();
	}

	public String getTitle() {
		return _title;
	}

	public void setPriceCode(int priceCode) {
		switch (priceCode) { // 取得影片出租价格
			case REGULAR: // 普通片
				price = new RegularPrice();
				break;
			case NEW_RELEASE: // 新片
				price = new NewReleasePrice();
				break;
			case CHILDRENS: // 儿童。
				price = new ChildrensPrice();
				break;
			default:
				throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

	// 把getCharge移动过来的原因是，Movie可能发生变化，而Rental不会
	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}
}