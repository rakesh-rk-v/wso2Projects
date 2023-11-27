import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String studentId;
	private String password;
	private String address;
	private String contact;
	private String age;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getFirstName() {
		        return firstName;
		    }
		    public void setFirstName(String firstName) {
		        this.firstName = firstName;
		    }
		    public String getLastName() {
		        return lastName;
		    }
		    public void setLastName(String lastName) {
		        this.lastName = lastName;
		    }

		    public String getPassword() {
		        return password;
		    }
		    public void setPassword(String password) {
		        this.password = password;
		    }
		    public String getAddress() {
		        return address;
		    }
		    public void setAddress(String address) {
		        this.address = address;
		    }
		    public String getContact() {
		        return contact;
		    }
		    public void setContact(String contact) {
		        this.contact = contact;
		    }




}
