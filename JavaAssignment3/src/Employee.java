
public class Employee {
	private String Id;
	private String empName;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", empName=" + empName + "]";
	}

}
