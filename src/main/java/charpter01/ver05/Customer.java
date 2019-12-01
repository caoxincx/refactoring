package charpter01.ver05;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String _name; // 姓名
	private Vector _rentals = new Vector(); // 租借记

	public Customer(String name) {
		_name = name;
	};

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	}

	public String statement() {
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement(); // 取得一笔租借记。
			// determine amounts for each line
			// add frequent renter points （累计常客积点。
			// show figures for this rental（显示此笔租借记录）
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ amounFor(each) + "\n";

		}
		// add footer lines（结尾打印）
		result += "Amount owed is " + getTotalPriceCode() + "\n";
		result += "You earned " + getTotalFrequentRenterPoints()
				+ " frequent renter points";
		return result;
	}
	private double getTotalPriceCode(){
		double totalAmout = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			totalAmout += amounFor(each);
		}
		return totalAmout;
	}
	private int getTotalFrequentRenterPoints(){
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			frequentRenterPoints += getFrequentRenterPoints(each);
		}
		return frequentRenterPoints;
	}

	private int getFrequentRenterPoints(Rental rental) {
		return rental.getFrequentRenterPoints();
	}

	private double amounFor(Rental rental) {
		return rental.getPriceCode();
	}
}
