package com.assignment.one.Customer;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Setter
@Getter
@Entity
public class Customer {
	
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	@NotBlank(message="mandatory field")
	private String name;
	@NotNull(message="mandatory field")
	@Size(min=10,max=10)
	private long mobile;
	@NotBlank(message="mandatory field")
	private String city;
	@Email(message="enter a valid email")
	private String email;
	@AssertTrue
	private boolean membership;
	
	
	

}
