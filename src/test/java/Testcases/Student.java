package Testcases;

public class Student implements Comparable<Student> {

	int id;
	String name, location;

	public Student(int sid, String sname, String slocation) {
		this.id = sid;
		this.name = sname;
		this.location = slocation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String toString() {
		return "id:" + id + " - name :" + name + " - location :" + location;
	}

	public int compareTo(Student student) {

			 
		return this.id - student.id;
	}
}
