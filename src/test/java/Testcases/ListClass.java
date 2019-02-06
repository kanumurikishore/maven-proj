package Testcases;


import java.util.ArrayList;
import java.util.List;

public class ListClass {
	
	public static void main(String[] args) {
		
		Student t1=new Student(10,"iswarya", "vja");
		Student t2=new Student(12,"radhika", "hyd");
		Student t3=new Student(5,"kishore", "hyds");
		
		List<Student> studentList =new ArrayList<Student>();
		studentList.add(t1);
		studentList.add(t2);
		studentList.add(t3);
		for(Student  student : studentList)
		{
			System.out.println(student.id);
		}
		
	}
	
}
