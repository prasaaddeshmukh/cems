package com.cems.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	@Column(name="first_name", nullable= false)
	private String firstName ;
	@Column(name="last_name", nullable= false)
	private String lastName ;
	@Column(name="email", nullable= false)
	private String email ;
	@Column(name="password", nullable= false)
    private String password;
    @Column(name="flag", nullable= false)
    private boolean enabled;
    @Column(name="token_status", nullable= false)
    private boolean tokenExpired;
	public Student(String firstName, String lastName, String email) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public Student() {
	
}
	

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;
	
}
