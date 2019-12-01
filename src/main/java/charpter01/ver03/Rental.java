package charpter01.ver03;

public class Rental {
	private Movie _movie; // 影片
	private int _daysRented; // 租期

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}
	/**
	 * 第一次重构
	 * @param
	 * @return
	 */
	public double getCharge() {
		return getMovie().getCharge(_daysRented);
	}
	public int getFrequentRenterPoints() {
		return getMovie().getFrequentRenterPoints(_daysRented);
	}

}
