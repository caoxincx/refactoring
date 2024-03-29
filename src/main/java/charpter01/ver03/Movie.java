package charpter01.ver03;

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String _title;
	private int _priceCode;

	public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}

	public int getPriceCode() {
		return _priceCode;
	}

	public String getTitle() {
		return _title;
	}

	public void setPriceCode(int priceCode) {
		_priceCode = priceCode;
	}

	// 把getCharge移动过来的原因是，Movie可能发生变化，而Rental不会
	public double getCharge(int daysRented) {
		double result = 0 ;
		switch (getPriceCode()) { // 取得影片出租价格
			case Movie.REGULAR: // 普通片
				result += 2;
				if (daysRented > 2)
					result += (daysRented - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE: // 新片
				result += daysRented * 3;
				break;
			case Movie.CHILDRENS: // 儿童。
				result += 1.5;
				if (daysRented > 3)
					result += (daysRented - 3) * 1.5;
				break;
		}
		return result;
	}

	public int getFrequentRenterPoints(int daysRented) {
		// add bonus for a two day new release rental
		if ((getPriceCode() == Movie.NEW_RELEASE)
				&& daysRented > 1){
			return 2;
		}else {
			return 1;
		}
	}
}