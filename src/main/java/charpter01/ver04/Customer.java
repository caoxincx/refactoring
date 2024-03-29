package charpter01.ver04;

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
			// show figures for this rental（显示此笔租借记录）
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ amountFor(each) + "\n";
		}
		// add footer lines（结尾打印）
		result += "Amount owed is " + getTotalCharge() + "\n";
		result += "You earned " + getTotalFrequentRenterPoints()
				+ " frequent renter points";
		return result;
	}
	// 这里如果加一个htmlStatement则复用的内容就很多
	public String htmlStatement() {
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement(); // 取得一笔租借记。
			// show figures for this rental（显示此笔租借记录）
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ amountFor(each) + "\n";
		}
		// add footer lines（结尾打印）
		result += "Amount owed is " + getTotalCharge() + "\n";
		result += "You earned " + getTotalFrequentRenterPoints()
				+ " frequent renter points";
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			// 取得一笔租借记。
			Rental each = (Rental) rentals.nextElement();
			result +=  getFrequentRenterPoints(each);;
		}
		return result;
	}
	private double getTotalCharge(){
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			// 取得一笔租借记。
			Rental each = (Rental) rentals.nextElement();
			result += amountFor(each);
		}
		return result;
	}

	private int getFrequentRenterPoints(Rental rental) {
		return rental.getFrequentRenterPoints();
	}

	private double amountFor(Rental rental) {
		return rental.getCharge();
	}
}
