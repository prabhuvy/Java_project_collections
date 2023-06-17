package dataAndOperations;

public class Employee {
	static int count=1;
	private String id;
	private String name;
	private int age;
	private String cname;
	public Employee( String name, int age, String cname) {
		this.id = "EMP" + count;
		count++;
		this.name = name;
		this.age = age;
		this.cname = cname;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Employee.count = count;
	}
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", cname=" + cname + "]";
	}
	
	
	
	
	
	

}
