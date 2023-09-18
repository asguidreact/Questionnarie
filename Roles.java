package com.application.Questionnarie.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Question_role")
@Data
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int role_id;
	private String role_name;
	
	
	@ManyToMany(mappedBy = "Question_role")
    private Set<User> users = new HashSet<>();
	
}
