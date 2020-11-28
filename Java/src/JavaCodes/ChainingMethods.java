package JavaCodes;


class Student {
	String name;
	int grade;
	int Id;
	String username;
	String realName;
	
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	public Student setGrade(int grade) {
		this.grade = grade;
		return this;
	}
	public Student setid(int Id) {
		this.Id = Id;
		return this;
	}
	public Student setusername(String username) {
		this.username = username;
		return this;
	}
	public Student setrealName(String realName) {
		this.realName = realName;
		return this;
	}
	
}

public class ChainingMethods {	
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setusername("gorilla king223");
		s.setid(18947638);
		s.setrealName("jackson");
		s.setGrade(99);
		System.out.println(s.username);
		System.out.println(s.Id);
		System.out.println(s.realName);
		System.out.println(s.grade);
	}

}
