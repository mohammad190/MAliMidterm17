package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo employeeInfo1 = new EmployeeInfo(1);
		EmployeeInfo employeeInfo2 = new EmployeeInfo("Don",3);
		EmployeeInfo employeeInfo3 = new EmployeeInfo(5,"Smith","hr",258.23,4);

		employeeInfo1.setPerformance(4);
		employeeInfo1.setSalary(8958.36);
		employeeInfo2.employeeHis();
		EmployeeInfo.calculateEmployeePension(employeeInfo3.getSalary());




	}

}
