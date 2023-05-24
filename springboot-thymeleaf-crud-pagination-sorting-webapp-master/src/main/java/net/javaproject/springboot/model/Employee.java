package net.javaproject.springboot.model;

import org.springframework.data.domain.Page;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;

	@Column(name = "Salary")
	private String salary;

	@Column(name = "dept")
	private String dept;

	@Column(name = "position")
	private String pos;

	@Column(name = "contact")
	private String contact;

	@Column(name = "pic")
	private String pic;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getdept(){
		return dept;
	}
	public void setdept(String dept){
		this.dept=dept;
	}
	public String getpos(){
		return pos;
	}
	public void setpos(String pos){
		this.pos=pos;
	}
	public String getContact(){
		return contact;
	}
	public void setcontact(String contact){
		this.contact=contact;
	}
	public String getpic(){
		return pic;
	}
	public void setpic(String pic){
		this.pic=pic;
	}
    public void saveEmployee(Employee employee) {
    }
    public Employee getEmployeeById(long l) {
        return null;
    }
    public void deleteEmployeeById(long extracted) {
    }
    public Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDir) {
        return null;
    }

}
