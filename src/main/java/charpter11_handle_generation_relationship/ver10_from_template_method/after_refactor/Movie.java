package charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor;

import charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.movietest.ChildrenMovie;
import charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.movietest.NewReleaseMovie;
import charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.movietest.RegularMovie;

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String _title;
	private charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.movietest.movie movie;

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode) ;
	}
	public String getTitle() {
		return _title;
	}

	public void setPriceCode(int priceCode) {
		switch (priceCode) { // 取得影片出租价格
			case REGULAR: // 普通片
				movie = new RegularMovie();
				break;
			case NEW_RELEASE: // 新片
				movie = new NewReleaseMovie();
				break;
			case CHILDRENS: // 儿童。
				movie = new ChildrenMovie();
				break;
		}

	}

	public double getCharge(int dayRented) {
		return movie.getCharge(dayRented);
	}
	public int getFrequentRenterPoints(int dayRented ) {
		return movie.getFrequentRenterPoints(dayRented);
	}
	

}