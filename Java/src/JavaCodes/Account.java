package JavaCodes;


public class Account {
	String name; 
	int age;
	String car;
	int id;
	int phoneNumber;
	String AccountNumber;
	
	
	public static void main(String[] args) {
	
		
		Account tag = new Account();
		
		tag.setName("jackson");
		tag.setAge (32);
		tag.setPhoneNumber(222-464-890);
		tag.setId(7364764);
		tag.setCar("tesla");
		System.out.println(tag.getName());
		System.out.println(tag.getAge());
		System.out.println(tag.getId());
		System.out.println(tag.getCar());
		System.out.println(tag.getPhoneNumber());
		

		
		
		
	

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


	public String getCar() {
		return car;
	}


	public void setCar(String car) {
		this.car = car;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAccountNumber() {
		return AccountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}


	@Override
	public String toString() {
		return "Account [name=" + name + ", age=" + age + ", car=" + car + ", id=" + id + ", phoneNumber=" + phoneNumber
				+ ", AccountNumber=" + AccountNumber + "]";
	}
	
	
}