package schoolManagement;

public class Teachers {
	private String name;
	private static int teacherId = 0;
	private double teacherBalance;
	private int count =0;
	private int id;
	public Teachers(String name) {
		this.name = name;
		this.id = ++teacherId;
		count++;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public double getTeacherBalance() {
		return teacherBalance;
	}


	public void setTeacherBalance(double teacherBalance) {
		this.teacherBalance = teacherBalance;
	}

	public int getCount() {
		return count;
	}


	public void addBalance(double teacherSalary) {
		this.teacherBalance+= teacherSalary;
	}


	public void setCount(int count) {
		this.count = count;
	}

}
