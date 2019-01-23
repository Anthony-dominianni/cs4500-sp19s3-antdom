package com.example.cs4500.sp19.s3.anthonydominianni.models;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	// provide a public set and get method for each of the class variables above
	// make sure to use proper naming conventions for Java methods, e.g.,
	// methods should be camelcase. Here's an example using the firstName variable:
 	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}

