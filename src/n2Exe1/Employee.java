package n2Exe1;

import java.io.Serializable;

@SerialObjectToJsonFlag (dir="json/employee.json")
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String employeeName;
	private String employeeSurname;
	private int employeePriceByHour;
	
	public Employee(String employeeName, String employeeSurname, int employeePriceByHour) {
		this.employeeName = employeeName;
		this.employeeSurname = employeeSurname;
		this.employeePriceByHour = employeePriceByHour;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeSurname() {
		return employeeSurname;
	}

	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}

	public int getEmployeePriceByHour() {
		return employeePriceByHour;
	}

	public void setEmployeePriceByHour(int employeePriceByHour) {
		this.employeePriceByHour = employeePriceByHour;
	}
	
	//Class methods
	
	public int employeeSalaryCalculation (int employeeHoursWorked) {
		return employeePriceByHour * employeeHoursWorked;
	}
	
	@Override
	public String toString() {
		return "[employeeName=" + employeeName + ", employeeSurname=" + employeeSurname
				+ ", employeePriceByHour=" + employeePriceByHour;
	}

}
