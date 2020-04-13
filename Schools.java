package schoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Schools {
	private double balance;
	private final double teacherSalary = 4000.00;
	private List<Teachers> teachersList = new ArrayList<>(); 
	private List<Students> studentsList = new ArrayList<>();
	

	public Schools(List<Teachers> teachersList, List<Students> studentsList) {
		super();
		this.teachersList = teachersList;
		this.setStudentsList(studentsList);
		for (Students stdnt : studentsList) {
			this.balance = this.balance + stdnt.getFeesPaid();
		}
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void paySalary(Teachers teacher) {
		for (Teachers tchr : teachersList) {
			if(tchr.equals(teacher)) {
				teacher.addBalance(getTeacherSalary());
				this.balance = getBalance() - getTeacherSalary();
				break;
			}
		}
	}
	public double getTeacherSalary() {
		return teacherSalary;
	}
	public List<Students> getStudentsList() {
		return studentsList;
	}
	public void setStudentsList(List<Students> studentsList) {
		this.studentsList = studentsList;
	}
}
