package schoolManagement;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagementTest {

	public static void main(String[] args) {
		
		Teachers teacher1 = new Teachers("Jennifer");
		Teachers teacher2 = new Teachers("Steve");
		Teachers teacher3 = new Teachers("Ahmet");
		
		 List<Teachers> teachersList = new ArrayList<>(); 
		 teachersList.add(teacher1);
		 teachersList.add(teacher2);
		 teachersList.add(teacher3);
		 
		 Students student1 = new Students("Jack");
		 Students student2 = new Students("Mary");
		 Students student3 = new Students("Peter");
		 
		 student1.pay(12000);
		 student1.pay(3000);
		 student2.pay(8000);
		 student3.pay(12000);
		 student3.pay(5000);
		 
		 
		 List<Students> studentsList = new ArrayList<>();
		 studentsList.add(student1);
		 studentsList.add(student2);
		 studentsList.add(student3);
		 
		 Schools ttm = new Schools(teachersList, studentsList);
		 ttm.paySalary(teacher3);
		 ttm.paySalary(teacher2);
		 System.out.println(ttm.getBalance());
		 System.out.println(teacher2.getTeacherBalance());
		 System.out.println(teacher3.getTeacherBalance());
		 System.out.println(student1.getFeesPaid());
		 
		 System.out.println("----------------------------------------------");
		 System.out.println("Students Report:");
		 for (Students student : studentsList) {
			System.out.println(student.getId() + " " + student.getName() + " " + "must pay : " + (student.getFeesTotal() - student.getFeesPaid()));
		}
		 System.out.println("----------------------------------------------");
		 System.out.println("Teachers Report:");
		 for (Teachers teacher : teachersList) {
				System.out.println(teacher.getId() + " " + teacher.getName() + " " + " has received : " + teacher.getTeacherBalance());
			}
		 System.out.println("----------------------------------------------");
		 System.out.println("School Balance:");
		 System.out.println(ttm.getBalance());
	}

}
