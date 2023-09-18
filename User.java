package com.application.Questionnarie.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Question_user")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String firstName;
	String lastName;
	String email;
	String username;
	String password;
	
	 @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(name = "quesuser_roles",
	        joinColumns = @JoinColumn(name = "id"),
	        inverseJoinColumns = @JoinColumn(name = "role_id"))
	    private Set<Roles> roles = new HashSet<>();
	
	
}
