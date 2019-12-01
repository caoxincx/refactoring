package charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor;

import charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.statement.HtmlStatement;
import charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.statement.Statement;
import charpter11_handle_generation_relationship.ver10_from_template_method.after_refactor.statement.TextStatement;

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
		return Statement.createTextStatement().statement(this);
	}

	// 这里如果加一个htmlStatement则复用的内容就很多
	public String htmlStatement() {
		return Statement.createTextStatement().statement(this);
	}
	public double getTotalPriceCode(){
		double totalAmout = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			totalAmout += amounFor(each);
		}
		return totalAmout;
	}
	public int getTotalFrequentRenterPoints(){
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			frequentRenterPoints += getFrequentRenterPoints(each);
		}
		return frequentRenterPoints;
	}

	public int getFrequentRenterPoints(Rental rental) {
		return rental.getFrequentRenterPoints();
	}

	public double amounFor(Rental rental) {
		return rental.getPriceCode();
	}

	public Vector get_rentals() {
		return _rentals;
	}

	public void set_rentals(Vector _rentals) {
		this._rentals = _rentals;
	}
}
