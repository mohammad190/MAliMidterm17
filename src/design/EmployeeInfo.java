package design;

import java.util.Scanner;

public class EmployeeInfo extends Use_Abstract_Employee implements Employee{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getGetEmployeeId() {
		return getEmployeeId;
	}

	public void setGetEmployeeId(int getEmployeeId) {
		this.getEmployeeId = getEmployeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



	private int employeeId, getEmployeeId;
	private String employeeName, department;
	private double salary;

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	private int performance;

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		EmployeeInfo.companyName = companyName;
	}
/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		this.employeeId = employeeId;
		
	}
	public EmployeeInfo(String name, int employeeId){
		this.employeeName = name;
		this.employeeId = employeeId;
	}
	public EmployeeInfo(int employeeId, String employeeName, String department, double salary,int performance) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
		this.performance = performance;
	}


	/*
         * This methods should calculate Employee bonus based on salary and performance.
         * Then it will return the total yearly bonus. So you need to implement the logic.
         * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
         * You can set arbitrary number for performance.
         * So you probably need to send 2 arguments.
         *
         */
	public static double calculateEmployeeBonus(double salary, int performance ){
		double total=0;

		if(performance==5){
			total = salary*.01;
		}else if(performance==4){
			total = salary*.08;
		}else if(performance==3){
			total= salary*0.6;
		}else if (performance==2){
			total= salary*.04;
		}else if(performance==1){
			total = salary*0.2;
		}else if(performance==0){
			total = 0;
		}
		System.out.println("The total employee bonus : $" + total);
		return total;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */

	public static double calculateEmployeePension(double salary){
		double total=0;

		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();

        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        String startYear = convertedJoiningDate.substring(convertedJoiningDate.length()-4,convertedJoiningDate.length());
        String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length()-4,convertedTodaysDate.length());

        int start = Integer.parseInt(startYear);
        int current = Integer.parseInt(currentYear);

        int numOfYears = current-start;

        if(numOfYears>=5){
        	total = salary*.25;
		}else if(numOfYears==4){
        	total = salary*.20;
		}else if(numOfYears ==3){
			total = salary*.15;
		}else if(numOfYears==2){
			total = salary*1.0;
		}else if(numOfYears==1){
			total = salary*.5;
		}else {
			total = 0;
		}
		System.out.println("The pension:" + total);
		return total;

        //implement numbers of year from above two dates
		//Calculate pension
	}

	@Override
	public int employeeId() {
		return employeeId;
	}

	@Override
	public String employeeName() {
		return employeeName;
	}

	@Override
	public void assignDepartment(String departments) {
		System.out.println(" Admin ");

	}

	@Override
	public int calculateSalary() {
		return 10000;
	}

	@Override
	public void benefitLayout() {
		System.out.println(" Holiday ");

	}

	@Override
	public int employeePerformance() {
		return 3;
	}


	@Override
	public void employeeHis() {
		System.out.println("Employee history");

	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:System.out.println("New semister open");
					date = 1;
					break;
				case February:System.out.println("Need to pay for new home rent");
					date = 2;
					break;
				case March:System.out.println("New exam this month");
					date = 3;
					break;
				case April:System.out.println("almost final semister");
					date = 4;
					break;
				case May:System.out.println("Final semister is done");
					date = 5;
					break;
				case June:System.out.println("summer vaction start");
					date = 6;
					break;
				case July:System.out.println("Time spent with family");
					date = 1;
					break;
				case August:System.out.println("Going somewhere for enjoy summer vacation");
					date = 1;
					break;
				case September:System.out.println("summer is over");
					date = 1;
					break;
				case October:System.out.println("summer is over and new semister is start");
					date = 1;
					break;
				case November:System.out.println("Winter is srart in november");
					date = 1;
					break;
				case December:System.out.println("december is full time winter");
					date = 1;
					break;
				default:System.out.println("No more month is left");
					date = 0;
					break;
			}
			return date;

		}
	}
}
