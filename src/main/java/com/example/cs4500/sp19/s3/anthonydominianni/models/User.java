package com.example.cs4500.sp19.s3.anthonydominianni.models;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	
	public User(int id, String username, String password, String firstName, String lastName) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// provide a public set and get method for each of the class variables above
	// make sure to use proper naming conventions for Java methods, e.g.,
	// methods should be camelcase. Here's an example using the firstName variable:
 	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}

