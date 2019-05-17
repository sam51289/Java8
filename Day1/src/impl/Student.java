package impl;

/**
 * @author Admin
 *
 */
public class Student {

	public int id;
	public String Name;
	public double totalMarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}
	public Student(int id, String name, double totalMarks) {
		super();
		this.id = id;
		Name = name;
		this.totalMarks = totalMarks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", totalMarks=" + totalMarks + "]";
	}
	
	
	
}