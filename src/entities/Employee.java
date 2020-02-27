package entities;

public class Employee {

	private String name;
	private Integer hours;
	private Double valueporhours;
	
	public Employee() {
		
	}

	public Employee(String name, Integer hours, Double valueporhours) {
		this.name = name;
		this.hours = hours;
		this.valueporhours = valueporhours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValueporhours() {
		return valueporhours;
	}

	public void setValueporhours(Double valueporhours) {
		this.valueporhours = valueporhours;
	}
	
	public double payment() {
		return valueporhours * hours;
	}
	
	
}
